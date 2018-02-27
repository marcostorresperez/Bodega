/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega;

/**
 *
 * @author mati
 */
public class Marca {
   private String nombreMarca;
   private int numBotellas;

    public Marca(String nombre, int numBotellas) {
        this.nombreMarca = nombre;
        this.numBotellas = numBotellas;
    }

    Marca(){
        
        
    }
    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombre(String nombre) {
        this.nombreMarca = nombre;
    }

    public int getNumBotellas() {
        return numBotellas;
    }

    public void setNumBotellas(int numBotellas) {
        this.numBotellas = numBotellas;
    }
    
    
}
