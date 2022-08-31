package com.revature.data;

import com.revature.entity.Pet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//
public class PetDaoImpl implements PetDao{

    Connection connection;

    //
    public PetDaoImpl(){
        connection = ConnectionFactory.getConnection();
    }


    @Override
    public Pet insert(Pet pet) {
        //
        String sql = "";

//        try{
//
//        }catch(SQLException e){
//
//        }

        return null;
    }

    @Override
    public Pet getById(int id) {
        return null;
    }

    @Override
    public List<Pet> getAllPets() {
        return null;
    }

    @Override
    public Pet update(Pet pet) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    //

}
