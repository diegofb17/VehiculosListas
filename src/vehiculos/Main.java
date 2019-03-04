/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Creamos el objeto empresa y le damos unos datos
        EmpresaAlquilerVehiculos empresa = new EmpresaAlquilerVehiculos("A83658594", "mitra whaoz", "www.mitraWhaoz.com");

        // Rellenamos Clientes y Vehiculos
        empresa.clientesAleatorios();
        empresa.vehiculosAleatorios();
        
        //Mostramos por pantalla los datos aleatorios que hemos generado anteriormente
        empresa.imprimirClientes1();
        empresa.imprimirVehiculos();
    }
}
