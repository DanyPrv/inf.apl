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
 * @author Daniel
 */
public class Subject {

    IObserver observer;

    public void RegisterObserver(IObserver observer) {
        this.observer = observer;
    }

    public void NotifyObserver(List<Point.Float> list) {
        observer.Update(list);
    }
}
