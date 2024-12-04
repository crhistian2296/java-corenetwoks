package com.mycompany.models;

public class Phoenix extends Bird {
    private boolean alive;

    public Phoenix(String name, String race, double weight, double height, boolean isMithic, boolean doFly, boolean alive) {
        super(name, race, weight, height, isMithic, doFly);
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String eat() {
        System.out.println(super.eat() + " sulfur");
        return null;
    }
}
