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
public class BotellaTipo {
    private String tipo;
    private String color;
    private Double capacidad;

    public BotellaTipo(String tipo, String color, Double capacidad) {
        this.tipo = tipo;
        this.color = color;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
