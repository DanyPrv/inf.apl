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
public class Seller {

    private EmployeeInfo employeeInfo;
    Stock stock;

    public Seller(Stock stock, EmployeeInfo employeeInfo) {
        this.stock = stock;
        this.employeeInfo = employeeInfo;
    }

    public boolean CheckProductStock(String productName, int qty) throws Exception {
        return qty == stock.GetQunaity(productName);
    }

    public Product GetProduct(String productName) {
        return stock.GetProduct(productName);
    }

    public void AddToSell(CashRegister cashRegister, String ProductName, int qty) throws Exception {
        Product product = stock.GetProduct(ProductName);
        if (product != null) {
            if (this.CheckProductStock(ProductName, qty)) {
                cashRegister.RegisterNewProduct(product, qty);
            }
        }
    }

    public void Sell(CashRegister cashRegister) throws Exception {
        cashRegister.FinaliseSell();
        cashRegister.StartNewSell();
    }
}
