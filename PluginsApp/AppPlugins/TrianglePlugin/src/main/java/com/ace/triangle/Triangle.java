/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.triangle;

import com.ace.pluginsapplication.interfaces.*;
import java.awt.Point;
import java.util.*;

/**
 *
 * @author catalin
 */
public class Triangle implements IShape {

    Point.Float A;
    Point.Float B;
    Point.Float C;

    public Triangle() {
        A = new Point.Float();
        B = new Point.Float();
        C = new Point.Float();
    }

    @Override
    public void draw() {
        System.out.println("Triunghi:");
        System.out.println("A: X:" + A.x + "Y:" + A.y);
        System.out.println("B: X:" + B.x + "Y:" + B.y);
        System.out.println("C: X:" + C.x + "Y:" + C.y);
    }

    @Override
    public void read() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("A:\nX:");
        
        A.x = in.nextFloat();
        System.out.print("Y:");
        A.y = in.nextFloat();
        
        System.out.print("B:\nX:");
        B.x = in.nextFloat();
        System.out.print("Y:");
        B.y = in.nextFloat();
        
        System.out.print("C:\nX:");
        C.x = in.nextFloat();
        System.out.print("Y:");
        C.y = in.nextFloat();
    }

}
