/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

/**
 *
 * @author oliva
 */
public class Audifono extends Producto {
    private boolean inalambrico;
    private int duracionBateriaHoras;

    public Audifono(String nombre, double precio, boolean inalambrico, int duracionBateriaHoras) {
        super(nombre, precio);
        this.inalambrico = inalambrico;
        this.duracionBateriaHoras = duracionBateriaHoras;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public int getDuracionBateriaHoras() {
        return duracionBateriaHoras;
    }
}
