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
    
    @Override
    public OrientalDishBuilder setCore(){
        
        this.setDish(new OrientalDish("Arroz Oriental", 
        "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas",
        "", 56000, EnumSize.ALL, "East rice"));
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
    @Override
    public OrientalDishBuilder addParts(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public OrientalDishBuilder setSize(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrientalDishBuilder setDish(Dish dish) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
