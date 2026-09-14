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
    
    public Practicante(String nombre, int documento, double sueldobase, String hora_ingreso){
        super(nombre, documento, sueldobase,hora_ingreso);
    }
    
    @Override
    public void registrarHoraIngreso(){
        System.out.println("Para el Practicante no aplica hora de ingreso.");
    }
    
}
