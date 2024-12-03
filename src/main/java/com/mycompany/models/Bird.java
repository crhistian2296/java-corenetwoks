package com.mycompany.models;

public class Bird extends Animal {
    private boolean doFly;

    public Bird(String name, String race, double weight, double height, boolean isMithic, boolean doFly) {
        super(name, race, weight, height, isMithic);
        this.doFly = doFly;
    }
}
