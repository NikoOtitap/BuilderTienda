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
    private Promocion promo2x1;
    private Promocion promoVolumen;
    private Promocion promoCombo;

    public Cliente() {
        this.director = new PromocionDirector();
        this.promo2x1 = null;
        this.promoVolumen = null;
        this.promoCombo = null;
    }

    public void ejecutar() {
        crearPromocion2x1();
        crearPromocionVolumen();
        crearPromocionCombo();

        mostrarInfo2x1();
        mostrarInfoVolumen();
        mostrarInfoCombo();
    }

    private void crearPromocion2x1() {
        Celular celular = new Celular("Galaxy A54", 800000, "Exynos", 8, 128, "Android");
        Audifono audifono = new Audifono("AirBuds", 150000, true, 20);

        PromocionBuilder builder = new Promocion2x1Builder(celular, audifono);
        promo2x1 = director.build(builder, "Celular + Audífonos 2x1");
    }

    private void crearPromocionVolumen() {
        Mouse mouse = new Mouse("Logitech M170", 40000, true);

        PromocionBuilder builder = new PromocionVolumenBuilder(mouse, 10, 0.20);
        promoVolumen = director.build(builder, "Descuento por volumen Mouse");
    }

    private void crearPromocionCombo() {
        Laptop laptop = new Laptop("ThinkPad E14", 3000000, "i5", 16, 512, "Windows", null);
        Mouse mouse = new Mouse("Logitech M170", 40000, true);
        Funda funda = new Funda("Funda 14 pulgadas", 50000, "Laptop");
        MemoriaUsb usb = new MemoriaUsb("Kingston 64GB", 30000, 64);
        Audifono audifono = new Audifono("AirBuds", 150000, true, 20);

        PromocionBuilder builder = new PromocionComboBuilder(
                Arrays.asList(laptop, mouse, funda, usb, audifono),
                3200000
        );

        promoCombo = director.build(builder, "Combo Laptop + Accesorios");
    }

    private void mostrarInfo2x1() {
        System.out.println(promo2x1.getNombre()
                + " -> precio final: "
                + promo2x1.calcularPrecioFinal(1));
    }

    private void mostrarInfoVolumen() {
        System.out.println(promoVolumen.getNombre()
                + " -> precio final (50 unidades): "
                + promoVolumen.calcularPrecioFinal(50));
    }

    private void mostrarInfoCombo() {
        System.out.println(promoCombo.getNombre()
                + " -> precio final: "
                + promoCombo.calcularPrecioFinal(1));
    }
}
