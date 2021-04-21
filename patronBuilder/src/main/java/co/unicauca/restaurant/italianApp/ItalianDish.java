/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.italianApp;

import co.unicauca.restaurant.domain.Dish;


/**
 *
 * @author Rojas
 */
public class ItalianDish extends Dish {
    String type;

    /**
     * Constructor parametrizado de la clase Italian Dish.
     * @param name
     * @param description
     * @param image
     * @param price
     * @param size
     * @param east_rice 
     */
    ItalianDish(String name, String description, String image, int price, String type) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.type = type;
    }
    
        /**
     * Constructor parametrizado de la clase Italian Dish usado para construir componentes de un plato.
     * @param name
     * @param description
     * @param image
     * @param price
     */
    ItalianDish(String name, String description, String image, int price) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price; 
    }
    
}
