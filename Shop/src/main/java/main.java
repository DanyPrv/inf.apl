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
        Stock stock = new Stock();
        CashRegiter cashRegister = new CashRegiter("RO6859662", "S.C. La Colt S.R.L.");
        Employee seller = new Employee(stock,cashRegister, false, "Vali");
        Employee admin = new Employee(stock,cashRegister, true, "Mihai");
        admin.AddToStock("orez", 10, (float) 8.5);
        admin.AddToStock("paine", 12, (float) 1);
        admin.AddToStock("zahar", 12, (float) 2.7);
        admin.AddToStock("faina", 12, (float) 1.8);
        admin.PrintStock();
        cashRegister.SetEmployeeName(seller.GetName());
        seller.AddProductOnReceipt("orez", 1);
        seller.AddProductOnReceipt("paine", 2);
        seller.PrintReceipt();
        admin.PrintStock();
    }
}
