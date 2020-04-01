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
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //Store store = new Store("S.C. La Colt S.R.L.","RO2026813");
        Stock stock = new Stock();
        stock.Add(new Product("ulei", 12.3f), 10);
        System.out.println(stock.GetQunaity("Ulei"));
    }

}
