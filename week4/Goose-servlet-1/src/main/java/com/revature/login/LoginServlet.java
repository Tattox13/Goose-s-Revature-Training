//package com.revature.login;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class LoginServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text");
//        PrintWriter out = resp.getWriter();
//
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        if(username.equals("admin") && password.equals("123")){
//            out.println("")
//        }
//
//    }
//}
