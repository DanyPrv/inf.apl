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
    private static Board board;
    private static Scanner input;

    public static void main(String[] args) {
        board = new Board();
        input = new Scanner(System.in);
        Menu mainMenu = initializeMainMenu();
        mainMenu.execute();
    }

    private static Menu initializeMainMenu() {
        ArrayList<IMenuItem> mainMenuItems = new ArrayList();
        ArrayList<IMenuItem> AddScreen = new ArrayList();
        ArrayList<IMenuItem> EditScreen = new ArrayList();

        AddScreen.add(new MenuItem("Cerc",
                1,
                (parameters) -> {
                    System.out.println("Coordonatele centrului:");
                    Point O = ReadPoint();
                    System.out.print("Lungimea razei: ");
                    float r = input.nextFloat();
                    board.AddForm(new Circle(O, r));
                }));

        AddScreen.add(new MenuItem("Patrat",
                2,
                (parameters) -> {
                    System.out.println("Coordonatele centrului:\n");
                    Point O = ReadPoint();
                    System.out.print("Lungimea laturii: ");
                    float r = input.nextFloat();
                    board.AddForm(new Square(O, r));
                }));

        mainMenuItems.add(new Menu("Adaugare", 1, AddScreen));

        mainMenuItems.add(new MenuItem("Stergere",
                2,
                (parameters) -> {
                    System.out.println("Coordontatele centrului:");
                    Point O = ReadPoint();
                    System.out.print("Lungimea razei/laturii: ");
                    float length = input.nextFloat();
                    if (!board.Remove(O, length)) {
                        System.out.println("Forma geometrica inexistenta!");
                    }
                }));

        EditScreen.add(new MenuItem("Cerc",
                1,
                (parameters) -> {
                    System.out.println("Coordontatele centrului:");
                    Point O = ReadPoint();
                    System.out.print("Lungimea razei: ");
                    float length = input.nextFloat();
                    if (!board.Remove(O, length)) {
                        System.out.println("Forma geometrica inexistenta!");
                        return;
                    }
                    System.out.println("Coordontatele noului centru:");
                    O = ReadPoint();
                    System.out.print("Lungimea razei: ");
                    length = input.nextFloat();
                    board.AddForm(new Circle(O, length));
                }));

        EditScreen.add(new MenuItem("Patrat",
                2,
                (parameters) -> {
                    System.out.println("Coordontatele centrului:");
                    Point O = ReadPoint();
                    System.out.print("Lungimea laturii: ");
                    float length = input.nextFloat();
                    if (!board.Remove(O, length)) {
                        System.out.println("Forma geometrica inexistenta!");
                        return;
                    }
                    System.out.println("Coordontatele noului centru:");
                    O = ReadPoint();
                    System.out.print("Lungimea laturii: ");
                    length = input.nextFloat();
                    board.AddForm(new Square(O, length));
                }));

        mainMenuItems.add(new Menu("Modificare", 3, EditScreen));

        mainMenuItems.add(new MenuItem("Vizualizare plansa",
                4,
                (parameters) -> {
                    board.PrintAllForms();
                }));
        return new Menu("Meniu principal", 0, mainMenuItems);
    }

    private static Point ReadPoint() {
        System.out.print("X: ");
        float x = input.nextFloat();
        System.out.print("Y: ");
        float y = input.nextFloat();
        return new Point(x, y);
    }
}
