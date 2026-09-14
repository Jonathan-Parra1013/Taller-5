/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.pagos;

/**
 *
 * @author Usuario
 */
public class Practicante extends Empleado {
    
    public Practicante(String nombre, int documento, double auxilioFijo, String hora_ingreso){
        super(nombre, documento, auxilioFijo);
    }
    
    @Override
    public String registrarHoraIngreso(){
        return "Para el Practicante no aplica hora de ingreso.@";
    }
    
}
