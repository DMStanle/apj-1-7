package edu.byui.apj.week2;

public class CatTest {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Ranger", "American Shorthair", (byte)7, true);
        cats[1] = new Cat("Bandit", "American Shorthair", (byte)7, true);
        cats[2] = new Cat("Mellow", "Ragdoll",(byte)3, false);

        for (Cat cat : cats) {
            System.out.println(cat);
            cat.speak();
        }

        cats[0].age = 1000;
        System.out.println(cats[0]);

        cats[0] = null;
        cats[0].speak();

    }
}
