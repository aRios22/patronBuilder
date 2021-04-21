/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder.presentation;

import com.mycompany.patronbuilder.builder.Dish;
import com.mycompany.patronbuilder.builder.DishBuilder;
import com.mycompany.patronbuilder.builder.DishDirector;
import com.mycompany.patronbuilder.builder.OrientalDishBuilder;
import com.mycompany.patronbuilder.builder.ItalianDishBuilder;
import java.util.Scanner;

/**
 *
 * @author Andres Rios
 */
public class ClientMain {

    public static void main(String[] args) {
        int opc;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("*.- Menu.-*");
            System.out.println("1.- Oriental Dish");
            System.out.println("2.- Italian Dish");
            System.out.println("3.- Exit");
            System.out.println("INGRESE OPCION:");
            opc = input.nextInt();

            if (opc == 1) {
                System.out.println("Oriental Dish");
                DishDirector director = new DishDirector();
                DishBuilder orientalBuilder = new OrientalDishBuilder();
                director.setDishBuilder(orientalBuilder);
                director.buildDish();

                Dish dish = director.getDish();
                System.out.println("Oriental Dish:" + dish.toString());
                System.out.println("Sus partes: " + dish.getParts().toString());
                System.out.println("Precio de las partes: " + dish.calculatePriceParts());
            }

            if (opc == 2) {
                System.out.println("Italian Dish");
                DishDirector directorI = new DishDirector();
                DishBuilder italianBuilder = new ItalianDishBuilder();
                directorI.setDishBuilder(italianBuilder);
                directorI.buildDish();

                Dish dishI = directorI.getDish();
                System.out.println("Italian Dish:" + dishI.toString());
                System.out.println("Sus partes: " + dishI.getParts().toString());
                System.out.println("Precio de las partes: " + dishI.calculatePriceParts());
            }

            if (opc == 3) {
                System.exit(0);
            }
        } while (opc <= 3);
    }
}
