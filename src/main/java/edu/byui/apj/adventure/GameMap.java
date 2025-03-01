package edu.byui.apj.adventure;

public class GameMap {

    private GameTile[] gameTiles = new GameTile[9];
    private Item winningItem;

    public GameMap() {
        init();
    }

    public Item getWinningItem() {
        return winningItem;
    }

    public GameTile[] getGameTiles() {
        return gameTiles;
    }

    public void setGameTiles(GameTile[] gameTiles) {
        this.gameTiles = gameTiles;
    }

    private void init() {

        Item amuletOfPower = new Item("Amulet of Power");
        Item lumpOfCoal = new Item("Lump of Coal");
        Item fishingPole = new Item("Fishing Pole");
        Item oldRaft = new Item("Old Raft");
        Item swordOfJustice = new Item("Sword of Justice");
        Item ermineCloak = new Item("Ermine Cloak");
        Item goldKey = new Item("Gold Key");
        Item thickSoledBoots = new Item("Thick-Soled Boots");
        Item scarf = new Item("Scarf");

        winningItem = amuletOfPower;

        Obstacle obstacle0 = new Obstacle("Wooden Chest", goldKey);
        Obstacle obstacle1 = new Obstacle("Snowstorm", ermineCloak);
        Obstacle obstacle2 = new Obstacle("Freezing Man in Hut", lumpOfCoal);
        Obstacle obstacle3 = new Obstacle("Scorpion", thickSoledBoots);
        Obstacle obstacle4 = null;
        Obstacle obstacle5 = new Obstacle("Kobold", swordOfJustice);
        Obstacle obstacle6 = new Obstacle("Dust Storm", scarf);
        Obstacle obstacle7 = new Obstacle("Fishing Dock", fishingPole);
        Obstacle obstacle8 = new Obstacle("Wide River", oldRaft);

        gameTiles[0] = new GameTile("DESERT", amuletOfPower, obstacle0);
        gameTiles[1] = new GameTile("MOUNTAIN", lumpOfCoal, obstacle1);
        gameTiles[2] = new GameTile("MOUNTAIN", fishingPole, obstacle2);
        gameTiles[3] = new GameTile("DESERT", oldRaft, obstacle3);
        gameTiles[4] = new GameTile("FOREST", swordOfJustice, obstacle4);
        gameTiles[5] = new GameTile("FOREST", ermineCloak, obstacle5);
        gameTiles[6] = new GameTile("DESERT", goldKey, obstacle6);
        gameTiles[7] = new GameTile("LAKE", thickSoledBoots, obstacle7);
        gameTiles[8] = new GameTile("RIVER", scarf, obstacle8);


        gameTiles[0].setNorth(null);
        gameTiles[0].setEast(gameTiles[1]);
        gameTiles[0].setSouth(gameTiles[3]);
        gameTiles[0].setWest(null);

        gameTiles[1].setNorth(null);
        gameTiles[1].setEast(gameTiles[2]);
        gameTiles[1].setSouth(gameTiles[4]);
        gameTiles[1].setWest(gameTiles[0]);

        gameTiles[2].setNorth(null);
        gameTiles[2].setEast(null);
        gameTiles[2].setSouth(gameTiles[5]);
        gameTiles[2].setWest(gameTiles[1]);

        gameTiles[3].setNorth(gameTiles[0]);
        gameTiles[3].setEast(gameTiles[4]);
        gameTiles[3].setSouth(gameTiles[6]);
        gameTiles[3].setWest(null);

        gameTiles[4].setNorth(gameTiles[1]);
        gameTiles[4].setEast(gameTiles[5]);
        gameTiles[4].setSouth(gameTiles[7]);
        gameTiles[4].setWest(gameTiles[3]);

        gameTiles[5].setNorth(gameTiles[2]);
        gameTiles[5].setEast(null);
        gameTiles[5].setSouth(gameTiles[8]);
        gameTiles[5].setWest(gameTiles[4]);

        gameTiles[6].setNorth(gameTiles[3]);
        gameTiles[6].setEast(gameTiles[7]);
        gameTiles[6].setSouth(null);
        gameTiles[6].setWest(null);

        gameTiles[7].setNorth(gameTiles[4]);
        gameTiles[7].setEast(gameTiles[8]);
        gameTiles[7].setSouth(null);
        gameTiles[7].setWest(gameTiles[6]);

        gameTiles[8].setNorth(gameTiles[5]);
        gameTiles[8].setEast(null);
        gameTiles[8].setSouth(null);
        gameTiles[8].setWest(gameTiles[7]);
    }

    public void showMap(GameTile currentTile) {
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                int index = row * 3 + col;
                GameTile tile = gameTiles[index];
                String tileDisplay = tile.showTile();
                if (tile == currentTile) {
                    tileDisplay = "[" + tileDisplay + "]";
                }
                System.out.print(tileDisplay);
                if (col < 2) {
                    System.out.print(" || ");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }
}




