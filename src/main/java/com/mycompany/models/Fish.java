package com.mycompany.models;

public class Fish extends Animal {
    private int numEyes;

    public Fish(int numEyes) {
        this.numEyes = numEyes;
    }

    public Fish(String name, String race, double weight, double height, boolean isMithic, int numEyes) {
        super(name, race, weight, height, isMithic);
        this.numEyes = numEyes;
    }

    public int getNumEyes() {
        return numEyes;
    }

    public void setNumEyes(int numEyes) {
        this.numEyes = numEyes;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs un pez";
    }
}
