package org.practice;

import org.exercise.Terminal;

public class Student {

    private String name;
    public int age;
    private String major;
    private static int numberOfStudent;

    public Student(String inputName, int inputAge, String inputMajor) {
        this.name = inputName;
        this.age = inputAge;
        this.major = inputMajor;
        Student.numberOfStudent++;
    }

    //overloading constructor
    public Student(){
        this.name = "Student";
        Student.numberOfStudent++;
    }

    public String getName(){
        return this.name;
    }
    public void getAge(){
        System.out.println(this.age);
    }
    public void getMajor(){
        System.out.println(this.major);
    }
    public void getNumberOfStudent(){
        System.out.println(numberOfStudent);
    }

    public void setName(String inputName){
        this.name = inputName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public static void main(String[] args) {

        Terminal print = new Terminal();
        Student st1 = new Student("Aria", 15, "Finance");
        st1.name = "Armand";
//        print.log(st1.getName());
    }

}
