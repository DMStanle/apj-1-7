package edu.byui.apj.week2;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;


    public void StartGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9... Please take a guess.");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            int p1Guess = p1.Guess();
            int p2Guess = p2.Guess();
            int p3Guess = p3.Guess();
            System.out.println("Player 1 guessed " + p1Guess);
            System.out.println("Player 2 guessed " + p2Guess);
            System.out.println("Player 3 guessed " + p3Guess);

            boolean p1isRight = false;
            boolean p2isRight = false;
            boolean p3isRight = false;

            if (p1Guess == targetNumber) {
                p1isRight = true;
            }
            if (p2Guess == targetNumber) {
                p2isRight = true;
            }
            if (p3Guess == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player 1 was correct? " + p1isRight);
                System.out.println("Player 2 was correct? " + p2isRight);
                System.out.println("Player 3 was correct? " + p3isRight);
                break;
              } else {
                System.out.println("Players will have to try again.");
            }

        }
    }

}
