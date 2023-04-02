package org.exercise;

import org.practice.Student;

public class Terminal {

    public static void log(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Paul", 26, "Math");
        Student student2 = new Student("Andriy", 21, "Basketball");
        Student student3 = new Student();

        student1.age = 11;
        student1.setName("Gerald");
        System.out.println(student1.age);
        System.out.println(student1.getName());
        student1.getAge();
    }
}
