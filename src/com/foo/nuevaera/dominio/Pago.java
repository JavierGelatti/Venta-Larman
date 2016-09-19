package com.foo.nuevaera.dominio;

import com.foo.nuevaera.dominio.objetosValor.Dinero;

public class Pago {
    
    private Dinero cantidad;
    
    public Pago(Dinero dineroEntregado) {
        cantidad = dineroEntregado;
    }
    
    public Dinero getCantidad() {
        return cantidad;
    }

}
