/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Employee {

    private Stock productStocks;
    private CashRegiter cashRegister;
    private String Name;
    //0 <- seller ; 1 <- admin
    private boolean employeeType;

    public Employee(Stock stock, CashRegiter cashRegister, boolean employeeType, String name) {
        productStocks = stock;
        this.employeeType = employeeType;
        this.Name = name;
        this.cashRegister=cashRegister;
    }
    public String GetName(){
        return this.Name;
    }
    public void AddToStock(String productName, int Quantity, float Price) {
        if (employeeType) {
            productStocks.AddProduct(new Product(productName, Price, Quantity));
        } else {
            System.out.println("Angajatul " + Name + " nu este administrator!");

        }
    }

    public void ModifyStock(String productName, int newQuantity, int newPrice) {
        if (employeeType) {
            productStocks.SetQuantity(productName, newQuantity);
            productStocks.SetPrice(productName, newPrice);
        } else {
            System.out.println("Angajatul " + Name + " nu este administrator!");

        }
    }

    public void AddProductOnReceipt(String productName, int quantity) {
        if (!employeeType) {
            Product product = productStocks.GetProduct(productName);
            if (product != null) {
                if (product.GetQuantity() >= quantity) {
                    product.SetQuantity(product.GetQuantity() - quantity);
                    cashRegister.AddProduct(product, quantity);
                } else {
                    System.out.println("Cantitatea produsului  "
                            + product.GetName() + "  insuficienta");
                    return;
                }
            } else {
                System.out.println("Produsul nu exista!");
                return;
            }
        } else {
            System.out.println("Angajatul " + Name + " nu este vazator!");
        }
    }

    public void PrintReceipt() {
        if (!employeeType) {
            cashRegister.CreateReceipt();
        } else {
            System.out.println("Angajatul " + Name + " nu este vazator!");
        }
    }

    public void PrintStock() {
        productStocks.PrintStock();
    }
}
