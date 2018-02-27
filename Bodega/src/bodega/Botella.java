/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega;

import java.util.Calendar;

/**
 *
 * @author mati
 */
public class Botella {
    private int idBotella;
    private Calendar fecha;
private BotellaTipo tipo;
private Marca nombreMarca;



    public Botella(int idBotella, Calendar fecha, BotellaTipo tipo, Marca nombreMarca) {
        this.idBotella = idBotella;
        this.fecha = fecha;
        this.tipo = tipo;
        this.nombreMarca = nombreMarca;
    }

   

    public Botella(int idBotella, Calendar fecha, BotellaTipo tipo) {
        this.idBotella = idBotella;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    
    public Botella(int idBotella, Calendar fecha) {
        this.idBotella = idBotella;
        this.fecha = fecha;
    }

    Botella(){
        
    }
    public int getIdBotella() {
        return idBotella;
    }

    public void setIdBotella(int idBotella) {
        this.idBotella = idBotella;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
     public BotellaTipo getTipo() {
        return tipo;
    }

    public void setTipo(BotellaTipo tipo) {
        this.tipo = tipo;
    }
    
        public Marca getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(Marca nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
}
