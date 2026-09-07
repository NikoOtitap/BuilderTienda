/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

/**
 *
 * @author oliva
 */
public class Funda extends Producto {
    private String compatibleCon;

    public Funda(String nombre, double precio, String compatibleCon) {
        super(nombre, precio);
        this.compatibleCon = compatibleCon;
    }

    public String getCompatibleCon() {
        return compatibleCon;
    }
}
