package edu.byui.apj.adventure;

public class Item {
    private final String name;

    public String getName() {
        return name;
    }

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
