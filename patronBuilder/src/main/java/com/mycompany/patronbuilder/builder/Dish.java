/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder.builder;

import java.util.List;

/**
 *
 * @author Andres Rios
 */
public class Dish {
    
    String name;
    String description;
    String image;
    int price;
    EnumSize size;
    List<Dish> parts;

    /**
     * Calcula el precio de las partes de un plato
     * @return
     */
    public String calculatePriceParts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getParts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
