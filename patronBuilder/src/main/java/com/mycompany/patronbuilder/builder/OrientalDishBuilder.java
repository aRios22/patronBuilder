/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder.builder;

import java.util.Scanner;

/**
 *
 * @author Andres Rios
 */
public class OrientalDishBuilder extends DishBuilder {
    
    Scanner input = new Scanner(System.in);
    
    /**
     * Define las esreuctura central de un plato oriental, junto con su plato fuerte
     * @return 
     */
    @Override
    public OrientalDishBuilder setCore(){

        /*this.setDish(new OrientalDish("Arroz Oriental", 
        "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas",
        "", 56000, EnumSize.ALL, "East rice"));*/
        
        System.out.println("Ingrese el nombre del plato");
        String name = input.next();
        System.out.println("Ingrese la descripcion del plato");
        String description = input.next();
        System.out.println("Ingrese una imagen descriptiva del plato");
        String image = input.next();
        System.out.println("Ingrese el precio del plato");
        int price = input.nextInt();
        System.out.println("Ingrese el tamaño del plato ALL o HALF");
        EnumSize size = EnumSize.valueOf(input.next().toUpperCase());
        System.out.println("Ingrese el nombre en menú del plato");
        String type = input.next();
        
        this.dish.parts.add(new OrientalDish(name, description, image, price, size, type));
        return this;

    }
    
    /**
     * Añade un nuevo componente a un plato oriental
     * @return 
     */
    @Override
    public OrientalDishBuilder addParts(){
        
        System.out.println("Ingrese el nombre del componente");
        String name = input.next();
        System.out.println("Ingrese la descripcion del componente");
        String description = input.next();
        System.out.println("Ingrese una imagen descriptiva del componente");
        String image = input.next();
        System.out.println("Ingrese el precio del componente");
        int price = input.nextInt();
        
        this.dish.parts.add(new OrientalDish(name, description, image, price));
        return this;
    }
    
    /**
     * Cambia el tamaño de un plato oriental
     * @return 
     */
    @Override
    public OrientalDishBuilder setSize(){
        System.out.println("1. ALL");
        System.out.println("2. HALF");
        int vSize = input.nextInt();
        
        switch (vSize) {
            case 1:
                this.dish.size = EnumSize.ALL;
                break;
            case 2:
                this.dish.size = EnumSize.HALF;
                break;
            default:
                System.out.println("Invalid Option.");
                this.setSize();
                break;
        }
        return this;
    }
    
}
