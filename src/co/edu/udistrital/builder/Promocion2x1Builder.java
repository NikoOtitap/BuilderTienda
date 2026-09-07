package co.edu.udistrital.builder;

import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.Promocion;
import co.edu.udistrital.model.regla.Regla2x1;
import co.edu.udistrital.model.regla.ReglaPrecio;
import java.time.LocalDate;

/**
 *
 * @author oliva
 */
public class Promocion2x1Builder implements PromocionBuilder {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private ReglaPrecio reglaPrecio;

    private Producto productoPrincipal;
    private Producto productoGratis;

    public Promocion2x1Builder(Producto productoPrincipal, Producto productoGratis) {
        this.productoPrincipal = productoPrincipal;
        this.productoGratis = productoGratis;
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
        reglaPrecio = new Regla2x1(productoPrincipal, productoGratis);
    }

    @Override
    public Promocion build() {
        return new Promocion(nombre, fechaInicio, fechaVencimiento, reglaPrecio);
    }
}
