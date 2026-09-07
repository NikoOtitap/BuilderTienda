/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

/**
 *
 * @author oliva
 */
public class Mouse extends Producto {
    private boolean inalambrico;

    public Mouse(String nombre, double precio, boolean inalambrico) {
        super(nombre, precio);
        this.inalambrico = inalambrico;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }
}
