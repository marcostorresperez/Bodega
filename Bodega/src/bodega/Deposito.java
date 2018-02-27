/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Deposito {
    private int idDeposito;
    private double capacidad;
    private String material;
    private ArrayList<Variedad> listaVariedades = new ArrayList();
    private ArrayList<Botella> listaBotellas = new ArrayList();

    public ArrayList<Botella> getListaBotellas() {
        return listaBotellas;
    }

    public void setListaBotellas(ArrayList<Botella> listaBotellas) {
        this.listaBotellas = listaBotellas;
    }

   

    public Deposito(int idDeposito, double capacidad, String material) {
        this.idDeposito = idDeposito;
        this.capacidad = capacidad;
        this.material = material;
    }

    Deposito(){
        
    }
    public int getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(int idDeposito) {
        this.idDeposito = idDeposito;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
     public ArrayList<Variedad> getListaVariedades() {
        return listaVariedades;
    }

    public void setListaVariedades(ArrayList<Variedad> listaVariedades) {
        this.listaVariedades = listaVariedades;
    }
    
}
