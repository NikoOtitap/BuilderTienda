/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

/**
 *
 * @author oliva
 */
public class Laptop extends Producto {
    private String procesador;
    private int ramGB;
    private int almacenamientoGB;
    private String sistemaOperativo;
    private String tarjetaGrafica;

    public Laptop(String nombre, double precio, String procesador, int ramGB, int almacenamientoGB, String sistemaOperativo, String tarjetaGrafica) {
        super(nombre, precio);
        this.procesador = procesador;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
        this.sistemaOperativo = sistemaOperativo;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRamGB() {
        return ramGB;
    }

    public int getAlmacenamientoGB() {
        return almacenamientoGB;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }
}
