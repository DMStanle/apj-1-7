package edu.byui.apj.week5;

public class GooseTest {

    private static GooseTest instance;

    public static void main(String[] args) {
        GooseTest.getInstance().runGooseTest();

    }

    private GooseTest() {

    }

    public synchronized static GooseTest getInstance() {
        if (instance == null) {
            instance = new GooseTest();
        }
        return instance;
    }

    public void runGooseTest() {
        Goose goose1 = new Goose();
        System.out.println(goose1);

        Goose goose2 = new Goose("Gertrude");
        System.out.println(goose2);

        Goose goose3 = new Goose("Fanny", true);
        System.out.println(goose3);

        Goose goose4 = new Goose("Bob", "Male", false);
        System.out.println(goose4);

        goose1.doGooseStuff();
        goose2.doGooseStuff();
        goose3.doGooseStuff();
        goose4.doGooseStuff();
    }
}
