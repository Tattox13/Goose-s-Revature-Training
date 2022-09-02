package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.revature.entity.User;
import com.revature.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // print writer and person service intiliaze
        PrintWriter out = resp.getWriter();
        UserService userService = new UserService();

        // set up variables to store the person object from the body:
        ObjectMapper mapper = new ObjectMapper();
        User user;

        // try to read in the credential information:
        try {
            // Object Mapper requires default constructor:
            user = mapper.readValue(req.getReader(), User.class);
        }catch(Exception e) {
            e.printStackTrace();
            resp.sendError(400, "Invalid person format");
            return;
        }

        // either login or register:
        String authType = req.getParameter("auth");
        if(authType.equals("login")) {
            user = userService.login(user.getName(), user.getPassword());
        }
        else if (authType.equals("register")){
            user = userService.register(user);
        }

        // if invalid credentials, return error code:
        if(user == null) {
            resp.sendError(400, "Invalid credentials");
            return;
        }

        // otherwise print out the person:
        out.println("ID: "+ user.getId() + " Login Success!");

        // update the session with the person's id: (indicates if we are logged in/registered
        req.getSession().setAttribute("id", user.getId());

    }

}
