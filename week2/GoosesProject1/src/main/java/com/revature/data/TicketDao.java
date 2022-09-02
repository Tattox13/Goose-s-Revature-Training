package com.revature.data;

import com.revature.entity.Ticket;

import java.sql.SQLException;
import java.util.List;

public interface TicketDao {
    //CRUD
    public Ticket add(Ticket ticket);

    public Ticket update(Ticket ticket) throws SQLException;

    public List<Ticket> getTicketsForEmployee(int empId);

    public List<Ticket> getAllTickets();

    public Ticket getTicketsById(int TicketId);

    public List<Ticket> getTicketsbyPending(int empId, String statusP);

}
