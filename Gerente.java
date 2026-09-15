/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.pagos;

/**
 *
 * @author jonap
 */
public class Gerente extends Empleado {
    private double bonificacion_anual;
    
     public Gerente(String nombre, int documento, double sueldobase, String hora_ingreso , double bonificacion){
        super(nombre, documento, sueldobase,hora_ingreso);
        this.bonificacion_anual = bonificacion_anual;
        
     }
     
    @Override
   public double pagoMensual(){
        return this.sueldobase = sueldobase + bonificacion_anual;
    }
   
}

