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
    private double height;
    private double mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private Object homeworld;
    private Object species;
    private LinkedList<Object> starships; 
    private LinkedList<Object> vehicles; 



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
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

    public Object getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Object homeworld) {
        this.homeworld = homeworld;
    }

    public Object getSpecies() {
        return species;
    }

    public void setSpecies(Object species) {
        this.species = species;
    }

    public LinkedList<Object> getStarships() {
        return starships;
    }

    public void setStarships(LinkedList<Object> starships) {
        this.starships = starships;
    }

    public void addStarships(Starship starship) {
        this.starships.add(starship);
    }

    public LinkedList<Object> getVehicles() {
        return vehicles;
    }

    public void setVehicles(LinkedList<Object> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicles(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

}
