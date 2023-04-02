package org.oop;

public class CarAudi extends Car{

    //overriding
    void display(){
        System.out.println("Nama mobil : " + this.name);
        System.out.println("Nama engine : " + this.engine);
        System.out.println("Nama dealer : " + this.dealer);
    }
}
