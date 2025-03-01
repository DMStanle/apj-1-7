package edu.byui.apj.week4;

public class Cat extends Pet {

    @Override
    public String speak() {
        return getName() + (isVaccinated ? " says Meow!" : " says Hiss!");
    }

    @Override
    public void setName(String name) {
        super.setName(name + " the Cat");
    }
}
