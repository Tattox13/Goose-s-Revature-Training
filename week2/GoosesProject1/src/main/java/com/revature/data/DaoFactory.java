package com.revature.data;

public class DaoFactory {
    private static UserDao userDao = null;
    private static TicketDao ticketDao;

    private DaoFactory(){

    }

    public static UserDao getUserDao(){
        if(userDao == null) {
            System.out.println("This should only run once");
            userDao = new UserDaoImpl();
        }
        return userDao;
    }

    public static TicketDao getTicketDao(){
        if(ticketDao == null) {
            System.out.println("This should only run once");
            ticketDao = new TicketDaoImpl();
        }
        return ticketDao;
    }
}
