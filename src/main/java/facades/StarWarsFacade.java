package facades;

import DTO.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import utils.DataFetcher;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class StarWarsFacade {

    private static StarWarsFacade instance;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static ExecutorService ES;
    private static Queue<Future<Object>> futures;

    //Private Constructor to ensure Singleton
    private StarWarsFacade() {
    }

    public static StarWarsFacade getFacade() {
        if (instance == null) {
            instance = new StarWarsFacade();
        }
        return instance;
    }

    public PersonDTO fetchPerson(int id) throws IOException, InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();
        ES = Executors.newCachedThreadPool();
        futures = new ArrayBlockingQueue<>(20); // we do not know how many elements we'll need - can we avoid fixed queue size?

        String url = "https://swapi.co/api/people/" + id;
        Person person = DataFetcher.fetchAsObject(Person.class, url); // Person with urls as children
        PersonDTO result = new PersonDTO(person); // Person with objects as children

        DataFetcher.submitFetchForExecution(ES, futures, person.getHomeworld(), Planet.class);
        DataFetcher.submitFetchesForExecution(ES, futures, person.getSpecies(), Species.class);
        DataFetcher.submitFetchesForExecution(ES, futures, person.getStarships(), Starship.class);
        DataFetcher.submitFetchesForExecution(ES, futures, person.getVehicles(), Vehicle.class);

        while (!futures.isEmpty()) {
            Future<Object> future = futures.poll();
            if (future.isDone()) {
                Object obj = future.get();
                if (obj instanceof Planet) {
                    result.setHomeworld((Planet) obj);
                } else if (obj instanceof Species) {
                    result.addSpecies((Species) obj);
                } else if (obj instanceof Starship) {
                    result.addStarships((Starship) obj);
                } else if (obj instanceof Vehicle) {
                    result.addVehicles((Vehicle) obj);
                }
            } else {
                futures.add(future);
            }
        }

        ES.shutdown();
        System.out.println("Execution time: " + ((double) (System.currentTimeMillis() - startTime) / 1000.) + " seconds...");
        return result;
    }

}