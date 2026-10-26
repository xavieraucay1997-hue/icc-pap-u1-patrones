package org.example.creacionales.builder;
/**
 * Objeto Builder 
 * PizzaBuilder acumular las opciones de una pizza 
 * y creara el producto(objeto(Pizza)) cuando se le pida 
 * al metodo construir(build)
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PizzaBuilder {
  private String size = "mediana"; 
   private List<String> ingredientes = new ArrayList<>(); 

   //private String size; 
   //private List<String> ingredientes;

  // public PizzaBuilder(){
   // this.size = "mediana"; 
    //this.ingredientes = new lin 
    //this.ingredientes.add("queso");

   //}

    public PizzaBuilder setSize(String size){
        this.size = size; 
        return this; 
    }

    public PizzaBuilder addIng(String ing){
        boolean contiene = ingredientes.contains(ing);
        if (contiene)
            return this;
        

        
        this.ingredientes.add(ing);
        return this;
    }

    public Pizza build(){
        return new Pizza(size, ingredientes);
    }

}
