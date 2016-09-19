package com.foo.nuevaera.persistencia.prueba;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.foo.nuevaera.dominio.LibroMayorDeVentas;
import com.foo.nuevaera.dominio.Venta;

public class RepositorioVentasDePrueba implements LibroMayorDeVentas {
    
    private List<Venta> ventasRegistradas;
    
    public RepositorioVentasDePrueba() {
        ventasRegistradas = new ArrayList<>();
    }

    @Override
    public void agregarVenta(Venta venta) {
        ventasRegistradas.add(venta);

        // ! Solo con propósitos de prueba
        imprimirDatosVenta(venta);
    }

    private void imprimirDatosVenta(Venta venta) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Se guardó una venta");
        System.out.println(df.format(venta.getFecha()));
        System.out.println("El total es:");
        System.out.println(venta.getTotal());
        System.out.println("El vuelto es:");
        System.out.println(venta.getDevolucion());
    }

}
