package org.oop;

public class Car {
    String name;
    String engine;
    String dealer;

    //overriding
    void display(){
        System.out.println("Nama mobil : " + this.name);
        System.out.println("Nama engine : " + this.engine);
    }
}
