package com.foo.nuevaera.dominio.objetosValor;

public class Dinero {

    private final int pesos;
    private final int centavos;

    public Dinero(int pesos, int centavos) {
        pesos = pesos + centavos / 100;
        centavos = centavos % 100;

        if (centavos < 0 && pesos > 0) {
            pesos -= 1;
            centavos += 100;
        } else if (centavos > 0 && pesos < 0) {
            pesos += 1;
            centavos -= 100;
        }

        this.pesos    = pesos;
        this.centavos = centavos;
    }

    public Dinero(double cantidad) {
        this((int) cantidad, (int) ((cantidad - (int) cantidad) * 100));
    }

    public int getPesos() {
        return pesos;
    }

    public int getCentavos() {
        return centavos;
    }

    public Dinero mas(Dinero masDinero) {
        int sumaCentavos = this.centavos + masDinero.centavos;
        int sumaPesos    = this.pesos    + masDinero.pesos;

        return new Dinero(sumaPesos, sumaCentavos);
    }

    public Dinero menos(Dinero masDinero) {
        int restaCentavos = this.centavos - masDinero.centavos;
        int restaPesos    = this.pesos    - masDinero.pesos;

        return new Dinero(restaPesos, restaCentavos);
    }

    public Dinero por(int n) {
        return new Dinero(this.pesos * n, this.centavos * n);
    }

    public boolean esIgualA(Dinero d) {
        return (this == d) || ((pesos == d.pesos) && (centavos == d.centavos));
    }

    @Override
    public boolean equals(Object d) {
        if (d instanceof Dinero)
            return esIgualA((Dinero) d);
        else
            return false;
    }

    public boolean esPositivo() {
        return this.pesos > 0 || this.centavos > 0;
    }

    @Override
    public String toString() {
        return String.format("$%d,%02d", this.pesos, this.centavos);
    }

    public boolean esMayorA(Dinero otroDinero) {
        return this.getMagnitud() > otroDinero.getMagnitud();
    }

    private int getMagnitud() {
        return this.pesos * 100 + this.centavos;
    }

    public float aFloat() {
        return this.pesos + (float) this.centavos / 100;
    }
    
    @Override
    public int hashCode() {
        return getMagnitud();
    }
}
