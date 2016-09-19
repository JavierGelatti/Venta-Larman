package com.foo.nuevaera.dominio;

import com.foo.nuevaera.dominio.objetosValor.Dinero;

public class LineaDeVenta {

    private EspecificacionDelProducto especProducto;
    private int cantidad;

    public LineaDeVenta(EspecificacionDelProducto espec, int cantidad) {
        this.especProducto = espec;
        this.cantidad = cantidad;
    }

    public Dinero getSubtotal() {
        return especProducto.getPrecio().por(cantidad);
    }

}
