package co.edu.udistrital.builder;

import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.Promocion;
import co.edu.udistrital.model.regla.ReglaPrecio;
import co.edu.udistrital.model.regla.ReglaVolumen;
import java.time.LocalDate;

/**
 *
 * @author oliva
 */
public class PromocionVolumenBuilder implements PromocionBuilder {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private ReglaPrecio reglaPrecio;

    private Producto producto;
    private int cantidadMinima;
    private double porcentajeDescuento;

    public PromocionVolumenBuilder(Producto producto, int cantidadMinima, double porcentajeDescuento) {
        this.producto = producto;
        this.cantidadMinima = cantidadMinima;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void setReglaPrecio() {
        reglaPrecio = new ReglaVolumen(producto, cantidadMinima, porcentajeDescuento);
    }

    @Override
    public Promocion build() {
        return new Promocion(nombre, fechaInicio, fechaVencimiento, reglaPrecio);
    }
}
