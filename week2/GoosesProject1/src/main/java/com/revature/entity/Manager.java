package com.revature.entity;

public class Manager extends User{

    public Manager(int id, String name, String password) {
        super(id, name, password);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", password='" + super.getPassword() + '\'' +
                '}';
    }
}
