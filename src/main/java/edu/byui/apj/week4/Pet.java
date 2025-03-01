package edu.byui.apj.week4;

public class Pet {
    private String name;
    protected boolean isVaccinated;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String speak() {
        return "***";
    }

    public void doVaccination() {
        isVaccinated = true;
        System.out.println("Vaccinating " + name);
        System.out.println(speak());
    }
}
