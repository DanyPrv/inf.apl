/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.square;

import com.ace.pluginsapplication.interfaces.*;
import java.awt.Point;
import java.util.*;

/**
 *
 * @author catalin
 */
public class Square implements IShape {

    Point.Float center;
    float length;

    public Square() {
        center = new Point.Float();
        length = 0;
    }

    @Override
    public void draw() {
        System.out.println("Patrat:");
        System.out.println("Centrul:\nX:" + center.x + "\tY:" + center.y);
        System.out.println("Lungimea laturii: " + length + "\n");
    }

    @Override
    public void read() {
        System.out.print("Coordonatele centrului:\nX:");
        Scanner in = new Scanner(System.in);
        center.x = in.nextFloat();
        System.out.print("Y:");
        center.y = in.nextFloat();
        System.out.print("Lungime:");
        this.length = in.nextFloat();

    }

}
