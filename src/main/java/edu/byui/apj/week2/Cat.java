package edu.byui.apj.week2;

public class Cat {
    String name;
    String breed;
    int age;
    boolean isFriendly;

    public Cat(String name, String breed, short age, boolean isFriendly) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    public void speak() {
        if (isFriendly) {
            System.out.println("Meow");

        }
        else {
            System.out.println("Hiss");
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + " Breed: " + breed + " Age: " + age + " Friendly? " + isFriendly;

    }

}
