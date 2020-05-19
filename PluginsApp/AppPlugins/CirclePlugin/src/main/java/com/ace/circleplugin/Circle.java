/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.circleplugin;

import com.ace.pluginsapplication.interfaces.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class Circle extends Subject implements IShape {

    Point.Float center;
    float radius;

    public Circle(IObserver observer) {
        center = new Point.Float();
        radius = 0;
        this.RegisterObserver(observer);
    }

    @Override
    public void draw() {
        System.out.println("Cerc:");
        System.out.println("Centrul:\nX:" + center.x + "\tY:" + center.y);
        System.out.println("Lungimea razei: " + radius + "\n");
    }

    @Override
    public void read() {
        System.out.print("Coordonatele centrului:\nX:");
        Scanner in = new Scanner(System.in);
        center.x = in.nextFloat();
        System.out.print("Y:");
        center.y = in.nextFloat();
        System.out.print("Lungimea razei:");
        this.radius = in.nextFloat();
        NotifyObserver(RectangleInscription());

    }

    @Override
    public List<Point.Float> RectangleInscription() {
        List<Point.Float> list = new ArrayList<>();
        list.add(new Point.Float(center.x - radius / 2, center.y - radius / 2));
        list.add(new Point.Float(center.x + radius / 2, center.y + radius / 2));
        return list;
    }

}
