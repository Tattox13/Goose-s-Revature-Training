package com.revature.controller;

import com.revature.entity.Ticket;
import com.revature.service.TicketService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TicketCommandLine {
    public static void menu() throws SQLException {
        // initialize our Pet Service:
        TicketService ticketService = new TicketService();
        // set up scanners
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        // loop endlessly
        while(true) {
            // print out the options:
            printOptions();
            // get the choice from the user:
            int choice = intScanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter ticket information");
                    System.out.print("Ticket Name => ");
                    String name = stringScanner.nextLine();
                    System.out.print("Employee ID => ");
                    int ownerId = intScanner.nextInt();
                    System.out.print("Amount => ");
                    Float amount = intScanner.nextFloat();
                    System.out.print("description => ");
                    String description = stringScanner.nextLine();

                    Ticket newTicket = new Ticket(name, ownerId, amount, description);
                    System.out.println(ticketService.add(newTicket));
                    break;
                case 2:
                    System.out.print("Enter in an id: ");
                    int id = intScanner.nextInt();
                    System.out.println(ticketService.getTicketsById(id));
                    break;
                case 3:
                    List<Ticket> tickets = ticketService.getAllTickets();
                    for(int i = 0; i < tickets.size(); i ++) {
                        System.out.println(tickets.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Enter ticket information");
                    System.out.print("Ticket Id => ");
                    id = intScanner.nextInt();
                    System.out.print("Ticket Name => ");
                    name = stringScanner.nextLine();
                    System.out.print("Pet Species => ");
                    ownerId = intScanner.nextInt();
                    System.out.print("Pet Food => ");
                    amount = intScanner.nextFloat();
                    System.out.print("Ticket Name => ");
                    description = stringScanner.nextLine();
                    Ticket ticket = new Ticket(id, name, ownerId, amount, description);
                    System.out.println(ticketService.update(ticket));
                    break;
                case 5:
                    System.out.print("Enter in Emp_id: ");
                    int empId = intScanner.nextInt();
                    List<Ticket> tickets1 = ticketService.getTicketsForEmployee(empId);
                    for(int i = 0; i < tickets1.size(); i ++) {
                        System.out.println(tickets1.get(i));
                    }
                    break;
                case 6:
                    System.out.print("Enter in Emp_id: ");
                    int empId1 = intScanner.nextInt();
                    System.out.print("Enter in status: ");
                    String statusP = stringScanner.nextLine();
                    List<Ticket> tickets2 = ticketService.getTicketsbyPending(empId1, statusP);
                    for(int i = 0; i < tickets2.size(); i ++) {
                        System.out.println(tickets2.get(i));
                    }
                    break;
                default:
                    System.out.println("Not a valid option.");
                    break;
            }



        }
    }

    public static void printOptions() {
        System.out.println("What would you like to do?");
        System.out.println("1 - Add ticket");
        System.out.println("2 - Get ticket by id");
        System.out.println("3 - Get all tickets");
        System.out.println("4 - Update ticket");
        System.out.println("5 - Get All tickets by Employee id");
        System.out.println("6 - Get pending tickets");
        System.out.print("Enter => ");
    }
}
