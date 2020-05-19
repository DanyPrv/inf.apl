/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.triangle;

import com.ace.pluginsapplication.interfaces.*;

/**
 *
 * @author catalin
 */
public class TrianglePlugin implements IPluginsAppPlugin {

    @Override
    public String getUniqueNameText() {
        return "TrianglePlugin";
    }

    @Override
    public String getDisplayText() {
        return "Triunghi";
    }

    @Override
    public IShape getShape(IObserver observer) {
        return new Triangle(observer);
    }

}
