package com.foo.nuevaera.dominio;

import com.foo.nuevaera.dominio.objetosValor.ArticuloID;
import com.foo.nuevaera.dominio.objetosValor.Dinero;

public class Registro {
    
    private CatalogoDeProductos catalogo;
    private LibroMayorDeVentas libroVentas;
    private Venta venta;
    
    public Registro(CatalogoDeProductos catalogo, LibroMayorDeVentas libroVentas) {
        this.catalogo = catalogo;
        this.libroVentas = libroVentas;
    }
    
    public void crearNuevaVenta() {
        venta = new Venta();
    }
    
    public void introducirArticulo(ArticuloID id, int cantidad) {
        EspecificacionDelProducto espec = catalogo.getEspecificacion(id);

        venta.crearLineaDeVenta(espec, cantidad);
    }
    
    public void finalizarVenta() {
        venta.seHaCompletado();
    }

    public void realizarPago(Dinero dineroEntregado) {
        venta.realizarPago(dineroEntregado);
        libroVentas.agregarVenta(venta);
    }
}
