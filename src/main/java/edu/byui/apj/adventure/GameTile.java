package edu.byui.apj.adventure;

public class GameTile {
    private final String terrain;
    private GameTile north;
    private GameTile east;
    private GameTile south;
    private GameTile west;
    private Item item;
    private boolean isVisited = false;
    private Obstacle obstacle;

    public GameTile(String terrain) {
        this.terrain = terrain;
    }

    public GameTile(String terrain, Item item, Obstacle obstacle) {
        this.terrain = terrain;
        this.item = item;
        this.obstacle = obstacle;
    }

    public boolean canGetItem(Player player) {
        return (item != null && obstacle == null);
    }

    public String getTerrain() {
        return terrain;
    }

    public GameTile getNorth() {
        return north;
    }

    public void setNorth(GameTile north) {
        this.north = north;
    }

    public GameTile getEast() {
        return east;
    }

    public void setEast(GameTile east) {
        this.east = east;
    }

    public GameTile getSouth() {
        return south;
    }

    public void setSouth(GameTile south) {
        this.south = south;
    }

    public GameTile getWest() {
        return west;
    }

    public void setWest(GameTile west) {
        this.west = west;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        this.isVisited = visited;
    }

    public String showTile() {
        if (isVisited) {
            return terrain;
        } else {
            return "********";
        }
    }

    public boolean hasItem() {
        return item != null;
    }

    public void removeItem() {
        item = null;
    }
}
