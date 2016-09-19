package com.foo.nuevaera.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.foo.nuevaera.dominio.objetosValor.Dinero;

public class Venta {
    
    private List<LineaDeVenta> lineasDeVenta;
    private Date fecha;
    private boolean esCompleta;
    private Pago pago;
    
    public Venta() {
        lineasDeVenta = new ArrayList<>();
        fecha = new Date();
        esCompleta = false;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void crearLineaDeVenta(EspecificacionDelProducto espec, int cantidad) {
        lineasDeVenta.add(new LineaDeVenta(espec, cantidad));
    }

    public Dinero getTotal() {
        Dinero total = new Dinero(0);
        for (LineaDeVenta lv : lineasDeVenta) {
            total = total.mas(lv.getSubtotal());
        }
        return total;
    }

    public void seHaCompletado() {
        esCompleta = true;
    }
    
    public boolean esCompleta() {
        return esCompleta;
    }

    public void realizarPago(Dinero dineroEntregado) {
        pago = new Pago(dineroEntregado);
    }

    public Dinero getDevolucion() {
        return pago.getCantidad().menos(getTotal());
    }

}
