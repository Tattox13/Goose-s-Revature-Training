package com.revature.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class CommandLine {
    public static void menu() throws SQLException {
        System.out.println("Which menu do you want to see?");
        System.out.println("1 - Ticket Menu");
        System.out.println("2 - User menu");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                TicketCommandLine.menu();
                break;
            case 2:
                UserCommandLineInterface.menu();
                break;
            default:
                System.out.println("Please choose 1 or 2");
                break;
        }


    }
}
