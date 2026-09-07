/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

/**
 *
 * @author oliva
 */
public class Teclado extends Producto {
    private boolean mecanico;

    public Teclado(String nombre, double precio, boolean mecanico) {
        super(nombre, precio);
        this.mecanico = mecanico;
    }

    public boolean isMecanico() {
        return mecanico;
    }
}
