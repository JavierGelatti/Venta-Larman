package com.foo.nuevaera.dominio;

import com.foo.nuevaera.dominio.objetosValor.ArticuloID;

public interface CatalogoDeProductos {
    
    EspecificacionDelProducto getEspecificacion(ArticuloID id);

}
