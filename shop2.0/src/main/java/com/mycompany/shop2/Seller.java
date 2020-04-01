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

    public Seller(EmployeeInfo employeeInfo) {
        this.employeeInfo = employeeInfo;
    }

    public boolean CheckProductStock(Stock stock, String productName, int qty) throws Exception {
        return qty == stock.GetQunaity(productName);
    }

    public Product GetProduct(Stock stock, String productName) {
        return stock.GetProduct(productName);
    }

    public void AddToSell(Stock stock, CashRegister cashRegister, String ProductName, int qty) throws Exception {
        Product product = stock.GetProduct(ProductName);
        if (product != null) {
            if (this.CheckProductStock(stock, ProductName, qty)) {
                cashRegister.RegisterNewProduct(product, qty);
            }
        }
    }

    public void Sell(CashRegister cashRegister) throws Exception {
        cashRegister.FinaliseSell();
        cashRegister.StartNewSell();
    }
}
