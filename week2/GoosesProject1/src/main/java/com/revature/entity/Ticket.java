package com.revature.entity;

public class Ticket {
    // id of this ticket:
    private int id;
    // name of this ticket:
    private String name;
    // the employee who owns this ticket:
    private int ownerId;
    // how much money requested:
    private float amount;
    // reason for request:
    private String description;
    // status can be Approved or Denied
    private String status;

    public Ticket(){

    }

    public Ticket( String name, int ownerId, Float amount, String description) {
        this.name = name;
        this.ownerId = ownerId;
        this.amount = amount;
        this.description = description;
        this.status = "pending";
    }

    public Ticket(int id, String name, int ownerId, Float amount, String description, String status) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.amount = amount;
        this.description = description;
        this.status = status;
    }

    public Ticket(int id, String name, int ownerId, Float amount, String description) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.amount = amount;
        this.description = description;
        //this.status = "pending";
    }

//    public Ticket(int ownerId, String description){
//        this.ownerId = ownerId;
//        this.description = description;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ownerId=" + ownerId +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }



}
