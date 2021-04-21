/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.orientalApp;

import co.unicauca.restaurant.domain.Dish;


/**
 *
 * @author Andres Rios
 */
public class OrientalDish extends Dish{

    String type;

    /**
     * Constructor parametrizado de la clase Oriental Dish.
     * @param name
     * @param description
     * @param image
     * @param price
     * @param size
     * @param east_rice 
     */
    OrientalDish(String name, String description, String image, int price, String type) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.type = type;
    }
    
        /**
     * Constructor parametrizado de la clase Oriental Dish usado para construir componentes de un plato.
     * @param name
     * @param description
     * @param image
     * @param price
     */
    OrientalDish(String name, String description, String image, int price) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price; 
    }
    
}
