package org.practice;

import java.util.Arrays;

public class Hero {

    private int health;
    private String name;
    private Armor armor;
    private Weapon weapon;

    Hero(String inputName){
        this.health = 100;
        this.name = inputName;
    }

    public void heroStatus(){
        System.out.println("Name : " + this.name);
        System.out.println("Max Health : " + maxHealth());
        System.out.println("Armor equipped : " + armor.getName());
        System.out.println("Armor strength : " + armor.getStrength());
    }
    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.health + this.armor.getStrength();
    }

    public void attackPlayer(Hero opponent){
        opponent.health = opponent.health - this.weapon.getDamage();
    }

    public void resetPlayer(){
        this.health = 100;
    }
}
