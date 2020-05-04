/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.rhomb;

import com.ace.pluginsapplication.interfaces.IPluginsAppPlugin;
import com.ace.pluginsapplication.interfaces.IShape;

/**
 *
 * @author catalin
 */
public class RhombPlugin implements IPluginsAppPlugin {

    @Override
    public String getUniqueNameText() {
        return "RombPlugin";
    }

    @Override
    public String getDisplayText() {
        return "Romb";
    }

    @Override
    public IShape getShape() {
        return new Rhomb();
    }

}
