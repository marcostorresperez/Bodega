/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Bodega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // VARIEDAD
        String nombreVar;
        String colorVar;
        Double hectareas;
        Double kilos;
        Variedad variedad1=null;
        // DEPOSITO
        int idDeposito;
        Double capacidadDep;
        String material;
        // BOTELLA
        int idBotella;
        Calendar fecha;
        // MARCA
        String nombreMarca;
        int numBotellas;
        // BOTELLATIPO
        String tipo;
        String color;
        int capacidad;
        // BODEGA
        int opcion;

        do {
            mostrarMenu();
            System.out.println("Introduce opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1.- Dar de alta variedad");
                    variedad1=new Variedad("tempranillo","tinto",20,200);
                    System.out.println(variedad1.getNombre());
                    break;

                case 2:
                    System.out.println("2.- Dar de alta deposito");
                    break;

                case 3:
                    System.out.println("3.- Dar de alta marca");
                    
                    break;

                case 4:
                    System.out.println("4.- Dar de alta tipo de botella");

                    break;

                case 5:
                    System.out.println("5.- Embotellar");
                    
                    break;
                default:
                    System.out.println("Cerrand la aplicacion");
                    break;

            }
        } while (opcion != 0);

    }

    public static void mostrarMenu() {
        System.out.println("******************************");
        System.out.println("1.- Dar de alta variedad");
        System.out.println("2.- Dar de alta deposito");
        System.out.println("3.- Dar de alta marca");
        System.out.println("4.- Dar de alta tipo de botella");
        System.out.println("5.- Embotellar");
        System.out.println("0.- Salir");
        System.out.println("**********************************");
    }
}
