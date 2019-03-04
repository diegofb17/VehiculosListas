/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.Random;

/**
 *
 * @author whizrxt
 */
public class Cliente {

    private String nif;
    private String nombre;
    private String apellidos;

    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static String nifAleatorio() {
        Random rnd = new Random();
        String numeroNif2="";
        int numeroNif = 0;
        for (int i = 0; i < 9; i++) {
            if (i < 8) {
                numeroNif2 += rnd.nextInt(10);
                numeroNif = Integer.parseInt(numeroNif2);
                
                
            } else {
                String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
                int modulo = numeroNif % 23;
                char letra = juegoCaracteres.charAt(modulo);
                numeroNif2 += letra;
            }
        }
        return numeroNif2;
    }
    
    public static String nombreAleatorio(){
        Random rnd = new Random();
        int alea = rnd.nextInt(15) + 1;
        String nombre = "";
        switch (alea) {
            case 1:
                nombre = "Diego ";
                break;
            case 2:
                nombre = "Andres ";
                break;
            case 3:
                nombre = "Fernando ";
                break;
            case 4:
                nombre = "Rodolfo ";
                break;
            case 5:
                nombre = "Gustavo ";
                break;
            case 6:
                nombre = "Alvaro ";
                break;
            case 7:
                nombre = "Nacho ";
                break;
            case 8:
                nombre = "Arkano ";
                break;
            case 9:
                nombre = "Ignacio ";
                break;
            case 10:
                nombre = "Guillermo ";
                break;
            case 11:
                nombre = "Jose ";
                break;
            case 12:
                nombre = "Dani ";
                break;
            case 13:
                nombre = "Fran ";
                break;
            case 14:
                nombre = "Arturo ";
                break;
            case 15:
                nombre = "Jordi ";
                break;
        }
        return nombre;
        
    }

    public static String apellidoAleatorio() {
        Random rnd = new Random();
        int alea1 = rnd.nextInt(10) + 1;
        int alea2 = rnd.nextInt(10) + 1;

        String ape1 = "";
        String ape2 = "";
        String apellido = "";

        switch (alea1) {
            case 1:
                ape1 = "Fernández";
                break;
            case 2:
                ape1 = "Hurtado";
                break;
            case 3:
                ape1 = "Rodríguez";
                break;
            case 4:
                ape1 = "Carrillo";
                break;
            case 5:
                ape1 = "Macías";
                break;
            case 6:
                ape1 = "Pérez";
                break;
            case 7:
                ape1 = "Valiente";
                break;
            case 8:
                ape1 = "García";
                break;
            case 9:
                ape1 = "Gómez";
                break;
            case 10:
                ape1 = "Bollici";
                break;

        }

        switch (alea2) {
            case 1:
                ape2 = "Gutiérrez";
                break;
            case 2:
                ape2 = "Campos";
                break;
            case 3:
                ape2 = "Ronaldo";
                break;
            case 4:
                ape2 = "Flores";
                break;
            case 5:
                ape2 = "Barbarán";
                break;
            case 6:
                ape2 = "Guerrero";
                break;
            case 7:
                ape2 = "Aragón";
                break;
            case 8:
                ape2 = "Ocaña";
                break;
            case 9:
                ape2 = "Vico";
                break;
            case 10:
                ape2 = "López";
                break;

        }
        apellido = ape1 + " "+ ape2;

        return apellido;
    }
    
    public static Cliente clienteAleatorio(){
       Cliente cli=new Cliente(nifAleatorio(),nombreAleatorio(),apellidoAleatorio() );
       return cli;
        
    }
}
