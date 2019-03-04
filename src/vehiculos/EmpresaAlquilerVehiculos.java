/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author whizrxt
 */
public class EmpresaAlquilerVehiculos {

    // Atributos de la empresa
    private String cif;
    private String nombre;
    private String paginaWeb;

    /* Atributos para controlar el total de clientes que tiene la
	empresa y array de almacenamiento para los objetos Cliente */
    private int totalClientes;
    private ArrayList<Cliente> clientes;

    /* Atributos para controlar el total de vehiculos disponibles en
	alquiler que tiene la empresa y array de almacenamiento para los objetos
	Vehiculo */
    private int totalVehiculos;
    private ArrayList<Vehiculo> vehiculos;

    /* Atributos para controlar el histórico de alquileres: total de
	alquileres realizados y array de almacenamiento para los objetos
	VehiculoAlquilado */
    private int totalAlquileres;
    private ArrayList<VehiculoAlquilado> alquileres;

    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        // Incialmente no hay clientes creados en la empresa
        this.totalClientes = 0;
        clientes = new ArrayList<>();//Apunta a null
        // Incialmente no hay vehiculos creados en la empresa
        this.totalVehiculos = 0;
        vehiculos = new ArrayList<>();//Apunta a null
        // Incialmente no hay histórico de alquileres en la empresa
        this.totalAlquileres = 0;
        alquileres = new ArrayList<>();//Apunta a null
    }

    public void registrarCliente(Cliente nuevo) {
        clientes.add(nuevo);
        totalClientes++;
    }

    public void registrarVehiculo(Vehiculo nuevo) {
        vehiculos.add(nuevo);
        totalVehiculos++;
    }

    public void imprimirClientes() {
        System.out.println("NIF cliente\tNombre\n");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes.get(i));
        }
    }

    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");
        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos.get(i));
        }
    }

    private Vehiculo getVehiculo(String matricula) {
        for (int i = 0; i < this.getTotalVehiculos(); i++) {
            if (this.vehiculos.get(i).getMatricula().equals(matricula)) {
                return this.vehiculos.get(i);
            }
        }
        return null;
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
        // busca el cliente con el NIF dado en el array
        // clientes y el vehículo con la matrícula dada en el
        // array vehiculos, si el vehículo está disponible se
        // alquila con la fecha actual, que se obtiene
        // ejecutando los métodos diaHoy(), mesHoy() y
        // añoHoy(), cuya declaración no se incluye
        if (vehiculo.getDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres.set(this.totalAlquileres, new VehiculoAlquilado(cliente, vehiculo, diaAlquiler(), mesAlquiler(), añoAlquiler(), dias));

            this.totalAlquileres++;
        }
    }

    public void recibirVehiculo(String matricula) {
        // busca el vehículo con la matrícula dada en el
        // array vehiculos y modifica su disponibilidad
        // para que se pueda alquilar de nuevo
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }

    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public ArrayList<VehiculoAlquilado> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<VehiculoAlquilado> alquileres) {
        this.alquileres = alquileres;
    }

    private Cliente getCliente(String nif) {
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.clientes.get(i).getNif().equals(nif)) {
                return this.clientes.get(i);
            }
        }
        return null;

    }

    public int diaAlquiler() {
        LocalDate hoy = LocalDate.now();
        return hoy.getDayOfMonth();
    }

    public int mesAlquiler() {
        LocalDate hoy = LocalDate.now();
        return hoy.getMonthValue();
    }

    public int añoAlquiler() {
        LocalDate hoy = LocalDate.now();
        return hoy.getYear();
    }

    public ArrayList<Cliente> clientesAleatorios() {
        for (int i = 0; i < 25; i++) {
            this.clientes.add(Cliente.clienteAleatorio());
        }
        return this.clientes;
    }

    public ArrayList<Vehiculo> vehiculosAleatorios() {
        for (int i = 0; i < 25; i++) {
            this.vehiculos.add(Vehiculo.cocheAleatorio());
        }
        return this.vehiculos;
    }

    public void ordenarCarteraClientes() {
        Cliente aux;
        for (int i = 0; i < clientes.size()-1; i++) {
            for (int j = i + 1; j < clientes.size(); j++) {
                int comparar = clientes.get(i).getNif().compareTo(clientes.get(j).getNif());
                if (comparar > 0) {
                    aux = clientes.get(i);
                    clientes.set(i, clientes.get(j));
                    clientes.set(j, aux);
                }
            }
        }
    }
}
