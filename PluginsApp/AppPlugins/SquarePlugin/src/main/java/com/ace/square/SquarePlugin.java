/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.square;

import com.ace.pluginsapplication.interfaces.*;

/**
 *
 * @author catalin
 */
public class SquarePlugin implements IPluginsAppPlugin {

    @Override
    public String getUniqueNameText() {
        return "SquarePlugin";
    }

    @Override
    public String getDisplayText() {
        return "Patrat";
    }

    @Override
    public IShape getShape(IObserver observer) {
        return new Square(observer);
    }

}
