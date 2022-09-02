package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.entity.Ticket;
import com.revature.entity.User;
import com.revature.service.TicketService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TicketServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String user = req.getParameter("username");
//        System.out.println(user);
//
//        String pathInfo = req.getPathInfo();
//        System.out.println("Path info: " + pathInfo);
//
//        TicketService ticketService = new TicketService();
//
//        PrintWriter out = resp.getWriter();
//
//        if (pathInfo == null) {
//            List<Ticket> tickets = ticketService.getAllTickets();
//            for (Ticket ticket : tickets) {
//                out.println(ticket);
//            }
//        }
//
//        else {
//            String id = pathInfo.substring(1);
//            int idInteger = Integer.parseInt(id);
//            Ticket ticket = ticketService.getTicketsById(idInteger);
//            out.println(ticket);
//        }
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        TicketService ticketService = new TicketService();

        ObjectMapper mapper = new ObjectMapper();

        Ticket ticket;

        try {
            ticket = mapper.readValue(req.getReader(), Ticket.class);
        }catch (Exception e){
            e.printStackTrace();
            resp.sendError(400,"Invalid pet format");
            return;
        }

        ticket = ticketService.add(ticket);
        out.println(ticket);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        TicketService ticketService = new TicketService();

        ObjectMapper mapper = new ObjectMapper();
        Ticket ticket;

        try {
            // Object Mapper requires default constructor:
            ticket = mapper.readValue(req.getReader(), Ticket.class);
        }catch(Exception e) {
            e.printStackTrace();
            resp.sendError(400, "Invalid person format");
            return;
        }

        // try to get the person id from the session:
        int ownerId = ticket.getOwnerId();
        String status = ticket.getStatus();
//        try {
//            // trying to access the session and get the id of the current logged in user:
//            empId = (Integer) req.getSession().getAttribute("id");
//            statusP = (String) req.getSession().getAttribute("");
//        } catch (Exception e) {
//            // if we don't get the id, we send a 401 (authantication) error
//            resp.sendError(401, "Must be logged in to view adopted pets");
//            return;
//        }
        // Otherwise, get the pet that we want to update (using the id from the session)
        List<Ticket> tickets = ticketService.getTicketsbyPending( ownerId, status);

        for(Ticket ticket1: tickets) {
            out.println(ticket1);
        }

    }

}
