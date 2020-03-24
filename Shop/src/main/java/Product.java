/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Product {

    private String productName;
    private int quantity;
    private float price;

    public Product(String name, float price, int quantity) {
        this.price = price;
        this.productName = name;
        this.quantity = quantity;
    }

    public Product() {
        productName = "";
        quantity = 0;
        price = 0;
    }

    public void SetQuantity(int value) {
        this.quantity = value;
    }

    public void SetPrice(float value) {
        this.price = value;
    }

    public int GetQuantity() {
        return this.quantity;
    }

    public float GetPrice() {
        return this.price;
    }

    public String GetName() {
        return this.productName;
    }
}
