/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.orientalApp;

import co.unicauca.restaurant.orientalApp.OrientalDish;
import co.unicauca.restaurant.services.DishBuilder;
import co.unicauca.restaurant.domain.EnumSize;
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
        
        System.out.println("Ingrese el nombre del plato: ");
        String name = input.nextLine();
        System.out.println("Ingrese la descripcion del plato: ");
        String description = input.nextLine();
        System.out.println("Ingrese una imagen descriptiva del plato: ");
        String image = input.nextLine();
        System.out.println("Ingrese el precio del plato: ");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el nombre en menú del plato: ");
        String type = input.nextLine();
        
        this.dish = new OrientalDish(name, description, image, price, type);
        return this;

    }
    
    /**
     * Añade un nuevo componente a un plato oriental
     * @return 
     */
    @Override
    public OrientalDishBuilder addParts(){
        
        System.out.println("Ingrese el nombre del componente: ");
        String name = input.nextLine();
        System.out.println("Ingrese la descripcion del componente: ");
        String description = input.nextLine();
        System.out.println("Ingrese una imagen descriptiva del componente: ");
        String image = input.nextLine();
        System.out.println("Ingrese el precio del componente: ");
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
        System.out.println("Seleccione el tamaño del plato.");
        System.out.println("1. Grande");
        System.out.println("2. Mediano");
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
