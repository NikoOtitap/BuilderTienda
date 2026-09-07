/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model.regla;

import co.edu.udistrital.model.Producto;

/**
 *
 * @author oliva
 */

public class Regla2x1 implements ReglaPrecio {

    private Producto productoPrincipal;
    private Producto productoGratis;

    public Regla2x1(Producto productoPrincipal, Producto productoGratis) {
        this.productoPrincipal = productoPrincipal;
        this.productoGratis = productoGratis;
    }

    @Override
    public double calcularPrecioFinal(int cantidad) {
        return productoPrincipal.getPrecio() * cantidad;
    }
}
