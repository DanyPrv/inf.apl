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

    public EmployeeInfo GetEmployeeInfo() {
        return this.employeeInfo;
    }

    public boolean CheckProductStock(String productName, int qty) {
        return qty <= stock.GetQunaity(productName);
    }

    public Product GetProduct(String productName) {
        return stock.GetProduct(productName);
    }

    public Stock GetStock() {
        return this.stock;
    }

    public void AddToSell(CashRegister cashRegister, String ProductName, int qty) {
        Product product = stock.GetProduct(ProductName);
        if (product != null) {
            if (this.CheckProductStock(ProductName, qty)) {
                cashRegister.RegisterNewProduct(product, qty);
                stock.SetQuantity(ProductName, stock.GetQunaity(ProductName) - qty);
            }
        }
    }

    public boolean RemoveFromSell(CashRegister cashRegister, String ProductName) {
        int qty = cashRegister.RemoveProductFromSell(ProductName);
        if (qty == -1) {
            return false;
        }
        Product product = stock.GetProduct(ProductName);
        stock.SetQuantity(ProductName, stock.GetQunaity(ProductName) + qty);
        return true;
    }

    public void FinaliseSell(CashRegister cashRegister) {
        cashRegister.FinaliseSell();
    }

    public void StartNewSell(CashRegister cashRegister) {
        cashRegister.StartNewSell();
    }
}
