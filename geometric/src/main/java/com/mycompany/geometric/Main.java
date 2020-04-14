/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geometric;

import java.util.*;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu mainMenu = initializeMainMenu();
        mainMenu.execute();
    }

    private static Menu initializeMainMenu() {
        ArrayList<IMenuItem> mainMenuItems = new ArrayList();
        ArrayList<IMenuItem> Screen2Items = new ArrayList();

        Screen2Items.add(new MenuItem("Cerc",
                1,
                (parameters) -> {
                    encodeUsingBase64();
                }));

        Screen2Items.add(new MenuItem("Patrat",
                2,
                (parameters) -> {
                    encodeUsingBase64();
                }));

        mainMenuItems.add(new Menu("Adaugare", 1, Screen2Items));

        mainMenuItems.add(new MenuItem("Stergere",
                2,
                (parameters) -> {
                    encodeUsingCaesar();
                }));

        mainMenuItems.add(new MenuItem("Modificare",
                3,
                (parameters) -> {
                    encodeUsingCaesar();
                }));

        mainMenuItems.add(new MenuItem("Vizualizare plansa",
                4,
                (parameters) -> {
                    encodeUsingCaesar();
                }));

        return new Menu("Main Menu", 0, mainMenuItems);

    }

    private static String readStringWithMessage(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String readInputFile() {
        return readStringWithMessage("Enter input file: ");
    }

    private static String readOutputFile() {
        return readStringWithMessage("Enter output file: ");
    }

    private static void encodeUsingBase64() {
        //encodeTextStream(new TextStreamEncoder(base64Encoder));
    }

    private static void encodeUsingCaesar() {
        //encodeTextStream(new TextStreamEncoder(caesarEncoder));
    }
}
