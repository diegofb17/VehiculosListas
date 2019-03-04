/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.time.LocalDate;

/**
 *
 * @author whizrxt
 */
public class VehiculoAlquilado {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
   
    
    
}
