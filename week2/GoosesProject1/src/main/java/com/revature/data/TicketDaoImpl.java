package com.revature.data;

import com.revature.entity.Ticket;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketDaoImpl implements TicketDao {

    Connection connection;

    public TicketDaoImpl(){
        connection = ConnectionFactory.getConnection();
    }

    @Override
    public Ticket add(Ticket ticket) {
        String sql = "insert into ticket (name, emp_Id, amount, description, status) values(?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, ticket.getName());
            preparedStatement.setInt(2, ticket.getOwnerId());
            preparedStatement.setFloat(3, ticket.getAmount());
            preparedStatement.setString(4, ticket.getDescription());
            preparedStatement.setString(5, ticket.getStatus());
            int count = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (count == 1) {
                // Success:
                System.out.println("Ticket Issued! Please wait for a Manger to Approve/Denied it.");
                resultSet.next();
                int id = resultSet.getInt(1);
                ticket.setId(id);
            } else {
                System.out.println("Oops! There was an error applying for a ticket.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Something went wrong when preparing the statement!");
        }

        return ticket;
    }

    @Override
    public Ticket update(Ticket ticket) throws SQLException {
        String sql = "update ticket set name = ?, emp_Id = ?, amount = ?, description = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ticket.getName());
        preparedStatement.setInt(2, ticket.getOwnerId());
        preparedStatement.setFloat(3, ticket.getAmount());
        preparedStatement.setString(4, ticket.getDescription());
        preparedStatement.setInt(5, ticket.getId());
        int count = preparedStatement.executeUpdate();
        if(count != 1){
            System.out.println("Oops! Something went wrong updating the account.");
        }
        return null;
    }

    @Override
    public List<Ticket> getTicketsForEmployee(int empId) {
        List<Ticket> tickets = new ArrayList<>();
        // use store procedure:
        String sql = "select * from ticket where emp_id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,empId);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                // Read data from query:
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int ownerId = resultSet.getInt("emp_id");
                Float amount = resultSet.getFloat("amount");
                String description = resultSet.getString("description");
                String status = resultSet.getString("status");
                Ticket ticket = new Ticket(id, name, ownerId, amount, description, status);

                tickets.add(ticket);
            }
        } catch (SQLException e) {
                e.printStackTrace();

        }
        return tickets;
    }

    @Override
    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        String sql = "select * from ticket;";
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                //
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int ownerId = resultSet.getInt("emp_id");
                Float amount = resultSet.getFloat("amount");
                String description = resultSet.getString("description");
                String status = resultSet.getString("status");
                Ticket ticket = new Ticket(id, name, ownerId, amount, description, status);

                tickets.add(ticket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //
        return tickets;
    }

    @Override
    public Ticket getTicketsById(int TicketId) {
        String sql = "select * from ticket where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, TicketId);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                //
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int ownerId = resultSet.getInt("emp_id");
                Float amount = resultSet.getFloat("amount");
                String description = resultSet.getString("description");
                String status = resultSet.getString("status");
                //
                Ticket ticket = new Ticket(id, name, ownerId, amount, description, status);
                //
                return ticket;
            }
            else {
                System.out.println("something went wrong when trying to query for the pet, pet might not exist");
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong when trying to retrieve data.");
            e.printStackTrace();

        }
        return null;
    }
}