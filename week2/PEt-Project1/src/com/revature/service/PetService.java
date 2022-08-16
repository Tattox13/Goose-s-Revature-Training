package com.revature.service;

import com.revature.data.PetDao;
import com.revature.data.PetDaoTempImpl;
import com.revature.entity.Pet;

public class PetService {
    public Pet insert(Pet pet){
        PetDao petDao = new PetDaoTempImpl();
        return PetDao.insert(pet);
    }

    public Pet getById(int id){

    }
}
