package br.pucrs.ep.es.model;

public enum Categoria {
    SILVER(1,0.0),
    GOLD(2,1/100),
    PLATINUM(3,1/50);

    private final int categoria;
    private final double valorizacao;

    Categoria(int categoria, double valorizacao ) {
        this.categoria = categoria;
        this.valorizacao = valorizacao;
    }

    public int getCategoria() {
        return categoria;
    }

    public double getValorizacao() {
        return valorizacao;
    }
}
