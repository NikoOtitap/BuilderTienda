package co.edu.udistrital.director;

import co.edu.udistrital.builder.PromocionBuilder;
import co.edu.udistrital.model.Promocion;
import java.time.LocalDate;

/**
 *
 * @author oliva
 */
public class PromocionDirector {

    public Promocion build(PromocionBuilder builder, String nombre) {

        LocalDate fechaInicio = LocalDate.now();

        builder.setNombre(nombre);
        builder.setFechaInicio(fechaInicio);
        builder.setFechaVencimiento(fechaInicio.plusDays(30));
        builder.setReglaPrecio();

        return builder.build();
    }
}
