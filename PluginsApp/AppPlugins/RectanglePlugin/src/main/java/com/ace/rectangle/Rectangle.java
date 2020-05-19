/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.rectangle;

import com.ace.pluginsapplication.interfaces.*;
import java.awt.Point;
import java.util.*;

/**
 *
 * @author catalin
 */
public class Rectangle extends Subject implements IShape {

    Point.Float center;
    float length = 0;
    float width = 0;

    public Rectangle(IObserver observer) {
        center = new Point.Float();
        this.RegisterObserver(observer);
    }

    @Override
    public void draw() {
        System.out.println("Dreptunghi:");
        System.out.println("Centrul:\nX:" + center.x + "\tY:" + center.y);
        System.out.println("Lungime: " + length);
        System.out.println("Latime: " + width);
    }

    @Override
    public void read() {
        System.out.print("Coordonatele centrului:\nX:");
        Scanner in = new Scanner(System.in);
        center.x = in.nextFloat();
        System.out.print("Y:");
        center.y = in.nextFloat();
        System.out.print("Lungimea:");
        this.length = in.nextFloat();
        System.out.print("Latime:");
        this.width = in.nextFloat();
        if (this.length < this.width) {
            float t = this.width;
            this.width = this.length;
            this.length = t;
        }
        NotifyObserver(RectangleInscription());
    }

    @Override
    public List<Point.Float> RectangleInscription() {
        List<Point.Float> list = new ArrayList<>();
        list.add(new Point.Float(center.x - length / 2, center.y - width / 2));
        list.add(new Point.Float(center.x + length / 2, center.y + width / 2));
        return list;
    }
}
