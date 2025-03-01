package edu.byui.apj.adventure.actions;
import edu.byui.apj.adventure.Player;

public class InvalidAction extends AbstractAction {

    public static final String DESCRIPTION = "";

    public InvalidAction(String key) {
        super(key);
    }

    @Override
    public boolean canDoAction(Player player) {
        return false;
    }

    @Override
    public void doAction(Player player) {
        System.out.println("That is not a valid option");
    }

    @Override
    public String getActionDescription() {
        return DESCRIPTION;
    }

    @Override
    public boolean validKey(String test) {
        String[] validKeys = {"G", "I", "M", "N", "E", "S", "W", "Q"};
        for (String key : validKeys) {
            if (key.equalsIgnoreCase(test)) {
                return false;
            }
        }
        return true;
    }
}
