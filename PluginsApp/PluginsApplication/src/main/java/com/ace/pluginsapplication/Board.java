/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import com.ace.pluginsapplication.interfaces.IShape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Board {

    List<IShape> figures;

    public Board() {
        figures = new ArrayList<>();
    }

    public void AddShape(IShape shape) {
        figures.add(shape);
    }

    public void PrintBoard() {
        figures.forEach((shape) -> {
            System.out.println("Figura " + figures.indexOf(shape) + ":");
            shape.draw();
        });
    }

    public boolean DeleteShape(int index) {
        if (index >= figures.size() || index < 0) {
            return false;
        }
        figures.remove(index);
        return true;
    }
}
