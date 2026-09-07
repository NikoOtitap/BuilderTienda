/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.udistrital.model;

import java.time.LocalDate;

/**
 *
 * @author oliva
 */
public abstract class Promocion {
    protected String nombre;
    protected LocalDate fechaVencimiento;

    public Promocion(String nombre, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public abstract double calcularPrecioFinal(int cantidad);
}
