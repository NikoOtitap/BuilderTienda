/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.udistrital.model;

import co.edu.udistrital.model.regla.ReglaPrecio;
import java.time.LocalDate;

/**
 *
 * @author oliva
 */
public class Promocion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private ReglaPrecio reglaPrecio;

    public Promocion(String nombre, LocalDate fechaInicio, LocalDate fechaVencimiento, ReglaPrecio reglaPrecio) {
        this.nombre = nombre;
        this.fechaInicio=fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.reglaPrecio = reglaPrecio;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public ReglaPrecio getReglaPrecio() {
        return reglaPrecio;
    }

    public double calcularPrecioFinal(int cantidad) {
        return reglaPrecio.calcularPrecioFinal(cantidad);
    }
}
