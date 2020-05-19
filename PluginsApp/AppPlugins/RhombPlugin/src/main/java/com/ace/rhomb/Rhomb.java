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
public class Rhomb extends Subject implements IShape {

    Point.Float center;
    float longDiagonal = 0;
    float shortDiagonal = 0;

    public Rhomb(IObserver observer) {
        center = new Point.Float();
        this.RegisterObserver(observer);
    }

    @Override
    public void draw() {
        System.out.println("Romb:");
        System.out.println("Centrul:\nX:" + center.x + "\tY:" + center.y);
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
        System.out.print("Lungimea diagonalei principale:");
        this.longDiagonal = in.nextFloat();
        System.out.print("Lungimea diagonalei secundare:");
        this.shortDiagonal = in.nextFloat();
        NotifyObserver(RectangleInscription());
    }

    @Override
    public List<Point.Float> RectangleInscription() {
        List<Point.Float> list = new ArrayList<>();
        list.add(new Point.Float(center.x - longDiagonal / 2, center.y - shortDiagonal / 2));
        list.add(new Point.Float(center.x + longDiagonal / 2, center.y + shortDiagonal / 2));
        return list;
    }
}
