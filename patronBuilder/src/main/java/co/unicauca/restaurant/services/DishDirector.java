/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.services;

import co.unicauca.restaurant.domain.Dish;

/**
 *
 * @author Andres Rios
 */
public class DishDirector {

    private DishBuilder dishBuilder;

    /**
     * Cambia el valor del atributo dishBuilder
     *
     * @param dishBuilder nuevo valor para el atributo
     */
    public void setDishBuilder(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }

    /**
     * Retorna el valor actual del atributo dishBuilder
     *
     * @return Valor de dishBuilder
     */
    public Dish getDish() {
        return this.dishBuilder.getDish();
    }

    /**
     * Construye un plato por partes
     */
    public void buildDish() {
        boolean masPartes = true;
        dishBuilder.setCore();
        while(masPartes){
            masPartes = dishBuilder.addParts();
        }
        dishBuilder.setSize();

    }

}
