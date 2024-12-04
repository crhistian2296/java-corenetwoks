package com.mycompany.models;

public class Mamal extends Animal {
    private int legs;

    public Mamal(int legs) {
        this.legs = legs;
    }

    public Mamal(String name, String race, double weight, double height, boolean isMithic, int legs) {
        super(name, race, weight, height, isMithic);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs un mamifero";
    }
}
