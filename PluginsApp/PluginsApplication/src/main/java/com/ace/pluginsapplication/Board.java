/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import java.util.ArrayList;
import java.util.List;
import com.ace.pluginsapplication.interfaces.*;
import java.awt.Point;

/**
 *
 * @author Daniel
 */
public class Board implements IObserver {

    List<IShape> figures;
    //Left down extreme Point, Right up extreme point
    Point.Float LD, RU;

    public Board() {
        figures = new ArrayList<>();
        LD = new Point.Float();
        RU = new Point.Float();
    }

    public void AddShape(IShape shape) {
        figures.add(shape);
    }

    public void PrintBoard() {
        figures.forEach((shape) -> {
            System.out.println("Figura " + figures.indexOf(shape) + ":");
            shape.draw();
        });
        System.out.print("Punctul inferior al plansei: ");
        System.out.println(LD.x + ", " + LD.y);
        System.out.print("Punctul superior al plansei: ");
        System.out.println(RU.x + ", " + RU.y);
    }

    public boolean DeleteShape(int index) {
        if (index >= figures.size() || index < 0) {
            return false;
        }
        figures.remove(index);
        return true;
    }

    @Override
    public void Update(List<Point.Float> list) {

        LD.x = Math.min(LD.x, Math.min(list.get(0).x, list.get(1).x));
        LD.y = Math.min(LD.y, Math.min(list.get(0).y, list.get(1).y));

        RU.x = Math.max(RU.x, Math.max(list.get(0).x, list.get(1).x));
        RU.y = Math.max(RU.y, Math.max(list.get(0).y, list.get(1).y));
        System.out.println("S-a modificat dimensiunea plaseii!");
    }

}
