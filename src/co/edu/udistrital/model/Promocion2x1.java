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
public class Promocion2x1 extends Promocion {
    private Producto productoPrincipal;
    private Producto productoGratis;

    public Promocion2x1(String nombre, LocalDate fechaVencimiento, Producto productoPrincipal, Producto productoGratis) {
        super(nombre, fechaVencimiento);
        this.productoPrincipal = productoPrincipal;
        this.productoGratis = productoGratis;
    }

    public Producto getProductoPrincipal() {
        return productoPrincipal;
    }

    public Producto getProductoGratis() {
        return productoGratis;
    }

    @Override
    public double calcularPrecioFinal(int cantidad) {
        return productoPrincipal.getPrecio() * cantidad;
    }
}
