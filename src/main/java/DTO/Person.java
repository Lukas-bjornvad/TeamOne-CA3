/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.LinkedList;

/**
 *
 * @author Lukas Bjornvad
 */
public class Person {

    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private Planet homeworld;
    private Species species;
    private LinkedList<Starship> starships; 
    private LinkedList<Vehicle> vehicles; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Planet getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Planet homeworld) {
        this.homeworld = homeworld;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public LinkedList<Starship> getStarships() {
        return starships;
    }

    public void setStarships(LinkedList<Starship> starships) {
        this.starships = starships;
    }

    public void addStarships(Starship starship) {
        this.starships.add(starship);
    }

    public LinkedList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(LinkedList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicles(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

}
