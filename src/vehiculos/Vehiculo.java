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
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

    public static String matriculaAleatoria() {
        Random rnd = new Random();
        String matricula = "";
        int numeroInt = 0;
        for (int i = 0; i < 4; i++) {
            matricula += rnd.nextInt(10);
            numeroInt = Integer.parseInt(matricula);
        }
        for (int j = 0; j < 3; j++) {
            int numeroAleatorio = rnd.nextInt(9999);
            String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
            int modulo = numeroAleatorio % 23;
            char letra = juegoCaracteres.charAt(modulo);
            matricula += letra;
        }

        return matricula;
    }

    public static String marcaAleatoria() {
        Random rnd = new Random();
        int alea = rnd.nextInt(8) + 1;
        String marca = "";
        switch (alea) {
            case 1:
                marca = "Ford";
                break;
            case 2:
                marca = "Lamborghini";
                break;
            case 3:
                marca = "Peougeot";
                break;
            case 4:
                marca = "Ferrari";
                break;
            case 5:
                marca = "Audi";
                break;
            case 6:
                marca = "BMW";
                break;
            case 7:
                marca = "Dacia";
                break;
            case 8:
                marca = "Fiat";
                break;
        }
        return marca;
    }

    public static String modeloAleatorio() {
        Random rnd = new Random();
        int alea2 = rnd.nextInt(3) + 1;
        String modelo = "Ibiza";
        if (alea2 == 1) {
            switch (marcaAleatoria()) {
                case "Ford":
                    modelo = "KA+";
                    break;
                case "Lamborghini":
                    modelo = "Huracán";
                    break;
                case "Peougeot":
                    modelo = "108";
                    break;
                case "Ferrari":
                    modelo = "458";
                    break;
                case "Audi":
                    modelo = "A1";
                    break;
                case "BMW":
                    modelo = "i3";
                    break;
                case "Dacia":
                    modelo = "Sandero";
                    break;
            }
        } else if (alea2 == 2) {
            switch (marcaAleatoria()) {
                case "Ford":
                    modelo = "Fiesta";
                    break;
                case "Lamborghini":
                    modelo = "Aventador";
                    break;
                case "Peougeot":
                    modelo = "2008";
                    break;
                case "Ferrari":
                    modelo = "812 Superfast";
                    break;
                case "Audi":
                    modelo = "A3";
                    break;
                case "BMW":
                    modelo = "Serie 3 2019.Berlina";
                    break;
                case "Dacia":
                    modelo = "Dokker";
                    break;
            }
        } else if (alea2 == 3) {
            switch (marcaAleatoria()) {
                case "Ford":
                    modelo = "Focus";
                    break;
                case "Lamborghini":
                    modelo = "Urus";
                    break;
                case "Peougeot":
                    modelo = "3008";
                case "Ferrari":
                    modelo = "FF";
                    break;
                case "Audi":
                    modelo = "Q5";
                    break;
                case "BMW":
                    modelo = "Cabrio";
                    break;
                case "Dacia":
                    modelo = "Logan";
                    break;
            }
        }

        return modelo;
    }

    public static String colorAleatorio() {
        Random rnd = new Random();
        String color = "";
        int numeroAlea = 0;
        numeroAlea = rnd.nextInt(7) + 1;

        switch (numeroAlea) {
            case 1:
                color = "Rojo";
                break;
            case 2:
                color = "Azul";
                break;
            case 3:
                color = "Amarillo";
                break;
            case 4:
                color = "Verde";
                break;
            case 5:
                color = "Blanco";
                break;
            case 6:
                color = "Negro";
                break;
            case 7:
                color = "Naranja";
                break;

        }
        return color;
    }

    public static double tarifaAleatoria() {
        Random rnd = new Random();
        double tarifa = rnd.nextInt(50000) + 10000;

        return tarifa;
    }

    public static boolean consultarDisponibilidad() {
        boolean disponible = false;
        Random rnd = new Random();
        int num = rnd.nextInt(2);
        switch (num) {
            case 1:
                disponible = true;
                break;
            case 2:
                disponible = false;
                break;
        }
        return disponible;
    }

    public static Vehiculo cocheAleatorio() {
        Vehiculo veh1= new Vehiculo(matriculaAleatoria(),marcaAleatoria(),modeloAleatorio(),colorAleatorio(),tarifaAleatoria(),consultarDisponibilidad());
        return veh1;
    }
}
