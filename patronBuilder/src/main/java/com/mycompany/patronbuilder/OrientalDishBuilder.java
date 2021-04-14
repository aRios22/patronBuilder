/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder;

/**
 *
 * @author Andres Rios
 */
public class OrientalDishBuilder extends DishBuilder {
    
    @Override
    public void setCore(){
        
        this.setDish(new OrientalDish("Arroz Oriental", 
        "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas",
        "", 56000, EnumSize.ALL, "East rice"));
        
    }
    
    @Override
    public void addParts(){
        
    }
    
    @Override
    public void setSize(){
        
    }
    
}
