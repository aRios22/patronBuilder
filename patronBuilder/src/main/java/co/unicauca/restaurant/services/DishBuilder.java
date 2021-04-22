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
public abstract class DishBuilder {
    
    protected Dish dish;
    
    /**
     * Accede a el plato actual
     * @return  Objeto plato actual
     */
    public Dish getDish(){
        return this.dish;
    }
    
    /**
     * Redefine el valor del plato actual
     * @param dish
     */
    public void setDish(Dish dish){
        this.dish = dish;
    }
     
    /**
     * Definicion metodo de interfaz
     * @return 
     */
    public abstract DishBuilder setCore();
    
    /**
     * Definicion metodo de interfaz
     * @return 
     */
    public abstract boolean addParts();
    
    /**
     * Definicion metodo de interfaz
     * @return 
     */
    public abstract DishBuilder setSize();

}
