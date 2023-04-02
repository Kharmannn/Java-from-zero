package org.practice;

public class Weapon {

    private String name;
    private int damage;

    Weapon(String inputName, int inputDamage){
        this.name = inputName;
        this.damage = inputDamage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
