/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

/**
 *
 * @author oliva
 */
public class MemoriaUsb extends Producto {
    private int capacidadGB;

    public MemoriaUsb(String nombre, double precio, int capacidadGB) {
        super(nombre, precio);
        this.capacidadGB = capacidadGB;
    }

    public int getCapacidadGB() {
        return capacidadGB;
    }
}
