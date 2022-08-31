package com.revature;

import com.revature.controller.CommandLine;
import com.revature.controller.TicketCommandLine;
import com.revature.controller.UserCommandLineInterface;

import java.sql.SQLException;

public class App
{
    public static void main( String[] args ) throws SQLException {

        System.out.println( "Welcome!" );
        CommandLine.menu();
        //UserCommandLineInterface.menu();
        //TicketCommandLine.menu();
    }
}
