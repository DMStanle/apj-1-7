package edu.byui.apj.adventure.actions;
import edu.byui.apj.adventure.Player;

public class InventoryAction extends AbstractAction {

    public static final String DESCRIPTION = "Show (I)nventory";

    public InventoryAction(String key) {
        super(key);
    }

    @Override
    public boolean canDoAction(Player player) {
        return true;
    }

    @Override
    public void doAction(Player player) {
        player.showInventory();
    }

    @Override
    public String getActionDescription() {
        return DESCRIPTION;
    }
}
