package com.mycompany.shop2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel
 */
public class StockItem {

    private Product product;
    private int quantity;

    public StockItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public StockItem(String name, float price, int quantity) {
        this.product = new Product(name, price);
        this.quantity = quantity;
    }

    public void SetQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int GetQuantity() {
        return this.quantity;
    }

    public Product GetProduct() {
        return this.product;
    }

}
