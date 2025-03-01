package edu.byui.apj.week4.pets;

public class Dog extends AbstractPet {
    @Override
    public void speak() {
        System.out.println(getName() + " says Woof!");
    }
}
