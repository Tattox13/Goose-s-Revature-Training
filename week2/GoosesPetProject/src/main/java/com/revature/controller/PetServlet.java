package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.entity.Pet;
import com.revature.service.PetService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = req.getParameter("username");
        System.out.println(user);

        String pathInfo = req.getPathInfo();
        System.out.println("Path info: " + pathInfo);

        PetService petService = new PetService();

        PrintWriter out = resp.getWriter();

        if (pathInfo == null) {
            List<Pet> pets = petService.getAllPets();
            for (Pet pet : pets) {
                out.println(pet);
            }
        }

        else {
            String id = pathInfo.substring(1);
            int idInteger = Integer.parseInt(id);
            Pet pet = petService.getById(idInteger);
            out.println(pet);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        PetService petService = new PetService();

        ObjectMapper mapper = new ObjectMapper();

        Pet pet;

        try {
            pet = mapper.readValue(req.getReader(), Pet.class);
        }catch (Exception e){
            e.printStackTrace();
            resp.sendError(400,"Invalid pet format");
            return;
        }

        pet = petService.insert(pet);
        out.println(pet);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        PetService petService = new PetService();

        ObjectMapper mapper = new ObjectMapper();

        Pet pet;

        try {
            pet = mapper.readValue(req.getReader(), Pet.class);
        }catch (Exception e){
            e.printStackTrace();
            resp.sendError(400,"Invalid pet format");
            return;
        }

        pet = petService.updatePet(pet);
        out.println(pet);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PetService petService = new PetService();
        PrintWriter out = resp.getWriter();

        String pathInfo = req.getPathInfo();
        if(pathInfo == null){
            resp.sendError(400,"Must include id");
            return;
        }

        String id = pathInfo.substring(1);
        int idInteger = Integer.parseInt(id);

        boolean success = petService.deletePet(idInteger);
        if(success) {
            out.write("Deletion successful!");
        }
        else {
            resp.sendError(400, "Deletion unsuccessful, perhaps id doesn't exist?");
        }
    }
}
