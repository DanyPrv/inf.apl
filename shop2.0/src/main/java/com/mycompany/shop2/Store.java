package com.mycompany.shop2;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel
 */
public class Store {

    private String storeName;
    private String fiscalIdentifier;
    private Stock stock;
    public List<CashRegister> cashRegisters;
    public List<Administrator> admins;
    public List<Seller> sellers;

    public Store(String storeName, String fiscalIdentifier) {
        this.storeName = storeName;
        this.fiscalIdentifier = fiscalIdentifier;
        stock = new Stock();
        cashRegisters = new ArrayList<>();
        admins = new ArrayList<>();
        sellers = new ArrayList<>();
    }

    public void AddNewCashRegister() {
        cashRegisters.add(new CashRegister(storeName, fiscalIdentifier));
    }

    public void AddNewSeller(String name, String phoneNo, String address) {
        sellers.add(new Seller(stock, new EmployeeInfo(name, phoneNo, address)));
    }

    public void AddNewAdmin(String name, String phoneNo, String address) {
        admins.add(new Administrator(stock, new EmployeeInfo(name, phoneNo, address)));
    }
}
