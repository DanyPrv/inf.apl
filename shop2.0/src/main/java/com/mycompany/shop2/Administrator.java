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

    public Administrator(EmployeeInfo employeeInfo) {
        this.employeeInfo = employeeInfo;
    }

    public void AddProductToStock(Stock stock, Product product, int qty) throws Exception {
        stock.Add(product, qty);
    }

    public boolean CheckProductStock(Stock stock, String productName, int qty) throws Exception {
        Product product = stock.GetProduct(productName);
        if (product != null) {
            return stock.GetQunaity(product.getName()) >= qty;
        }

        return false;
    }

    public void RemoveProductFromStock(Stock stock, String productName) throws Exception {
        Product product = stock.GetProduct(productName);
        if (product != null) {
            int qty = stock.GetQunaity(product.getName());
            stock.RemoveProduct(product, qty);
        }
    }
}
