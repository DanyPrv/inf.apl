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
public class Administrator {

    private EmployeeInfo employeeInfo;
    Stock stock;

    public Administrator(Stock stock, EmployeeInfo employeeInfo) {
        this.stock = stock;
        this.employeeInfo = employeeInfo;
    }

    public EmployeeInfo GetEmployeeInfo() {
        return this.employeeInfo;
    }

    public void AddProductToStock(Product product, int qty) {
        stock.Add(product, qty);
    }

    public boolean CheckProductStock(String productName, int qty) {
        Product product = stock.GetProduct(productName);
        if (product != null) {
            return stock.GetQunaity(product.getName()) >= qty;
        }

        return false;
    }

    public Stock GetStock() {
        return this.stock;
    }

    public void RemoveProductFromStock(String productName) {
        Product product = stock.GetProduct(productName);
        if (product != null) {
            int qty = stock.GetQunaity(product.getName());
            stock.RemoveProduct(product, qty);
        }
    }
}
