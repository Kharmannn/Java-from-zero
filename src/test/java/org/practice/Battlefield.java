package org.practice;

public class Battlefield {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Gandalf");
        Armor armor1 = new Armor("Perisai", 50);
        Weapon weapon1 = new Weapon("Sword", 35);

        Hero hero2 = new Hero("Trent");

        hero1.setArmor(armor1);
        hero1.heroStatus();
        //only to print the empty line
        System.out.println(" ");

        hero1.setWeapon(weapon1);
        hero1.attackPlayer(hero2);

        hero2.setArmor(armor1);
        hero2.heroStatus();
        ;
    }
}
