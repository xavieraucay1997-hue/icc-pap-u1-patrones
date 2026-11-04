package org.example.estructurales.composite;

public class AppComposite {
    public static void main(String[] args) {
        GrupoMenu combo = new GrupoMenu(); 
        GrupoMenu hamburguesa = new GrupoMenu();



    hamburguesa.addItem(new ProductoMenu("Queso", 0.50));
    hamburguesa.addItem(new ProductoMenu("Carne", 1.00));
    hamburguesa.addItem(new ProductoMenu("Pan", 0.50));
    hamburguesa.addItem(new ProductoMenu("Lechuga", 0.25));

    ProductoMenu bebida = new ProductoMenu("CocaCola", 1.35);
    
        combo.addItem(hamburguesa);            //Agregue un GM"
        combo.addItem(bebida);                  //Agregue un PM"


        System.out.println("Total del combo $" + combo.precio());
    

        
    }
    
}
