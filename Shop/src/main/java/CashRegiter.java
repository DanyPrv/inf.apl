
import java.util.*;
import java.util.Map.Entry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel
 */
public class CashRegiter {

    private String shopName;
    private String CUI;
    private String sellerName;
    private List<Product> productList;
    private List<Integer> productQuantity;

    public CashRegiter(String CUI, String shopName) {
        this.CUI = CUI;
        this.shopName = shopName;
        productList = new ArrayList<Product>();
        productQuantity = new ArrayList<Integer>();
    }
    public void SetEmployeeName(String name){
        this.sellerName=name;
    }
    public void AddProduct(Product product, int quantity) {
        if(sellerName==null){
            System.out.println("Specificati mai intai numele angajatului");
            return;
        }
        productList.add(product);
        productQuantity.add(quantity);
    }

    public void CreateReceipt() {
        if(sellerName==null){
            System.out.println("Specificati mai intai numele angajatului");
            return;
        }
        if(productList.isEmpty())
        {
            System.out.println("Nu exista produs de tiparit pe bonul fiscal");
            return;
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Bon Fiscal:");
        System.out.println(shopName);
        System.out.println("CUI: "+CUI);
        System.out.println("Nume vanzator: "+sellerName);
        System.out.println();
        System.out.println("Producse:");
        float total = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            System.out.print(product.GetName() + "     ");
            System.out.print(productQuantity.get(i) + "     ");
            System.out.println(product.GetPrice() * productQuantity.get(i));
            total+= product.GetPrice() * productQuantity.get(i);
        }
        System.out.println("----------------------");
        System.out.println("Total:\t\t"+total);
        productList.clear();
        productQuantity.clear();
        System.out.println("------------------------------------------------------------------------");
    }
}
