package edu.byui.apj.week4.pets;
import java.util.Objects;

public abstract class AbstractPet implements Pet {
    private String name;
    protected boolean isVaccinated;

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


   // public String speak() {
     //   return "***";
    //}

    @Override
    public void doVaccination() {
        isVaccinated = true;
        System.out.println("Vaccinating " + name);
        //System.out.println(speak());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPet that = (AbstractPet) o;
        return isVaccinated == that.isVaccinated && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isVaccinated);
    }

    @Override
    public String toString() {
        return "AbstractPet{" +
                "name='" + name + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}
