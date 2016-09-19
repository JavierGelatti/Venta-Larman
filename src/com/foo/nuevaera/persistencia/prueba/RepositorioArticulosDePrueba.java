package com.foo.nuevaera.persistencia.prueba;

import java.util.HashMap;
import java.util.Map;

import com.foo.nuevaera.dominio.CatalogoDeProductos;
import com.foo.nuevaera.dominio.EspecificacionDelProducto;
import com.foo.nuevaera.dominio.objetosValor.ArticuloID;
import com.foo.nuevaera.dominio.objetosValor.Dinero;

public class RepositorioArticulosDePrueba implements CatalogoDeProductos {
    
    private Map<ArticuloID, EspecificacionDelProducto> especificaciones;
    
    public RepositorioArticulosDePrueba() {
        especificaciones = new HashMap<>();
        cargarEspecificaciones();
    }

    private void cargarEspecificaciones() {
        cargarEspecificacion(100, "Articulo A", new Dinero(10.50));
        cargarEspecificacion(200, "Articulo B", new Dinero(20.40));
        cargarEspecificacion(300, "Articulo C", new Dinero(50.00));
    }

    private void cargarEspecificacion(int nroID, String descripcion, Dinero precio) {
        ArticuloID id = new ArticuloID(nroID);
        especificaciones.put(id, new EspecificacionDelProducto(id, descripcion, precio));
    }

    @Override
    public EspecificacionDelProducto getEspecificacion(ArticuloID id) {
        return especificaciones.get(id);
    }

}
