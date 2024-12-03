package com.mycompany.models;

public class Animal {
//    Principio de ocultacion
//    Campos de clas
    String name, race;
    double weight, height;
    boolean isMithic;

    public Animal() {
        this.name = "";
        this.race = "";
        this.weight = 0;
        this.height = 0;
        this.isMithic = false;
    }

    public Animal(String name, String race, double weight, double height, boolean isMithic) {
        this.name = name;
        this.race = race;
        this.weight = weight;
        this.height = height;
        this.isMithic = isMithic;
    }

//    Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMithic(boolean mithic) {
        isMithic = mithic;
    }

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

    @Override
    public String toString() {
        return "Name: " + name + ", Race: " + race + ", Weight: " + weight + ", Height: " + height;
    }
}
