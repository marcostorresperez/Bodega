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
public class Variedad {
    private String nombreVar;
    private String color;
    private double hectareas;
    private double kilos;

    
    public Variedad(String nombre, String color, double hectareas, double kilos) {
        this.nombreVar = nombre;
        this.color = color;
        this.hectareas = hectareas;
        this.kilos = kilos;
    }
    
    Variedad(){
        
    }

    public String getNombre() {
        return nombreVar;
    }

    public void setNombre(String nombre) {
        this.nombreVar = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHectareas() {
        return hectareas;
    }

    public void setHectareas(double hectareas) {
        this.hectareas = hectareas;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }
    
    
}

