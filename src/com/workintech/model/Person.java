package com.workintech.model;

public class Person {
    // instance variable(field)
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    public String[] pets;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor Overload
    public Person(String firstName, String lastName, int age, double salary, boolean isMarried, String[] pets) {
        this(firstName, lastName, age);
        this.salary = salary;
        this.isMarried = isMarried;
        this.pets = pets;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public double getSalary(){
        return salary;
    }
}