package edu.byui.apj.week4;

public class Dog extends Pet {
    @Override
    public String speak() {
        return getName() + " says Woof!";
    }
}
