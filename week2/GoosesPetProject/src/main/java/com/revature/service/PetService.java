package com.revature.service;

import com.revature.data.PetDao;
import com.revature.data.PetDaoImpl;
import com.revature.data.PetDaoTempImpl;
import com.revature.entity.Pet;

import java.util.List;

public class PetService {
    public Pet insert(Pet pet) {
        System.out.println("In the service layer, getting the DAO and calling the insert DAO method");
        // declare a pet dao and give it the temporary implementation that we have:
        PetDao petDao = new PetDaoImpl();
        // insert the pet and return the return value:
        return petDao.insert(pet);
    }

    public Pet getById(int id) {
        PetDao petDao = new PetDaoImpl();
        return petDao.getById(id);
    }

    public List<Pet> getAllPets() {
        PetDao petDao = new PetDaoImpl();
        return petDao.getAllPets();
    }

    public Pet updatePet(Pet pet) {
        PetDao petDao = new PetDaoImpl();
        return petDao.update(pet);
    }

    public boolean deletePet(int id) {
        PetDao petDao = new PetDaoImpl();
        return petDao.delete(id);
    }
}
