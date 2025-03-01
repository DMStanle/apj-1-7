package edu.byui.apj.adventure.actions;
import edu.byui.apj.adventure.Player;
import edu.byui.apj.adventure.Item;
import edu.byui.apj.adventure.GameTile;
import edu.byui.apj.adventure.Obstacle;
import java.util.List;
import java.util.regex.Pattern;


public class UseItemAction extends AbstractAction {

    public static final String DESCRIPTION = "(U)se an item";

    public UseItemAction(String key) {
        super(key);
    }

    @Override
    public boolean canDoAction(Player player) {
        return !player.getInventory().isEmpty();
    }

    @Override
    public String getActionDescription() {
        return DESCRIPTION;
    }

    @Override
    public void doAction(Player player) {
        if (!canDoAction(player)) {
            System.out.println("You have nothing to use here.");
            return;
        }

        List<Item> inventory = player.getInventory();

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i + 1) + ". " + inventory.get(i).getName());
        }

        System.out.println("Which item will you use? ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String itemChoice = scanner.nextLine();

        Pattern wholeNumber = Pattern.compile("^\\d+$");

        if (!wholeNumber.matcher(itemChoice).matches()) {
            System.out.println("That is not a valid choice.");
            return;
        }

        int choiceNumber = Integer.parseInt(itemChoice);

        if (choiceNumber <= 0 || choiceNumber > inventory.size()) {
            System.out.println("That is not a valid choice.");
            return;
        }

        Item selectedItem = inventory.get(choiceNumber - 1);

        GameTile currentLocation = player.getLocation();
        Obstacle obstacle = currentLocation.getObstacle();

        if (obstacle != null && obstacle.requiresItem(selectedItem)) {
            System.out.println("The " + obstacle.getName() + " is defeated by the " + selectedItem.getName());
            currentLocation.setObstacle(null);
        } else {
            System.out.println("Using the " + selectedItem.getName() + " has no effect.");
        }
    }
}
