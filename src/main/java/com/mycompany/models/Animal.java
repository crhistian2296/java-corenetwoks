package com.mycompany.models;

public class Animal {
//    Principio de ocultacion
//    Campos de clas
    String name, race;
    double weight, height;
    boolean isMithic;

    public Animal(String name, String race, double weight, double height, boolean isMithic) {
        this.name = name;
        this.race = race;
        this.weight = weight;
        this.height = height;
        this.isMithic = isMithic;
    }

    public Animal() {}

//    Setters
    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMithic() {
        return isMithic;
    }
}
