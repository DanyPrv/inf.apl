package com.mycompany.shop2;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel
 */
public class Receipt {

    private List<ReceiptItem> receiptItems;
    private float total;

    public Receipt() {
        total = 0;
        receiptItems = new ArrayList<>();
    }

    public void AddReceiptItem(String productName, float ppUnit, int qty) {
        ReceiptItem item = new ReceiptItem(productName, ppUnit, qty);
        receiptItems.add(item);
    }

    public void RemoveReceiptItem(String productName) {
        for (ReceiptItem item : receiptItems) {
            if (item.GetProductName().equals(productName)) {
                receiptItems.remove(item);
                return;
            }
        }
    }

    public void FinaliseSell() throws Exception {
        if (!IsFinalised()) {
            receiptItems.forEach((item) -> {
                total += item.GetTotal();
            });
        } else {
            throw new Exception("Receipt already finalised!");
        }
    }

    public boolean IsFinalised() {
        return total != 0;
    }
}
