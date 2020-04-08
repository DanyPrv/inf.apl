package com.mycompany.shop2;

import java.util.*;
import javafx.stage.Screen;

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
    private static Store shop;
    private static Administrator admin;
    private static Seller seller;
    private static Scanner input;

    private static void Screen1() {

        System.out.print("\n0. Exit\n1. Use as Administrator\n2. Use as Seller\nOption:");
        int option = input.nextInt();
        switch (option) {
            case 0:
                return;
            case 1:
                Screen2();
                break;
            case 2:
                Screen5();
                break;
            default:
                System.out.println("Wrong input!\n");
                Screen1();
                break;
        }
    }

    private static void Screen2() {
        System.out.print("\n0. Back\n1. Stock\n2. Cash registers\nOption: ");
        int option = input.nextInt();
        switch (option) {
            case 0:
                Screen1();
                break;
            case 1:
                Screen3();
                break;
            case 2:
                Screen4();
                break;
            default:
                System.out.println("Wrong input!\n");
                Screen2();
                break;
        }
    }

    private static void Screen3() {
        String productName;
        int qty;
        float price;
        System.out.print("\n0. Back\n"
                + "1. Add product\n"
                + "2. Remove product\n"
                + "3. View Stock\n"
                + "Option: ");
        int option = input.nextInt();
        switch (option) {
            case 0:
                Screen2();
                break;
            case 1:

                System.out.print("Product name: ");
                productName = input.next();
                System.out.print("Product quantity: ");
                qty = input.nextInt();
                System.out.print("Product price: ");
                price = input.nextFloat();
                admin.AddProductToStock(new Product(productName, price), qty);
                Screen3();
                break;
            case 2:
                System.out.print("Product name: ");
                productName = input.next();
                admin.RemoveProductFromStock(productName);
                Screen3();

            case 3:
                Stock stock = admin.GetStock();
                List<StockItem> list = stock.GetAllProducts();
                System.out.println("\nStock:");
                list.forEach((item) -> {
                    System.out.println(item.GetProduct().getName() + '\t'
                            + item.GetProduct().getPrice() + '\t'
                            + item.GetQuantity());
                });
                Screen3();
                break;
            default:
                System.err.print("Wrong input!\n");
                Screen3();
                break;
        }
    }

    private static void Screen4() {
        String uniqueIdentifier;
        System.out.print("\n0. Back\n"
                + "1. Add cash register\n"
                + "2. Remove cash register\n"
                + "3. View cash registers\n"
                + "Option:");
        int option = input.nextInt();
        switch (option) {
            case 0:
                Screen2();
                break;
            case 1:

                System.out.print("Cash Registe unique identifier: ");
                uniqueIdentifier = input.next();
                shop.AddNewCashRegister(uniqueIdentifier);
                Screen4();
                break;
            case 2:
                System.out.print("Cash Registe unique identifier: ");
                uniqueIdentifier = input.next();
                shop.RemoveCashRegister(uniqueIdentifier);
                Screen4();
                break;
            case 3:
                int i = 1;
                for (CashRegister item : shop.GetCashRegisters()) {
                    System.out.println(i++ + ". " + item.GetUniqueIdentifier());
                }
                Screen4();
                break;
            default:
                System.out.println("Wrong input!\n");
                Screen4();
                break;
        }
    }

    private static void Screen5() {
        System.out.print("\n0. Back\n"
                + "1. Start Sell\n"
                + "2. Search product\n"
                + "3. View Stock\n"
                + "Option: ");
        int option = input.nextInt();
        switch (option) {
            case 0:
                Screen1();
                break;
            case 1:
                String uniqueIdentifier;
                System.out.print("Cash Register unique identifier: ");
                uniqueIdentifier = input.next();
                if (shop.GetCashRegister(uniqueIdentifier) != null) {
                    seller.StartNewSell(shop.GetCashRegister(uniqueIdentifier));
                    Screen6(uniqueIdentifier);
                } else {
                    System.err.print("No cashregister found with this identifier!");
                    Screen5();
                }
                break;
            case 2:
                String productName;
                System.out.print("Product name: ");
                productName = input.next();
                Product product = seller.GetProduct(productName);
                if (product == null) {
                    System.out.println("No product found!");
                    Screen5();
                    return;
                }
                System.out.print(product.getName() + '\t' + product.getPrice()
                        + '\t' + seller.GetStock().GetQunaity(productName));
                Screen5();
                break;
            case 3:
                Stock stock = seller.GetStock();
                List<StockItem> list = stock.GetAllProducts();
                System.out.println("\nStock:");
                list.forEach((item) -> {
                    System.out.println(item.GetProduct().getName() + '\t'
                            + item.GetProduct().getPrice() + '\t'
                            + item.GetQuantity());
                });
                Screen5();
                break;
            default:
                System.out.print("Wrong input!\n");
                Screen5();
                break;
        }
    }

    private static void Screen6(String uniqueIdentifier) {
        String productName;
        int qty;
        Product product;
        System.err.print("\n0. Back\n"
                + "1. Add product to sell\n"
                + "2. Remove product\n"
                + "3. View current sell\n"
                + "4. Finalize sell\n"
                + "Option: ");
        int option = input.nextInt();
        switch (option) {
            case 0:
                Screen5();
                break;
            case 1:
                System.out.print("Product Name: ");
                productName = input.next();
                product = seller.GetProduct(productName);
                if (product == null) {
                    System.out.print("Product not found!");
                    Screen6(uniqueIdentifier);
                    return;
                }
                System.out.print("Product quantity: ");
                qty = input.nextInt();
                if (!seller.CheckProductStock(productName, qty)) {
                    System.out.println("Insuficient quantity!");
                    Screen6(uniqueIdentifier);
                    return;
                }
                seller.AddToSell(shop.GetCashRegister(uniqueIdentifier),
                        productName,
                        qty);
                Screen6(uniqueIdentifier);
                break;
            case 2:
                System.out.print("Product Name: ");
                productName = input.next();
                if (!seller.RemoveFromSell(shop.GetCashRegister(uniqueIdentifier), productName)) {
                    System.out.println("Product not found!");
                }
                Screen6(uniqueIdentifier);
                break;
            case 3:
                System.out.println("Product\tPrice\tQty\tTotal");
                List<ReceiptItem> list = shop.GetCashRegister(uniqueIdentifier).GetCurrentSell();
                list.forEach((item) -> {
                    System.out.println(item.GetProductName() + '\t'
                            + item.GetPPUnit() + '\t'
                            + item.GetQty() + '\t'
                            + item.GetPPUnit() * item.GetQty());
                });
                Screen6(uniqueIdentifier);
                break;
            case 4:
                shop.GetCashRegister(uniqueIdentifier).FinaliseSell();
                Screen6(uniqueIdentifier);
                break;
            default:
                System.out.println("Wrong input!\n");
                Screen5();
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        shop = new Store("S.C. La colt S.R.L", "RO123123123");
        admin = shop.AddNewAdmin("Marius", "0712372634", "Strada lalelelor Nr. 12");
        seller = shop.AddNewSeller("Mihai", "0724463728", "Bld Dacia Nr 32");
        shop.AddNewCashRegister("1234");
        input = new Scanner(System.in);
        Screen1();

    }

}
