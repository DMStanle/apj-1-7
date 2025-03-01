package edu.byui.apj.week6;

import java.util.*;

public class Superhero implements Comparable<Superhero> {
    private String name;
    private int powerLevel;
    private List<String> powers;

    public Superhero(String name, int powerLevel, List<String> powers) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.powers = new ArrayList<>(powers);
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public List<String> getPowers() {
        return powers;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                ", powers=" + powers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Superhero superhero = (Superhero) o;
        return name.equals(superhero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Superhero other) {
        return Integer.compare(this.powerLevel, other.powerLevel);
    }

    public static void main(String[] args) {
        List<Superhero> superheroes = Arrays.asList(
                new Superhero("Bruno", 5, Arrays.asList("freeze ray", "power punch")),
                new Superhero("Dollface", 5, Arrays.asList("glamour", "power punch")),
                new Superhero("Beefeater", 7, Arrays.asList("super jump", "power punch", "flying", "eye lasers")),
                new Superhero("Weaksauce", 2, Arrays.asList("keening whine", "freeze ray")),
                new Superhero("Dominator", 10, Arrays.asList("power punch", "flying", "eye lasers", "glamour", "super jump"))
        );

        Collections.sort(superheroes);
        System.out.println("Sorted by Power Level:");
        superheroes.forEach(System.out::println);

        superheroes.sort(Comparator.comparing(Superhero::getName));
        System.out.println("\nSorted by Name:");
        superheroes.forEach(System.out::println);

        Map<Integer, List<Superhero>> groupedByPower = new HashMap<>();
        for (Superhero hero : superheroes) {
            groupedByPower.computeIfAbsent(hero.getPowerLevel(), k -> new ArrayList<>()).add(hero);
        }
        System.out.println("\nHeroes with Power Level 5:");
        groupedByPower.getOrDefault(5, Collections.emptyList()).forEach(System.out::println);

        Set<String> uniquePowers = new HashSet<>();
        superheroes.forEach(hero -> uniquePowers.addAll(hero.getPowers()));
        System.out.println("\nUnique Powers:");
        uniquePowers.forEach(System.out::println);
    }
}

