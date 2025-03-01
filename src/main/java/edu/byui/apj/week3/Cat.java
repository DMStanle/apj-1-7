package edu.byui.apj.week3;

public class Cat {
    private String name = "Unknown";
    private String breed = "Stray";
    private int age = 0;
    private boolean isFriendly = false;
    private int feedCount = 0;

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        if (cat1 == cat2) {
            System.out.println("Yes, they are the same.");
        } else {
            System.out.println("No, they are not the same.");
        }

        if (cat1.equals(cat2)) {
            System.out.println("Yes, they are the same.");
        } else {
            System.out.println("No, they are not the same.");
        }

        for (int i = 0; i < 5; i++) {
            int newFeedCount = cat1.feed("chicken");
            System.out.println("The cat was fed " + newFeedCount + " times.");
        }
        System.out.println(cat1);
    }

    public int feed(String food) {
        feedCount++;
        isFriendly = true;

        if (feedCount <= 3) {
            System.out.println("The cat ate the " + food + ".");
        } else {
            System.out.println("This cat cannot eat another bite!");

        }
        return feedCount;

    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFriendly() {
        return this.isFriendly;
    }
    public void setFriendly(boolean isFriendly) {
        this.isFriendly = isFriendly;
    }

    @Override
    public String toString() {
        return "Cat { " +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                ", feedCount=" + feedCount +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat otherCat)) {
            return false;
        }

        return this.name.equals(otherCat.name);
    }

}
