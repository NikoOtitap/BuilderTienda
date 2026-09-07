/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model.regla;

import co.edu.udistrital.model.Producto;
import java.util.List;

/**
 *
 * @author oliva
 */
public class ReglaCombo implements ReglaPrecio {

    private List<Producto> productos;
    private double precioCombo;

    public ReglaCombo(List<Producto> productos, double precioCombo) {
        this.productos = productos;
        this.precioCombo = precioCombo;
    }

    @Override
    public double calcularPrecioFinal(int cantidad) {
        return precioCombo * cantidad;
    }
}
