package org.example.creacionales.prototype;

public class PlantillaEmail {
   
    private String asunto;
    private String mensaje;

	public PlantillaEmail(String asunto, String mensaje) {
		this.asunto = asunto;
		this.mensaje = mensaje;
	} 

    public PlantillaEmail clone(){
        return new PlantillaEmail(asunto, mensaje);
    }

    public void cambiarAsunto(String newAsunto){
        this.asunto=newAsunto;
    }
    public String contenido(){
        return this.toString();
    }

    @Override 
    public String toString(){
        return asunto + ": " + mensaje;
    }

    

}
