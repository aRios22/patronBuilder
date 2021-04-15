/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder.builder;

/**
 *
 * @author Andres Rios
 */
public class OrientalDish extends Dish{

    String orientalName;

    /**
     * Constructor parametrizado de la clasee Oriental Dish.
     * @param name
     * @param description
     * @param image
     * @param price
     * @param size
     * @param east_rice 
     */
    OrientalDish(String name, String description, String image, int price, EnumSize size, String east_rice) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.size = size;
        this.orientalName = east_rice;
    }
    
    
}
