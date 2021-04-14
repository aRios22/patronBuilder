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
    
    
    public Dish getDish(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    public abstract DishBuilder setCore();
    
    public abstract DishBuilder addParts();
    
    public abstract DishBuilder setSize();
    
    public abstract DishBuilder setDish(Dish dish);

}
