/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.github.jonathanparra1013.pagos;

/**
 *
 * @author nicol
 */
public class Empresa {

    public static void main(String[] args) {
        Empleado domiciliario = new Domiciliario( "Carlos", 10065461, 1500000, "8:00 AM", 40, 10000 );
        Empleado practicante = new Practicante( "Laura", 1002, 800000,null );
        Proveedor proveedor = new Proveedor( "Supermercado asfdfsd", 900123456, 2500000 );
        
        System.out.println("//HORAS DE INGRESO//");
        domiciliario.registrarHoraIngreso();
        practicante.registrarHoraIngreso();
        
        System.out.println("//PAGOS DE EMPLEADOS//");
        Empleado[] empleados = {domiciliario, practicante}; 
        for (Empleado empleado : empleados) { 
            System.out.println( empleado.getNombre() + " - Pago mensual: $" + empleado.pagoMensual() );
        }
        
        System.out.println("//PAGO PROVEDOR");
        proveedor.mostrarInformacion(); 
        System.out.println( "Pago de factura: $" + proveedor.pagarFactura() );
    }
}
