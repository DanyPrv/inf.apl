/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.rhomb;

import com.ace.pluginsapplication.interfaces.*;
import java.awt.Point;
import java.util.*;

/**
 *
 * @author catalin
 */
public class Rhomb implements IShape {

    Point.Float center;
    float length=0;
    float longDiagonal=0;
    float shortDiagonal=0;

    public Rhomb() {
        center = new Point.Float();
    }

    @Override
    public void draw() {
        System.out.println("Romb:");
        System.out.println("Centrul:\nX:" + center.x + "\tY:" + center.y);
        System.out.println("Lungimea laturii: " + length + "\n");
        System.out.println("Lungimea diagonalei principale: " + longDiagonal);
        System.out.println("Lungimea diagonalei secundare: " + shortDiagonal);
    }

    @Override
    public void read() {
        System.out.print("Coordonatele centrului:\nX:");
        Scanner in = new Scanner(System.in);
        center.x = in.nextFloat();
        System.out.print("Y:");
        center.y = in.nextFloat();
        System.out.print("Lungimea laturii:");
        this.length = in.nextFloat();
        System.out.print("Lungimea diagonalei principale:");
        this.longDiagonal = in.nextFloat();
        System.out.print("Lungimea diagonalei secundare:");
        this.shortDiagonal = in.nextFloat();
    }

}
