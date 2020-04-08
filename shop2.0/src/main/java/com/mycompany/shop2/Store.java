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
    private List<CashRegister> cashRegisters;
    private List<Administrator> admins;
    private List<Seller> sellers;

    public Store(String storeName, String fiscalIdentifier) {
        this.storeName = storeName;
        this.fiscalIdentifier = fiscalIdentifier;
        stock = new Stock();
        cashRegisters = new ArrayList<>();
        admins = new ArrayList<>();
        sellers = new ArrayList<>();
    }

    public CashRegister AddNewCashRegister(String uniqueIdentifier) {
        CashRegister cashRegister = new CashRegister(storeName, fiscalIdentifier, uniqueIdentifier);
        cashRegisters.add(cashRegister);
        return cashRegister;
    }

    public Seller AddNewSeller(String name, String phoneNo, String address) {
        Seller seller = new Seller(stock, new EmployeeInfo(name, phoneNo, address));
        sellers.add(seller);
        return seller;
    }

    public Administrator AddNewAdmin(String name, String phoneNo, String address) {
        Administrator admin = new Administrator(stock, new EmployeeInfo(name, phoneNo, address));
        admins.add(admin);
        return admin;
    }

    public CashRegister GetCashRegister(String uniqueIdentifier) {
        for (CashRegister C : cashRegisters) {
            if (C.GetUniqueIdentifier().equals(uniqueIdentifier)) {
                return C;
            }
        }
        return null;
    }

    public void RemoveCashRegister(String uniqueIdentifier) {
        cashRegisters.remove(GetCashRegister(uniqueIdentifier));
    }

    public Seller GetSeller(String name, String phoneNo, String address) {
        for (Seller C : sellers) {
            if (C.GetEmployeeInfo().equals(new EmployeeInfo(name, phoneNo, address))) {
                return C;
            }
        }
        return null;
    }

    public Administrator GetAdmin(String name, String phoneNo, String address) {
        for (Administrator C : admins) {
            if (C.GetEmployeeInfo().equals(new EmployeeInfo(name, phoneNo, address))) {
                return C;
            }
        }
        return null;
    }
    public List<CashRegister>GetCashRegisters(){
        return this.cashRegisters;
    }
}
