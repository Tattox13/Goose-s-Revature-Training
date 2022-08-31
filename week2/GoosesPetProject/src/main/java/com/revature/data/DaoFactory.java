package com.revature.data;

public class DaoFactory {
    private static PetDao petDao;
    private static PersonDao personDao = null;
    private DaoFactory() {

    }

    public static PetDao getPetDao(){
        if(petDao == null){
            System.out.println("This should only be called once (Pet Dao Creation)");
            petDao = new PetDaoImpl();
        }
        return petDao;
    }

    public static PersonDao getPersonDao() {
        if(personDao == null) {
            System.out.println("This should only run once");
            personDao = new PersonDaoImpl();
        }
        return personDao;
    }

}
