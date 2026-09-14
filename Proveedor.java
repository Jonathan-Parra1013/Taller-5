/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.jonathanparra1013.pagos;

/**
 *
 * @author nicol
 */
public class Proveedor {
    private String nombre;
    private int numeroFactura;
    private double valorFactura;

    public Proveedor(String nombre,int numeroFactura,double valorFactura) {

        this.nombre = nombre;
        this.numeroFactura = numeroFactura;
        this.valorFactura = valorFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public double pagarFactura() {
        return valorFactura;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de factura: "+ numeroFactura);
        System.out.println("Valor de la factura: $"+ valorFactura);
    }
}
