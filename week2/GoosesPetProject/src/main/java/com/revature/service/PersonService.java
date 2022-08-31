package com.revature.service;

import com.revature.data.DaoFactory;
import com.revature.data.PersonDao;
import com.revature.data.PetDao;
import com.revature.entity.Person;
import com.revature.entity.Pet;

import java.util.List;

public class PersonService {

    public Person register(Person person) {

        PersonDao personDao = DaoFactory.getPersonDao();
        Person person1 = personDao.insert(person);

        return person1;
    }

    public Person login(int id, String password) {

        PersonDao personDao = DaoFactory.getPersonDao();
        Person person = personDao.getById(id);
        if (password.equals(person.getPassword())) {

            return person;
        }

        return null;
    }

    public boolean adopt(int personId, int petId) {
        // we actually have to interact with the pet database
        PetDao petDao = DaoFactory.getPetDao();
        // return boolean indicates whether or not the adoption was successful
        return petDao.adopt(personId, petId);
    }

    // given a person's id, return all pets that were adopted by them
    public List<Pet> getAdoptedPets(int personId) {
        PetDao petDao = DaoFactory.getPetDao();
        return petDao.getAdoptedPets(personId);
    }

}
