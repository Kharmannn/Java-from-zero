package org.practice;

public class Armor {

    private String name;
    private int strength;

    Armor(String inputName, int inputStrength){
        this.name = inputName;
        this.strength = inputStrength;
    }

    public String getName() {
        return this.name;
    }

    public int getStrength() {
        return this.strength;
    }
}
