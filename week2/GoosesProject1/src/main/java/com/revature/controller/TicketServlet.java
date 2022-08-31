package com.revature.controller;

import com.revature.entity.Ticket;
import com.revature.service.TicketService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = req.getParameter("username");
        System.out.println(user);

        String pathInfo = req.getPathInfo();
        System.out.println("Path info: " + pathInfo);

        TicketService ticketService = new TicketService();

        PrintWriter out = resp.getWriter();

        if (pathInfo == null) {
            List<Ticket> tickets = ticketService.getAllTickets();
            for (Ticket ticket : tickets) {
                out.println(ticket);
            }
        }

        else {
            String id = pathInfo.substring(1);
            int idInteger = Integer.parseInt(id);
            Ticket ticket = ticketService.getTicketsById(idInteger);
            out.println(ticket);
        }
    }
}
