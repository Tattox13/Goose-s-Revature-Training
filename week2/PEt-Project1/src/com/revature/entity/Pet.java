package com.revature.entity;

public class Pet {
    private int id;
    private String name;
    private String species;
    private String food;

    public Pet(){

    }

    public Pet(int id, String name, String species, String food) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.food = food;
    }

    public Pet(String name, String species, String food) {
        this.name = name;
        this.species = species;
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
