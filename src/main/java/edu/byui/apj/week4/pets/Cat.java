package edu.byui.apj.week4.pets;

public class Cat extends AbstractPet implements Huggable {


    @Override
    public void speak() {
        if(isVaccinated) {
            System.out.println(getName() + " says Meow!");
        } else {
            System.out.println(getName() + " says Hiss!");
        }
    }

    @Override
    public void setName(String name) {
        super.setName(name + " the Cat");
    }

    public void  hug() {
        System.out.println(getName() + " has been hugged.");
    }
}
