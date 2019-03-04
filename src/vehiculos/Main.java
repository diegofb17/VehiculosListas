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
        empresa.imprimirClientes();
        empresa.imprimirVehiculos();
        
         //Pedimos al usuario que introduzca su dni
        System.out.println("Introduce su NIF");
        String nif = teclado.nextLine();
        
        //Pedimos que introduzca la matricula
        System.out.println("Introduce la matricula del vehiculo");
        String matricula = teclado.nextLine();
        
        //Preguntamos el numero de dias del alquiler
        System.out.println("Introduce el número de dias de alquiler");
        int alquiler = teclado.nextInt();
        
        //Mediante el metodo alquilarVehiculo registramos el alquiler realizado por el usuario
        empresa.alquilarVehiculo(matricula, nif, alquiler);
        //He comentado esta parte del codigo ya que no encuentro el error
        
        //Ordenamos los clientes y los vehiculos
        empresa.ordenarCarteraClientes();
        empresa.ordenarCatalogoVehiculos();
        
        //Limpiamos el buffer
        teclado.nextLine();
        
        //Pedimos otra vez el nif al usuario
        System.out.println("Introduce de nuevo el nif");
        nif = teclado.nextLine();
        
        //Buscamos al cliente y lo mostramos por pantalla
        System.out.println(empresa.busquedaBinariaNif(nif));
        
        //Pedimos otra vez la matricula
        System.out.println("Introduce la matricula");
        matricula = teclado.nextLine();
        
        //Buscamos el vehiculo por la matricula y los mostramos por pantalla
        System.out.println(empresa.busquedaBinariaMatricula(matricula));
        
    }
}
