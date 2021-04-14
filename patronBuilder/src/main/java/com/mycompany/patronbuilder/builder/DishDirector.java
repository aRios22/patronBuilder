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
public class DishDirector {
    
    DishBuilder dishBuilder;
    
    /**
     * Cambia el valor del atributo dishBuilder
     * @param dishBuilder nuevo valor para el atributo
     */
    public void setDishBuilder(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }
    
    /**
     * Retorna el valor actual del atributo dishBuilder
     * @return Valor de dishBuilder
     */
    public Dish getDish() {
        return this.dishBuilder.getDish();
    }

    /**
     * Construye un plato por partes
     */
    public void buildDish() {
        
        dishBuilder        
                .setCore()
                .addParts()
                .setSize();
               
                    
    }
  
}
