/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.pagos;

/**
 *
 * @author Usuario
 */
public class Domiciliario extends Empleado{
    private int entregas;
    private double tarifaPorEntrega;
    
    public Domiciliario(String nombre, int documento, double sueldobase, String hora_ingreso , int entregas, double tarifaPorEntrega){
        super(nombre, documento, sueldobase);
        this.hora_ingreso = hora_ingreso;     
        this.entregas = entregas;
        this.tarifaPorEntrega = tarifaPorEntrega;
    }
    
    @Override
    public double pagoMensual(){
        return sueldobase + (entregas * tarifaPorEntrega);
    }
    
}
