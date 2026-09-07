package co.edu.udistrital.builder;

import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.PromocionCombo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oliva
 */
public class PromocionComboBuilder extends PromocionBuilder {
    private List<Producto> productos = new ArrayList<>();
    private double precioCombo;

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void setPrecioCombo(double precioCombo) {
        this.precioCombo = precioCombo;
    }

    @Override
    public PromocionCombo build() {
        return new PromocionCombo(nombre, fechaVencimiento, productos, precioCombo);
    }
}
