/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
import java.util.*;

public class Stock {

    private final List<Product> productList;

    public Stock() {
        productList = new ArrayList<Product>();
    }

    public void AddProduct(Product product) {

        productList.add(product);
    }

    public void AddProduct(String name, float price, int quantity) {
        productList.add(new Product(name, price, quantity));
    }

    public Product GetProduct(String Name) {
        for (Product product : productList) {
            if (product.GetName().equals(Name)) {
                return product;
            }
        }
        return null;
    }

    public void SetQuantity(String Name, int quantity) {
        for (Product product : productList) {
            if (product.GetName().equals(Name)) {
                product.SetQuantity(quantity);
                return;
            }
        }
    }

    public void SetPrice(String Name, float price) {
        for (Product product : productList) {
            if (product.GetName().equals(Name)) {
                product.SetPrice(price);
                return;
            }
        }
    }

    public void PrintStock() {
        System.out.println();
        System.out.println("Stock:");
        System.out.println("Nume\tPret\tCantitate");
        productList.forEach(product -> System.out.println(product.GetName()
                + "\t" + product.GetPrice() + "\t" + product.GetQuantity()));
    }
}
