package com.mycompany.models;

public class Penguin extends Bird{
    private boolean paired = false;

    public boolean isPaired() {
        return paired;
    }

    public void setPaired(boolean paired) {
        this.paired = true;
    }

    public Penguin(String name, String race, double weight, double height, boolean isMithic, boolean doFly, boolean paired) {
        super(name, race, weight, height, isMithic, doFly);
        this.paired = paired;
    }

    @Override
    public String eat() {
        System.out.println(super.eat() + " fish");
        return null;
    }
}
