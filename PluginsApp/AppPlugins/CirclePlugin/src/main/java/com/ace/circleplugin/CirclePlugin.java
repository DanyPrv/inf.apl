/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.circleplugin;

import com.ace.pluginsapplication.interfaces.*;

/**
 *
 * @author catalin
 */
public class CirclePlugin implements IPluginsAppPlugin {

    @Override
    public String getUniqueNameText() {
        return "CirclePlugin";
    }

    @Override
    public String getDisplayText() {
        return "Cerc";
    }

    @Override
    public IShape getShape(IObserver observer) {
        return new Circle(observer);
    }

}
