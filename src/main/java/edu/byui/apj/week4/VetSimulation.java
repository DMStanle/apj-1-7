package edu.byui.apj.week4;
import java.util.ArrayList;
import java.util.List;
public class VetSimulation {

    void giveShots(List<Pet> pets) {
        for (Pet pet : pets) {
            pet.doVaccination();
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cat1.setName("Hershey");
        cat2.setName("Clementine");
        dog1.setName("Molly");
        dog2.setName("Precious");

        List<Pet> myPets = new ArrayList<>();

        myPets.add(cat1);
        myPets.add(cat2);
        myPets.add(dog1);
        myPets.add(dog2);

        VetSimulation shots = new VetSimulation();
        shots.giveShots(myPets);


    }
}
