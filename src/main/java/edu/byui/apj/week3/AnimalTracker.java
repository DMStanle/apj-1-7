package edu.byui.apj.week3;
import java.util.ArrayList;

public class AnimalTracker {

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("George", 6));
        animalList.add(new Animal("Fluffy", 3));
        animalList.add(new Animal("Rover", 17));
        animalList.add(new Animal("Pork Chop", 5));
        animalList.add(new Animal("Garfield", 1));

        for (Animal animal : animalList) {
            System.out.println("Name: " + animal.getName() + ", Age: " + animal.getAge());
        }

        int count = 0;
        for (Animal animal : animalList) {
            if (animal.getName().length() > 5 && animal.getAge() > 5 ) {
                count++;
            }
        }
         if (count > 1) {
             System.out.println("There are " + count + " animals who are more than 5 years old and have more than 5 letters in their name.");
         } else {
             System.out.println("There is " + count + " animal who is more than 5 years old and has more than 5 letters in its name.");
         }

         animalList.remove(2);
         System.out.println(animalList);

        Animal oldestAnimal = animalList.get(0);

        for (Animal animal : animalList) {
            if (animal.getAge() > oldestAnimal.getAge()) {
                oldestAnimal = animal;
            }
        }
        System.out.println("The oldest animal is: " + oldestAnimal.getName() + ", Age: " + oldestAnimal.getAge());

    }
}