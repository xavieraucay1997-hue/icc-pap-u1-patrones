package org.example.creacionales.builder;

import java.util.List;

/** 
     * 
     * Pizza clase inmutable
     * 
     * representa una pizza ya configurada
    */

public final class Pizza {

    private String size;
    private final List<String> ingredientes;

	protected Pizza(String size, List<String> ingredientes) {
		this.size = size;
		this.ingredientes = ingredientes;
	}

    public String descripcion(){
        return "pizza" + size + " con: " + ingredientes;
    }

    



}
