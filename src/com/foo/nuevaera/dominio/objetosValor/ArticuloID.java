package com.foo.nuevaera.dominio.objetosValor;

public class ArticuloID {
    
    private final int valor;

    public ArticuloID(int id) {
        valor = id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ArticuloID) {
            return esIgualA((ArticuloID) obj);
        }
        return false;
    }

    private boolean esIgualA(ArticuloID id) {
        return id.valor == this.valor;
    }
    
    @Override
    public int hashCode() {
        return valor;
    }

}
