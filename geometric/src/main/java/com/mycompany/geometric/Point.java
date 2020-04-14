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
public class Point {
    float x,y;
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public boolean Equal(Point obj){
        return this.x==obj.x&&this.y==obj.y;
    }
}
