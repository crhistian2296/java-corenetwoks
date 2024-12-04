package com.mycompany.models;

public class Bird extends Animal {
    private boolean doFly;

    public Bird(String name, String race, double weight, double height, boolean isMithic, boolean doFly) {
        super(name, race, weight, height, isMithic);
        this.doFly = doFly;
    }

    public boolean isDoFly() {
        return doFly;
    }

    public void setDoFly(boolean doFly) {
        this.doFly = doFly;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs un pajaro";
    }
}
