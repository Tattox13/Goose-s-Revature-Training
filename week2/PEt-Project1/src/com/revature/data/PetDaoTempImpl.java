package com.revature.data;

import com.revature.entity.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetDaoTempImpl implements PetDao {

    @Override
    public Pet insert(Pet pet) {
        System.out.println("Inserting pet: " + pet.toString());
        pet.setId(1);
        return pet;
    }

    @Override
    public Pet getById(int id) {
        Pet dummyPet = new Pet(id, "Pet from Database", "cat", "meow mix");
        return dummyPet;
    }

    @Override
    public List<Pet> getAllPets() {
        Pet pet1 = new Pet(1,"Ashes", "cat", "tuna juice");
        Pet pet2 = new Pet(2, "Shadow", "cat","water");
        List<Pet> pets = new ArrayList<>();
        pets.add(pet1);
        pets.add(pet2);
        return pets;
    }

    @Override
    public Pet update(Pet pet) {
        System.out.println("Updated pet: " + pet.toString());
        return pet;
    }

    @Override
    public boolean delete(int id) {
        System.out.println("Delete pet with id "+ id);
        return pets;
    }
}
