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
public class Stock {

    private List<StockItem> stockItems;

    public Stock() {
        stockItems = new ArrayList<>();
    }

    public void Add(Product product, int qty) throws Exception {
        if (qty > 0) {
            for (int i = 0; i < stockItems.size(); i++) {

                if (stockItems.get(i).GetProduct().equals(product)) {
                    stockItems.get(i).SetQuantity(
                            qty + stockItems.get(i).GetQuantity());
                    return;
                }
            }
            stockItems.add(new StockItem(product, qty));
        } else {
            throw new Exception("Netagive qunatity!");
        }
    }

    public void RemoveProduct(Product product, int qty) throws Exception {
        if (!stockItems.remove(new StockItem(product, qty))) {
            throw new Exception("Error removing product!");
        }
    }

    public int GetQunaity(String productName) throws Exception {
        for (StockItem item : stockItems) {
            if (item.GetProduct().getName().equals(productName)) {
                return item.GetQuantity();
            }
        }
        throw new Exception("No product foud with name: " + productName);
    }

    public Product GetProduct(String productName) {
        for (StockItem item : stockItems) {
            if (item.GetProduct().getName().equals(productName)) {
                return item.GetProduct();
            }
        }
        return null;
    }
}
