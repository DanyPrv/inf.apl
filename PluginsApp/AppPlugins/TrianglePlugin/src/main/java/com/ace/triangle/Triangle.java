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
public class Triangle extends Subject implements IShape {

    Point.Float A;
    Point.Float B;
    Point.Float C;

    public Triangle(IObserver observer) {
        A = new Point.Float();
        B = new Point.Float();
        C = new Point.Float();
        this.RegisterObserver(observer);
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
        NotifyObserver(RectangleInscription());
    }

    @Override
    public List<Point.Float> RectangleInscription() {
        List<Point.Float> list = new ArrayList<>();
        list.add(new Point.Float(Math.min(Math.min(A.x, B.x), C.x),
                Math.min(Math.min(A.y, B.y), C.y)));
        list.add(new Point.Float(Math.max(Math.max(A.x, B.x), C.x),
                Math.max(Math.max(A.y, B.y), C.y)));
        return list;
    }
}
