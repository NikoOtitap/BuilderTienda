package co.edu.udistrital.builder;

import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.Promocion;
import co.edu.udistrital.model.regla.ReglaCombo;
import co.edu.udistrital.model.regla.ReglaPrecio;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author oliva
 */
public class PromocionComboBuilder implements PromocionBuilder {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private ReglaPrecio reglaPrecio;

    private List<Producto> productos;
    private double precioCombo;

    public PromocionComboBuilder(List<Producto> productos, double precioCombo) {
        this.productos = productos;
        this.precioCombo = precioCombo;
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
        reglaPrecio = new ReglaCombo(productos, precioCombo);
    }

    @Override
    public Promocion build() {
        return new Promocion(nombre, fechaInicio, fechaVencimiento, reglaPrecio);
    }
}
