/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

import java.time.LocalDate;

/**
 *
 * @author oliva
 */
public class PromocionVolumen extends Promocion {
    private Producto producto;
    private int cantidadMinima;
    private double porcentajeDescuento;

    public PromocionVolumen(String nombre, LocalDate fechaVencimiento, Producto producto, int cantidadMinima, double porcentajeDescuento) {
        super(nombre, fechaVencimiento);
        this.producto = producto;
        this.cantidadMinima = cantidadMinima;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public double calcularPrecioFinal(int cantidad) {
        double precioBase = producto.getPrecio() * cantidad;
        if (cantidad >= cantidadMinima) {
            return precioBase * (1 - porcentajeDescuento / 100);
        }
        return precioBase;
    }
}
