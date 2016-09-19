package com.foo.nuevaera.dominio;

import com.foo.nuevaera.dominio.objetosValor.ArticuloID;
import com.foo.nuevaera.dominio.objetosValor.Dinero;

public class EspecificacionDelProducto {
    
    private ArticuloID id;
    private String descripcion;
    private Dinero precio;
    
    public EspecificacionDelProducto(ArticuloID id, String descripcion, Dinero precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public ArticuloID getID() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Dinero getPrecio() {
        return precio;
    }

}
