package edu.byui.apj.adventure;

public class GameLauncher {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.start();

    }
}
