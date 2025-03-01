package edu.byui.apj.week2;

public class Player {
    int number;

    public int Guess() {
        number = (int) (Math.random() * 10);
        return number;

    }
}
