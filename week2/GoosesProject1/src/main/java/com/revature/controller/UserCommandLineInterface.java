package com.revature.controller;

import com.revature.entity.User;
import com.revature.service.UserService;

import java.util.Scanner;

public class UserCommandLineInterface {

    public static void menu() {
        UserService userService = new UserService();

        User user = null;

        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        while (true) {
            printOptions();
            int choice = intScanner.nextInt();
            switch (choice) {
                case 1:
                    if (user != null) {
                        System.out.println("You are already logged in.");
                        break;
                    }
                    // Take in name and password
                    System.out.print("Name => ");
                    String name = stringScanner.nextLine();
                    System.out.print("Password => ");
                    String password = stringScanner.nextLine();
                    User user1 = new User(name, password);
                    // if the registration is successful, then this will be a non-null object
                    user = userService.register(user1);
                    break;
                case 2:
                    if (user != null) {
                        System.out.println("You are already logged in.");
                        break;
                    }
                    System.out.print("Enter name => ");
                    name = stringScanner.nextLine();
                    System.out.print("Enter password => ");
                    password = stringScanner.nextLine();
                    user = userService.login(name, password);
                    if (user == null) {
                        System.out.println("Login unsuccessful!");
                    }
                    break;
            }
        }


    }
    public static void printOptions () {
        System.out.println("What would you like to do?");
        System.out.println("1 - Register");
        System.out.println("2 - Employee Login");
        System.out.println("3 - Manager Login");
        System.out.print("Enter => ");
    }
}