/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication.interfaces;

import java.awt.Point;
import java.util.List;

/**
 *
 * @author catalin
 */
public interface IShape {

    void draw();

    void read();

    List<Point.Float> RectangleInscription();
}
