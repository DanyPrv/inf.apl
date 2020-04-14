/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geometric;

/**
 *
 * @author Daniel
 */
public class Circle implements Shape {

    Point O;
    float radius;

    public Circle(Point O, float radius) {
        this.O = O;
        this.radius = radius;
    }

    @Override
    public void Print() {
        System.out.println("Cerc: ");
        System.out.println("raza: " + radius + " centrul: " + O.x + ", " + O.y);
        System.out.println();
    }

    @Override
    public boolean Equal(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        return this.O.Equal(((Circle) obj).O) && this.radius == ((Circle) obj).radius;
    }
}
