package facades;

import utils.EMF_Creator;
import entities.RenameMe;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Settings;
import utils.EMF_Creator.DbSelector;
import utils.EMF_Creator.Strategy;

//Uncomment the line below, to temporarily disable this test
//@Disabled
public class StarWarsFacadeTest {

    private static EntityManagerFactory emf;
    private static StarWarsFacade facade;

    public StarWarsFacadeTest() {
    }

    @BeforeAll
    public static void setUpClassV2() {
        emf = EMF_Creator.createEntityManagerFactory(DbSelector.TEST, Strategy.DROP_AND_CREATE);
        facade = StarWarsFacade.getFacade();
    }

    @AfterAll
    public static void tearDownClass() {
//        Clean up database after test is done or use a persistence unit with drop-and-create to start up clean on every test
    }

    @Test
    public void fetchPerson() throws IOException, InterruptedException, ExecutionException {
        assertEquals("19BBY", facade.fetchPerson(1).getBirth_year());
    }

}
