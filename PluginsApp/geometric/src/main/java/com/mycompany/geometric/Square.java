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
public class Square implements Shape {

    List<Point> points;

    public Square(Point center, float lenghtOfEdges) {
        float half = lenghtOfEdges / 2;
        points = new ArrayList<>();
        points.add(new Point(center.x - half, center.y - half));
        points.add(new Point(center.x - half, center.y + half));
        points.add(new Point(center.x + half, center.y + half));
        points.add(new Point(center.x + half, center.y - half));
    }

    @Override
    public boolean Equal(Shape obj) {
        if (!(obj instanceof Square)) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (!this.points.get(i).Equal(((Square) obj).points.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Point getCenter() {
        float x = 0, y = 0;
        for (Point p : points) {
            x += p.x;
            y += p.y;
        }
        return new Point(x / 4, y / 4);
    }

    @Override
    public void Print() {
        Point G = this.getCenter();
        System.out.println("Patrat:\nCentrul: " + G.x + " " + G.y);
        points.forEach((point) -> {
            System.out.println(point.x + " " + point.y);
        });
        System.out.println();
    }

}
