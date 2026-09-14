/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.pagos;

/**
 *
 * @author jonap
 */
public class Empleado {
    protected String nombre;
    protected int documento;
    protected double sueldobase;
    protected String hora_ingreso;

    public Empleado(String nombre, int documento, double sueldobase) {
        this.nombre = nombre;
        this.documento = documento;
        this.sueldobase = sueldobase;
    }
    
    public double pagoMensual(){
        return sueldobase;
    }
    
    public String registrarHoraIngreso(){
        return hora_ingreso;
    }
}
