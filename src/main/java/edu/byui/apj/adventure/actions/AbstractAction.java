package edu.byui.apj.adventure.actions;

public abstract class AbstractAction implements Action {

    protected String actionKey;

    public AbstractAction(String key) {
        actionKey = key;
    }

    @Override
    public boolean validKey(String test) {
        return actionKey != null && actionKey.equals(test);
    }
}
