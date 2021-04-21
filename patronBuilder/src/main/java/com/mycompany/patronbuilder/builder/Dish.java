/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder.builder;

import java.util.ArrayList;
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
    List<Dish> parts = new ArrayList<Dish>();

    /**
     * Calcula el precio de las partes de un plato, si el tamaño del plato es medio, el precio se reduce a 60%
     * @return Precio del lato completo
     */
    public String calculatePriceParts() {
        float totalPrice = this.price;
        for (Dish part : this.parts) {
            totalPrice += part.price;
        }
        if(this.size == EnumSize.HALF){
            totalPrice = (float) (totalPrice * 0.6);
        }
        
        return Float.toString(totalPrice);
    }

    /**
     * Retorna las partes de un plato
     * @return lista de las partes de un plato
     */
    public List<Dish> getParts() {
        return this.parts;
    }
    
    
    @Override
    public String toString(){
        return "Name:" + this.name + " Description:" + this.description + " Image:" + this.image + " Price:" + this.price;
    }
    
}
