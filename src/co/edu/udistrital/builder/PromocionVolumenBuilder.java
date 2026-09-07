package co.edu.udistrital.builder;

import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.PromocionVolumen;

/**
 *
 * @author oliva
 */
public class PromocionVolumenBuilder extends PromocionBuilder {
    private Producto producto;
    private int cantidadMinima;
    private double porcentajeDescuento;

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public PromocionVolumen build() {
        return new PromocionVolumen(nombre, fechaVencimiento, producto, cantidadMinima, porcentajeDescuento);
    }
}
