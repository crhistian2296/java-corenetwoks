package com.mycompany.models;

public class Reptile extends Animal {
    private boolean terrestrial;

    public Reptile(boolean terrestrial) {
        this.terrestrial = terrestrial;
    }

    public Reptile(String name, String race, double weight, double height, boolean isMithic, boolean terrestrial) {
        super(name, race, weight, height, isMithic);
        this.terrestrial = terrestrial;
    }

    public boolean isTerrestrial() {
        return terrestrial;
    }

    public void setTerrestrial(boolean terrestrial) {
        this.terrestrial = terrestrial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs un reptil";
    }
}
