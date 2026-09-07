package co.edu.udistrital.director;

import co.edu.udistrital.builder.Promocion2x1Builder;
import co.edu.udistrital.builder.PromocionBuilder;
import co.edu.udistrital.builder.PromocionComboBuilder;
import co.edu.udistrital.builder.PromocionVolumenBuilder;
import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.Promocion2x1;
import co.edu.udistrital.model.PromocionCombo;
import co.edu.udistrital.model.PromocionVolumen;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author oliva
 */
public class PromocionDirector {
    private static final int DURACION_ESTANDAR_DIAS = 30;
    private static final int CANTIDAD_MINIMA_DESCUENTO_ESTANDAR = 50;
    private static final double PORCENTAJE_DESCUENTO_ESTANDAR = 10;

    private void aplicarPoliticaEstandar(PromocionBuilder builder, String nombre) {
        builder.setNombre(nombre);
        builder.setFechaVencimiento(LocalDate.now().plusDays(DURACION_ESTANDAR_DIAS));
    }

    public Promocion2x1 crear2x1(Promocion2x1Builder builder, Producto productoPrincipal, Producto productoGratis) {
        aplicarPoliticaEstandar(builder, "2x1: " + productoPrincipal.getNombre() + " + " + productoGratis.getNombre());
        builder.setProductoPrincipal(productoPrincipal);
        builder.setProductoGratis(productoGratis);
        return builder.build();
    }

    public PromocionVolumen crearDescuentoPorVolumen(PromocionVolumenBuilder builder, Producto producto) {
        aplicarPoliticaEstandar(builder, "Descuento por volumen: " + producto.getNombre());
        builder.setProducto(producto);
        builder.setCantidadMinima(CANTIDAD_MINIMA_DESCUENTO_ESTANDAR);
        builder.setPorcentajeDescuento(PORCENTAJE_DESCUENTO_ESTANDAR);
        return builder.build();
    }

    public PromocionCombo crearCombo(PromocionComboBuilder builder, List<Producto> productos, double precioCombo) {
        StringBuilder nombreCombo = new StringBuilder("Combo: ");
        for (int i = 0; i < productos.size(); i++) {
            builder.agregarProducto(productos.get(i));
            nombreCombo.append(productos.get(i).getNombre());
            if (i < productos.size() - 1) {
                nombreCombo.append(" + ");
            }
        }
        aplicarPoliticaEstandar(builder, nombreCombo.toString());
        builder.setPrecioCombo(precioCombo);
        return builder.build();
    }
}
