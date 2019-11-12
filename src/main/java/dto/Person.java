/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.LinkedList;

/**
 *
 * @author Simon Norup
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
    private String homeworld;
    private LinkedList<String> species;
    private LinkedList<String> starships; 
    private LinkedList<String> vehicles; 

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getMass() {
        return mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public LinkedList<String> getSpecies() {
        return species;
    }

    public LinkedList<String> getStarships() {
        return starships;
    }

    public LinkedList<String> getVehicles() {
        return vehicles;
    }
    
    
}
