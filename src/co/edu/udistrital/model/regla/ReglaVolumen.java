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
public class ReglaVolumen implements ReglaPrecio {

    private Producto producto;
    private int cantidadMinima;
    private double porcentajeDescuento;

    public ReglaVolumen(Producto producto, int cantidadMinima, double porcentajeDescuento) {
        this.producto = producto;
        this.cantidadMinima = cantidadMinima;
        this.porcentajeDescuento = porcentajeDescuento;
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
