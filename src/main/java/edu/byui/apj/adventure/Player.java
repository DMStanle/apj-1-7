package edu.byui.apj.adventure;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private GameTile location;
    private List<Item> inventory = new ArrayList<>();
    private final GameMap gameMap;

    public Player(GameMap gameMap) {
        this.gameMap = gameMap;
        init();
    }

    private void init() {
        this.location = gameMap.getGameTiles()[4];
        this.location.setVisited(true);
    }

    public void showMap() {
        gameMap.showMap(location);
    }

    public GameTile getLocation() {
        return location;
    }

    public void setLocation(GameTile location) {
        this.location = location;
    }

    public void travel(String direction) {
        if (direction.equalsIgnoreCase("N")) {
            if (location.getNorth() != null) {
                location = location.getNorth();
                location.setVisited(true);
                System.out.println("You moved north to: " + location.getTerrain());
            } else {
                System.out.println("You cannot travel in that direction.");
            }
        } else if (direction.equalsIgnoreCase("E")) {
            if (location.getEast() != null) {
                location = location.getEast();
                location.setVisited(true);
                System.out.println("You moved east to: " + location.getTerrain());
            } else {
                System.out.println("You cannot travel in that direction.");
            }
        } else if (direction.equalsIgnoreCase("S")) {
            if (location.getSouth() != null) {
                location = location.getSouth();
                location.setVisited(true);
                System.out.println("You moved south to: " + location.getTerrain());
            } else {
                System.out.println("You cannot travel in that direction.");
            }
        } else if (direction.equalsIgnoreCase("W")) {
            if (location.getWest() != null) {
                location = location.getWest();
                location.setVisited(true);
                System.out.println("You moved west to: " + location.getTerrain());
            } else {
                System.out.println("You cannot travel in that direction.");
            }
        } else {
            System.out.println("Invalid direction. Use N, E, S, or W.");
        }
    }

    public void showInventory() {
        System.out.println("Your Inventory:");
        for (Item item : inventory) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }
    public void getItem() {
        if (location.canGetItem(this)) {
            Item item = location.getItem();
            inventory.add(item);
            System.out.println(item.getName() + " was added to inventory.");
            location.removeItem();
        } else if (location.getObstacle() != null) {
            System.out.println("You cannot get that item yet.");
        } else {
            System.out.println("There is nothing to get here.");
        }
    }

    public List<Item> getInventory() {
        return inventory;
    }
}
