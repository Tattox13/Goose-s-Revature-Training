package com.revature;

import javax.servlet.*;
import java.io.IOException;

// This first servlet implements the Servlet interface, so we have to implement all of the servlet
// methods
public class FirstServlet implements Servlet{
    // create a member variable to store the servlet configuration
    // store information about the servlet:
    ServletConfig config;


    // Lifecycle methods:

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Creating servlet (init)");
        // taking the parameter of the configuration and then assigning it to the member variable:
        this.config = servletConfig;

    }



    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // this will be invoked whenever the servlet is called, so it's where the "meat" of our operations will go
        System.out.println("Servicing... fulfilling request...");
        System.out.println("info: " + this.getServletInfo());
        System.out.println("config information: " + this.getServletConfig().toString());
    }


    // called whenever the servlet is being destroyed/cleaned up, it will only be called once:

    public void destroy() {
        System.out.println("Cleaning up servlet.");
    }

    // Non-lifecycle methods
    // take the config that we set up in our init method and return it here:

    public ServletConfig getServletConfig() {
        return this.config;
    }


    // if we just want almost custom message/info about the servlet:

    public String getServletInfo() {
        return "This is my first servlet.";
    }


}