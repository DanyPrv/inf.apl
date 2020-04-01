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
public class CashRegister {

    private int currentRecpNo;
    private List<Receipt> receipts;
    private String storeName;
    private String fiscalIdentifier;

    public CashRegister(String storeName, String fiscalIdentifier) {
        currentRecpNo = -1;
        receipts = new ArrayList<>();
        this.storeName = storeName;
        this.fiscalIdentifier = fiscalIdentifier;
    }

    public void StartNewSell() {
        currentRecpNo++;
        receipts.add(new Receipt());
    }

    public void RegisterNewProduct(Product product, int qty) {
        receipts.get(currentRecpNo).AddReceiptItem(product.getName(), product.getPrice(), qty);
    }

    public void FinaliseSell() throws Exception {
        receipts.get(currentRecpNo).FinaliseSell();
    }

}
