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
public class Product {

    private String name;
    private Map<String, String> caractristics;
    private String description;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void AddDescription(String description) {
        this.description = description;
    }

    public void AddCaracteristics(String name, String value) {
        caractristics.put(name, value);
    }

    public void SetPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> GetAllCaracteristics() {
        return this.caractristics;
    }

    public String GetCaracteristic(String name) {
        return this.caractristics.get(name);
    }

}
