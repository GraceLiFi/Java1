package com.xpanxion.assignments.student;
import java.util.ArrayList;

public class Invoice extends Base {
    private int id;
    private ArrayList<Product> productList = new ArrayList<Product>();
    public Invoice(int id) {
        super(id);
    }

    public void addProduct (Product product) {
        productList.add(product);
    }
    public ArrayList<Product> getProductList () {
        return productList;
    }

    public int getId() {
        return this.id;
    }

    public double getTotalCost() {
        double cost = 0;
        for (int i = 0; i < productList.size(); i++) {
            cost = cost + productList.get(i).getCost();
        }
        return cost;
    }
}
