package com.xpanxion.assignments.student;

public class Product extends Base{
    private int id;
    private String name;
    private double cost;

    public Product(int id, String name, double cost) {
        super(id);
        this.name = name;
        this.cost = cost;

    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getName() {
        return this.name;
    }
    public double getCost() {
        return this.cost;
    }
    public int getId() {
        return this.id;
    }
}
