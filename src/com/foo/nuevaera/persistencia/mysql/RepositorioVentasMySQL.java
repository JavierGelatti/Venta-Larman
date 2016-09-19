package com.foo.nuevaera.persistencia.mysql;

import java.util.ArrayList;
import java.util.List;

import com.foo.nuevaera.dominio.LibroMayorDeVentas;
import com.foo.nuevaera.dominio.Venta;

public class RepositorioVentasMySQL implements LibroMayorDeVentas {
    
    private List<Venta> ventasRegistradas;
    
    public RepositorioVentasMySQL() {
        ventasRegistradas = new ArrayList<>();
    }

    @Override
    public void agregarVenta(Venta venta) {
        ventasRegistradas.add(venta);

        // ! Solo con propósitos de prueba
        imprimirDatosVenta(venta);
    }

    private void imprimirDatosVenta(Venta venta) {
        System.out.println("Se guardó una venta en la base de datos");
    }

}
