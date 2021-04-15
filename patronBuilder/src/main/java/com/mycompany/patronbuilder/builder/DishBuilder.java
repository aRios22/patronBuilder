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
public abstract class DishBuilder {
    
    Dish dish;
    
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
    public abstract DishBuilder addParts();
    
    /**
     * Definicion metodo de interfaz
     * @return 
     */
    public abstract DishBuilder setSize();

}
