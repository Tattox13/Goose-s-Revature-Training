package com.revature.service;

import com.revature.data.TicketDao;
import com.revature.data.TicketDaoImpl;
import com.revature.entity.Ticket;

import java.sql.SQLException;
import java.util.List;

public class TicketService {

    public Ticket add(Ticket ticket) {
        System.out.println("In the service layer, getting the DAO and calling the insert DAO method");
        // declare a pet dao and give it the temporary implementation that we have:
        TicketDao ticketDao = new TicketDaoImpl();
        // insert the pet and return the return value:
        return ticketDao.add(ticket);
    }

    public Ticket getTicketsById(int id) {
        TicketDao ticketDao = new TicketDaoImpl();
        return ticketDao.getTicketsById(id);
    }

    public List<Ticket> getAllTickets() {
        TicketDao ticketDao = new TicketDaoImpl();
        return ticketDao.getAllTickets();
    }

    public Ticket update(Ticket ticket) throws SQLException {
        TicketDao ticketDao = new TicketDaoImpl();
        return ticketDao.update(ticket);
    }

    public List<Ticket> getTicketsForEmployee(int empId) {
        TicketDao ticketDao = new TicketDaoImpl();
        return ticketDao.getTicketsForEmployee(empId);
    }

}
