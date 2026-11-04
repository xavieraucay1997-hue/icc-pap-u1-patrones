package org.example.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *composite porque Agrupa productos de elemento menu y calcula un precio en este caso es la sumatoria
 * de todos los elementos menu 
 * GrupoMenu
 */
public class GrupoMenu implements ElementoMenu {

    private List<ElementoMenu> items;

    public GrupoMenu(){
        items = new ArrayList<>();
    }


    @Override
    public double precio() {

    
        /*/ la suma de todos */
     //   double sun =0;
       // for(ElementoMenu elementoMenu : items);
        //suma = suma + elementoMenu.precio();


    //}
    //return suma; 
    return items.stream().mapToDouble(ElementoMenu :: precio).sum();
    }

    public void addItem(ElementoMenu _item){
        this.items.add(_item);
        
    }
}
