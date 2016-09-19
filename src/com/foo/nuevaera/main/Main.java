package com.foo.nuevaera.main;

import com.foo.nuevaera.dominio.CatalogoDeProductos;
import com.foo.nuevaera.dominio.LibroMayorDeVentas;
import com.foo.nuevaera.dominio.Registro;
import com.foo.nuevaera.dominio.objetosValor.ArticuloID;
import com.foo.nuevaera.dominio.objetosValor.Dinero;
import com.foo.nuevaera.persistencia.prueba.RepositorioArticulosDePrueba;
import com.foo.nuevaera.persistencia.prueba.RepositorioVentasDePrueba;

public class Main {

    public static void main(String[] args) {
        LibroMayorDeVentas lv = new RepositorioVentasDePrueba();
        CatalogoDeProductos c = new RepositorioArticulosDePrueba();
        
        Registro r = new Registro(c, lv);
        
        // Inicio prueba
        System.out.println("----------------------");
        r.crearNuevaVenta();
        r.introducirArticulo(new ArticuloID(100), 2);
        r.introducirArticulo(new ArticuloID(300), 1);
        r.finalizarVenta();
        r.realizarPago(new Dinero(80.00));

        System.out.println("----------------------");
        r.crearNuevaVenta();
        r.introducirArticulo(new ArticuloID(200), 4);
        r.introducirArticulo(new ArticuloID(100), 1);
        r.finalizarVenta();
        r.realizarPago(new Dinero(100.00));
    }

}
