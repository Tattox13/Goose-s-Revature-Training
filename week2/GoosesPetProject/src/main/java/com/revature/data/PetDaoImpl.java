package com.revature.data;

import com.revature.entity.Pet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//
public class PetDaoImpl implements PetDao{

    Connection connection;

    //
    public PetDaoImpl(){

        connection = ConnectionFactory.getConnection();
    }

    //
    @Override
    public Pet insert(Pet pet) {

        System.out.println(pet.toString());
        System.out.println("Now we're in the DAO trying to pass in pet object to the database");

        //String sql = "insert into pet (id, name, species, food) values (default, " + pet.getName() + "," + pet. getFood();
        //System.out.println(sql);

        //
        String sql = "insert into pet (id, name, species, food) values (default, ?, ?, ?);";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, pet.getName());
            preparedStatement.setString(2,pet.getSpecies());
            preparedStatement.setString(3, pet.getFood());
            System.out.println(preparedStatement.toString());


            int count = preparedStatement.executeUpdate();

            if(count == 1) {
                System.out.println("Pet added successfully.");

                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                resultSet.next();

                int generatedId = resultSet.getInt(1);

                pet.setId(generatedId);
            }
            else {
                System.out.println("Something went wrong with the insert!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Something went wrong when preparing the statement!");
        }

        return pet;
    }

    //
    @Override
    public Pet getById(int id) {
        String sql = "select * from pet where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            //
            //
            ResultSet resultSet = preparedStatement.executeQuery();

            //
            if(resultSet.next()) {
                //
                int idDb = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String species = resultSet.getString("species");
                String food = resultSet.getString("food");
                //
                Pet pet = new Pet(idDb, name, species, food);
                //
                return pet;
            }
            else {
                System.out.println("something went wrong when trying to query for the pet, pet might not exist");
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong when trying to retrieve data.");
            e.printStackTrace();

        }
        //
        return null;

        /**
         * if(username already taken)
         * try {
         * throw new RegisterException
         * }
         * catch RegisterException{
         * print stackTrace
         */
    }

    @Override
    public List<Pet> getAllPets() {
        //
        List<Pet> pets = new ArrayList<>();

        //
        String sql = "select * from pet;";
        try {
            //
            Statement statement= connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            //
            //
            //

            //
            //
            while(resultSet.next()) {
                //
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String species = resultSet.getString("species");
                String food = resultSet.getString("food");
                Pet pet = new Pet(id, name, species, food);

                //
                pets.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //
        return pets;
    }

    //
    @Override
    public Pet update(Pet pet) {
        String sql = "update pet set name = ?, species = ?, food = ? where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pet.getName());
            preparedStatement.setString(2, pet.getSpecies());
            preparedStatement.setString(3, pet.getFood());
            preparedStatement.setInt(4, pet.getId());

            int count = preparedStatement.executeUpdate(); //

            if(count == 1) {
                System.out.println("Update successful!");
                return pet;
            }
            else {
                System.out.println("Something went wrong with the update");
                if(count == 0) {
                    System.out.println("No rows were affected");
                }
                else {
                    System.out.println("Many rows were affected");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //
        return null;
    }

    // only update a certain field/column:
//    public Pet updateFood(int id, String food) {
//        String sql = "update pet set food = ? where id = ?;";
//        PreparedStatement preparedStatement = connection.prepareStatement();
//        preparedStatement.setString(food);
//        preparedStatement.setInt(2, id);
//
//    }

    //
    @Override
    public boolean delete(int id) {
        String sql = "delete from pet where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int count = preparedStatement.executeUpdate();
            if(count == 1) {
                System.out.println("Deletion successful!");
                return true;
            }
            else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean adopt(int personId, int petId) {
        // TODO check if id is null
        String sql = "update pet set owner_id = ? where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, personId);
            preparedStatement.setInt(2, petId);
            int count = preparedStatement.executeUpdate();
            // if we've successfully update the table, we can return true
            if(count == 1) return true;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        // for failure situations, we return false
        return false;
    }

    @Override
    public List<Pet> getAdoptedPets(int personId) {
        String sql = "select * from pet where owner_id = ?;";
        List<Pet> pets = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, personId);
            ResultSet resultSet = preparedStatement.executeQuery();


            while(resultSet.next()) {
                // for the current row, extract the data
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String species = resultSet.getString("species");
                String food = resultSet.getString("food");
                Pet pet = new Pet(id, name, species, food);

                // add the current pet to the list of pets that we're returning:
                pets.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pets;
    }

    // CRUD Methods:


}