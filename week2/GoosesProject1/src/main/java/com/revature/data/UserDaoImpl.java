package com.revature.data;

import com.revature.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

import java.util.List;

public class UserDaoImpl implements UserDao{

    String userType;
    Connection connection;

    public UserDaoImpl(){
        connection = ConnectionFactory.getConnection();
        //this.userType = userType;
    }

    @Override
    public User insert(User user) {
        Logger logger = LoggerFactory.getLogger("User Dao Impl");
        String sql = "insert into person values(default, ?, ?);";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassword());

            int count = preparedStatement.executeUpdate();

            if (count ==1){
                logger.info("User added successfully");
            }
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            user.setId(resultSet.getInt(1));

        }catch (SQLException e){
            logger.warn("Something went wrong with the insert");
            return null;
        }
        return user;
    }

    @Override
    public User getById(int id) {
        Logger logger = LoggerFactory.getLogger("User Dao Impl");
        String sql = "select * from person where id = ?;";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1 , id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                int idDb = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                return new User(idDb, name, password);
            }
            else {
                logger.warn("User might not exist");
            }

        } catch (SQLException e){
            e.printStackTrace();
            logger.warn("SQL Exception occurred");
        }
        return null;
    }

    @Override
    public User getName(String name) {
        Logger logger = LoggerFactory.getLogger("User Dao Impl");
        String sql = "select * from person where name = ?;";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1 , name);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                int idDb = resultSet.getInt("id");
                String name1 = resultSet.getString("name");
                String password = resultSet.getString("password");
                return new User(idDb, name1, password);
            }
            else {
                logger.warn("User might not exist");
            }

        } catch (SQLException e){
            e.printStackTrace();
            logger.warn("SQL Exception occurred");
        }
        return null;
    }

//    @Override
//    public List<User> getUsers() {
//        return null;
//    }
//
//    @Override
//    public User update(User user) {
//        return null;
//    }
}
