package com.mycompany.models;

public class Amphibian extends Animal {
    private String color;

    public Amphibian(String color) {
        this.color = color;
    }

    public Amphibian(String name, String race, double weight, double height, boolean isMithic, String color) {
        super(name, race, weight, height, isMithic);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs un anfibio";
    }
}
