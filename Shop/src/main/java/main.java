/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class main {

    public static void main(String[] args) {
        //create stock and cash register
        Stock stock = new Stock();
        CashRegiter cashRegister = new CashRegiter("RO6859662", "S.C. La Colt S.R.L.");
        //add 2 basic employyes
        Employee seller = new Employee(stock, cashRegister, false, "Vali");
        Employee admin = new Employee(stock, cashRegister, true, "Mihai");
        //add stock products
        admin.AddToStock("orez", 10, (float) 8.5);
        admin.AddToStock("paine", 12, (float) 1);
        admin.AddToStock("zahar", 12, (float) 2.7);
        admin.AddToStock("faina", 12, (float) 1.8);
        //print initial stock 
        admin.PrintStock();
        //set seller name on cash register (without that can't create receipts)
        cashRegister.SetEmployeeName(seller.GetName());
        //sell products to first customer
        seller.AddProductOnReceipt("orez", 1);
        seller.AddProductOnReceipt("paine", 2);
        seller.PrintReceipt();
        //sell products to second customer
        seller.AddProductOnReceipt("zahar", 3);
        seller.AddProductOnReceipt("paine", 1);
        seller.AddProductOnReceipt("orez", 1);
        seller.PrintReceipt();
        //print final Stock
        admin.PrintStock();
    }
}
