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
public class ReceiptItem {

    private String productName;
    private float ppUnit;
    private int qty;
    private float total;

    public ReceiptItem(String productName, float ppUnit, int qty) {
        this.productName = productName;
        this.ppUnit = ppUnit;
        this.qty = qty;
        this.total = ppUnit * qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String GetProductName() {
        return this.productName;
    }

    public float GetPPUnit() {
        return this.ppUnit;
    }

    public int GetQty() {
        return this.qty;
    }

    public float GetTotal() {
        return this.total;
    }
}
