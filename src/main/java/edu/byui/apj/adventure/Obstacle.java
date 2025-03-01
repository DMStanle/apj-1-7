package edu.byui.apj.adventure;

public class Obstacle {

    private final String name;
    private final Item required;

    public Obstacle(String name, Item required) {
        this.name = name;
        this.required = required;
    }

    public String getName() {
        return name;
    }
    public Item getRequired() {
        return required;
    }

    public boolean requiresItem(Item item) {
        return item != null && item.getName().equals(required.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
