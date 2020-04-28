/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geometric;

import java.util.*;

/**
 *
 * @author Daniel
 */
public class Board {

    List<Shape> geometricForms;
    //shape
    Board() {
        geometricForms = new ArrayList<>();
    }

    public void AddForm(Shape geometricForm) {
        geometricForms.add(geometricForm);
    }

    public void PrintAllForms() {
        System.out.println("Obiecte:");
        for (Shape obj : geometricForms) {
            System.out.print(geometricForms.indexOf(obj)+": ");
            obj.Print();
        }
    }

    public boolean Remove(int index) {
        //remove by index
        if(geometricForms.size()>=index||index<0)
            return false;
        geometricForms.remove(index);
        return true;
    }

    public boolean ModifyObject(Shape oldObject, Shape newObject) {
        if (geometricForms.remove(oldObject)) {
            return geometricForms.add(newObject);
        }
        return false;
    }
}
