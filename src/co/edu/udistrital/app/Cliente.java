    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.app;

import co.edu.udistrital.builder.Promocion2x1Builder;
import co.edu.udistrital.builder.PromocionBuilder;
import co.edu.udistrital.builder.PromocionComboBuilder;
import co.edu.udistrital.builder.PromocionVolumenBuilder;
import co.edu.udistrital.director.PromocionDirector;
import co.edu.udistrital.model.Audifono;
import co.edu.udistrital.model.Celular;
import co.edu.udistrital.model.Funda;
import co.edu.udistrital.model.Laptop;
import co.edu.udistrital.model.MemoriaUsb;
import co.edu.udistrital.model.Mouse;
import co.edu.udistrital.model.Promocion;
import java.util.Arrays;

/**
 *
 * @author oliva
 */
public class Cliente {

    private PromocionDirector director;

    private Celular celular;
    private Audifono audifono;
    private Mouse mouse;
    private Laptop laptop;
    private Funda funda;
    private MemoriaUsb usb;

    private Promocion promo1;
    private Promocion promo2;
    private Promocion promo3;

    public Cliente() {
        this.director = new PromocionDirector();
        this.celular = null;
        this.audifono = null;
        this.mouse = null;
        this.laptop = null;
        this.funda = null;
        this.usb = null;
        this.promo1 = null;
        this.promo2 = null;
        this.promo3 = null;
    }

    public void ejecutar() {
        configurarProductos();
        crearPromocion2x1();
        crearPromocionVolumen();
        crearPromocionCombo();
        mostrarInformacion();
    }

    private void configurarProductos() {
        celular = new Celular("Galaxy A54", 800000, "Exynos", 8, 128, "Android");
        audifono = new Audifono("AirBuds", 150000, true, 20);
        mouse = new Mouse("Logitech M170", 40000, true);
        laptop = new Laptop("ThinkPad E14", 3000000, "i5", 16, 512, "Windows", null);
        funda = new Funda("Funda 14 pulgadas", 50000, "Laptop");
        usb = new MemoriaUsb("Kingston 64GB", 30000, 64);
    }

    private void crearPromocion2x1() {
        PromocionBuilder builder = new Promocion2x1Builder(celular, audifono);
        promo1 = director.build(builder, "Celular + Audifonos 2x1");
    }

    private void crearPromocionVolumen() {
        PromocionBuilder builder = new PromocionVolumenBuilder(mouse, 10, 0.20);
        promo2 = director.build(builder, "Descuento por volumen Mouse");
    }

    private void crearPromocionCombo() {
        PromocionBuilder builder = new PromocionComboBuilder(
                Arrays.asList(laptop, mouse, funda, usb, audifono),
                3200000
        );
        promo3 = director.build(builder, "Combo Laptop + Accesorios");
    }

    private void mostrarInformacion() {
        mostrarPromocion(promo1, 1);
        mostrarPromocion(promo2, 50);
        mostrarPromocion(promo3, 1);
    }

    private void mostrarPromocion(Promocion promocion, int cantidad) {
        System.out.println(promocion.getNombre()
                + ": precio final (" + cantidad + " unidades) = "
                + promocion.calcularPrecioFinal(cantidad));
    }
}
