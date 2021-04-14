/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder.presentation;

import com.mycompany.patronbuilder.Dish;
import com.mycompany.patronbuilder.DishBuilder;
import com.mycompany.patronbuilder.DishDirector;
import com.mycompany.patronbuilder.OrientalDishBuilder;

/**
 *
 * @author Andres Rios
 */
public class ClientMain {
    
   public static void main(String[] args) {
        
       DishDirector director = new DishDirector();
       DishBuilder orientalBuilder = new OrientalDishBuilder();
       director.setDishBuilder(orientalBuilder);
       director.buildDish();
       
       Dish dish = director.getDish();
       System.out.println("Oriental dish:" + dish);
       System.out.println("Sus partes: " + dish.getParts().toString());
       System.out.println("Precio de las partes: " + dish.calculatePriceParts());
       
    } 
}
