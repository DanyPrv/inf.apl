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

    List<Object> geometricForms;

    Board() {
        geometricForms = new ArrayList<>();
    }

    public void AddForm(Object geometricForm) {
        geometricForms.add(geometricForm);
    }

    public void PrintAllForms() {
        System.out.println("Obiecte:");
        for (Object obj : geometricForms) {
            if (obj instanceof Shape) {
                ((Shape) obj).Print();
            }
        }
    }

    public boolean Remove(Point Center, float length) {
        for (Object obj : geometricForms) {

            if (obj instanceof Square) {
                if (((Square) obj).Equal(new Square(Center, length))) {
                    geometricForms.remove(obj);
                    return true;
                }
            } else if (obj instanceof Circle) {
                if (((Circle) obj).Equal(new Circle(Center, length))) {
                    geometricForms.remove(obj);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ModifyObject(Object oldObject, Object newObject) {
        if (geometricForms.remove(oldObject)) {
            return geometricForms.add(newObject);
        }
        return false;
    }
}
