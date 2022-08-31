package com.revature.data;

import com.revature.entity.Pet;

import java.util.List;

public interface PetDao {

    public Pet insert(Pet pet);

    public Pet getById(int id);
    public List<Pet> getAllPets();

    public Pet update(Pet pet);

    public boolean delete(int id);

    public boolean adopt(int personId, int petId);
    public List<Pet> getAdoptedPets(int personId);


}
