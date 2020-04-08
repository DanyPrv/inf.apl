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

    public void Add(Product product, int qty) {
        if (qty <= 0) {
            return;
        }
        for (int i = 0; i < stockItems.size(); i++) {

            if (stockItems.get(i).GetProduct().equals(product)) {
                stockItems.get(i).SetQuantity(
                        qty + stockItems.get(i).GetQuantity());
                return;
            }
        }
        stockItems.add(new StockItem(product, qty));
    }

    public void RemoveProduct(Product product, int qty) {
        for (StockItem item : stockItems) {
            if (item.GetProduct().equals(product)) {
                stockItems.remove(item);
            }
        }
    }

    public void SetQuantity(String productName, int qty) {
        for (StockItem item : stockItems) {
            if (item.GetProduct().getName().equals(productName)) {
                item.SetQuantity(qty);
                return;
            }
        }
    }

    public int GetQunaity(String productName) {
        for (StockItem item : stockItems) {
            if (item.GetProduct().getName().equals(productName)) {
                return item.GetQuantity();
            }
        }
        return 0;
    }

    public Product GetProduct(String productName) {
        for (StockItem item : stockItems) {
            if (item.GetProduct().getName().equals(productName)) {
                return item.GetProduct();
            }
        }
        return null;
    }

    public List<StockItem> GetAllProducts() {
        return this.stockItems;
    }
}
