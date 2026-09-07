    package co.edu.udistrital.builder;

import co.edu.udistrital.model.Promocion;
import java.time.LocalDate;

/**
 *
 * @author oliva
 */
public interface PromocionBuilder {

    void setNombre(String nombre);
    
    void setFechaInicio(LocalDate fechaInicio);

    void setFechaVencimiento(LocalDate fechaVencimiento);

    void setReglaPrecio();

    Promocion build();
}
