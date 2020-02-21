package io.zipcoder.polymorphism;

public class Pet {

    private String name;

    public Pet() {

    }
    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("pet");
    }
}
