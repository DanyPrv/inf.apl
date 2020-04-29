/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import com.ace.pluginsapplication.interfaces.IShape;

/**
 *
 * @author catalin
 */
public class PluginApp {
    
    public static void main(String[] args)
    {
        PluginManager pluginMan = new PluginManager();
       
        ApplicationMenu menu = new ApplicationMenu(pluginMan);
        menu.load();
        menu.execute();        
    }
    
}
