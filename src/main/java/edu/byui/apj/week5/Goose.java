package edu.byui.apj.week5;

public class Goose extends Animal {

    private String gender = "female";
    private boolean hasMate;

    public Goose() {
        super("Fred");
        this.gender = "female";
        this.hasMate = false;
    }

    public Goose(String name) {
        super(name);
        this.hasMate = false;
    }

    public Goose(String name, boolean hasMate) {
        this(name);
        this.hasMate = hasMate;
    }

    public Goose(String name, String gender, boolean hasMate) {
        super(name);
        this.gender = gender;
        this.hasMate = hasMate;
    }

    public void doGooseStuff() {
        honk();
    }

    private void honk() {
        System.out.println("Honk!");
        new RuntimeException().printStackTrace();
    }


    @Override
    public String toString() {
        return "Goose{" +
                "gender='" + gender + '\'' +
                ", hasMate=" + hasMate +
                '}';
    }
}
