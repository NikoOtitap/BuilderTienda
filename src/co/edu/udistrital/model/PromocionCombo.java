/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author oliva
 */
public class PromocionCombo extends Promocion {
    private List<Producto> productos;
    private double precioCombo;

    public PromocionCombo(String nombre, LocalDate fechaVencimiento, List<Producto> productos, double precioCombo) {
        super(nombre, fechaVencimiento);
        this.productos = productos;
        this.precioCombo = precioCombo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public double calcularPrecioFinal(int cantidad) {
        return precioCombo * cantidad;
    }
}
