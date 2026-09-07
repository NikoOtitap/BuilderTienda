package co.edu.udistrital.builder;

import co.edu.udistrital.model.Promocion;
import java.time.LocalDate;

/**
 *
 * @author oliva
 */
public abstract class PromocionBuilder {
    protected String nombre;
    protected LocalDate fechaVencimiento;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public abstract Promocion build();
}
