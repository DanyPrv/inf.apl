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
    private String uniqueIdentifier;

    //identificator unic 
    public CashRegister(String storeName, String fiscalIdentifier, String uniqueIdentifier) {
        currentRecpNo = -1;
        receipts = new ArrayList<>();
        this.storeName = storeName;
        this.fiscalIdentifier = fiscalIdentifier;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public String GetUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public void StartNewSell() {
        receipts.add(new Receipt());
    }

    public void RegisterNewProduct(Product product, int qty) {
        receipts.get(currentRecpNo).AddReceiptItem(product.getName(), product.getPrice(), qty);
    }

    public int RemoveProductFromSell(String productName) {
        int quantity = receipts.get(currentRecpNo).GetItemQuantity(productName);
        receipts.get(currentRecpNo).RemoveReceiptItem(productName);
        return quantity;
    }

    public Receipt FinaliseSell() {
        Receipt item = receipts.get(currentRecpNo);
        item.FinaliseSell();
        currentRecpNo++;
        return item;
    }

    public List<ReceiptItem> GetCurrentSell() {
        return this.receipts.get(currentRecpNo).GetCurrentReceipt();
    }

}
