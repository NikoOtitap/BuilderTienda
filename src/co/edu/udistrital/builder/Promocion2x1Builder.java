package co.edu.udistrital.builder;

import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.Promocion2x1;

/**
 *
 * @author oliva
 */
public class Promocion2x1Builder extends PromocionBuilder {
    private Producto productoPrincipal;
    private Producto productoGratis;

    public void setProductoPrincipal(Producto productoPrincipal) {
        this.productoPrincipal = productoPrincipal;
    }

    public void setProductoGratis(Producto productoGratis) {
        this.productoGratis = productoGratis;
    }

    @Override
    public Promocion2x1 build() {
        return new Promocion2x1(nombre, fechaVencimiento, productoPrincipal, productoGratis);
    }
}
