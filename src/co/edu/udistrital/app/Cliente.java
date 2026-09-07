/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.app;

import co.edu.udistrital.builder.Promocion2x1Builder;
import co.edu.udistrital.builder.PromocionComboBuilder;
import co.edu.udistrital.builder.PromocionVolumenBuilder;
import co.edu.udistrital.director.PromocionDirector;
import co.edu.udistrital.model.Audifono;
import co.edu.udistrital.model.Celular;
import co.edu.udistrital.model.Funda;
import co.edu.udistrital.model.Laptop;
import co.edu.udistrital.model.MemoriaUsb;
import co.edu.udistrital.model.Mouse;
import co.edu.udistrital.model.Promocion2x1;
import co.edu.udistrital.model.PromocionCombo;
import co.edu.udistrital.model.PromocionVolumen;
import java.util.Arrays;

/**
 *
 * @author oliva
 */
public class Cliente {
    public void ejecutar() {
        PromocionDirector director = new PromocionDirector();

        Celular celular = new Celular("Galaxy A54", 800000, "Exynos", 8, 128, "Android");
        Audifono audifono = new Audifono("AirBuds", 150000, true, 20);
        Mouse mouse = new Mouse("Logitech M170", 40000, true);
        Laptop laptop = new Laptop("ThinkPad E14", 3000000, "i5", 16, 512, "Windows", null);
        Funda funda = new Funda("Funda 14 pulgadas", 50000, "Laptop");
        MemoriaUsb usb = new MemoriaUsb("Kingston 64GB", 30000, 64);

        Promocion2x1 promo1 = director.crear2x1(new Promocion2x1Builder(), celular, audifono);
        System.out.println(promo1.getNombre() + " -> precio final: " + promo1.calcularPrecioFinal(1));

        PromocionVolumen promo2 = director.crearDescuentoPorVolumen(new PromocionVolumenBuilder(), mouse);
        System.out.println(promo2.getNombre() + " -> precio final (50 unidades): " + promo2.calcularPrecioFinal(50));

        PromocionCombo promo3 = director.crearCombo(new PromocionComboBuilder(),
                Arrays.asList(laptop, mouse, funda, usb, audifono), 3200000);
        System.out.println(promo3.getNombre() + " -> precio final: " + promo3.calcularPrecioFinal(1));
    }
}
