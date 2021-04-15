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
public class OrientalDishBuilder extends DishBuilder {
    
    /**
     * Define las esreuctura central de un plato oriental, junto con su plato fuerte
     * @return 
     */
    @Override
    public OrientalDishBuilder setCore(){
        
        this.setDish(new OrientalDish("Arroz Oriental", 
        "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas",
        "", 56000, EnumSize.ALL, "East rice"));
        return this;

    }
    
    /**
     * Añade otras partes a un plato oriental
     * @return 
     */
    @Override
    public OrientalDishBuilder addParts(){
        
        return this;
    }
    
    /**
     * Cambia el tamaño de un plato oriental
     * @return 
     */
    @Override
    public OrientalDishBuilder setSize(){
        
        return this;
    }
    
}
