package br.pucrs.ep.es.model;

public enum Categoria {
    SILVER(1),
    GOLD(2),
    PLATINUM(3);

    private final int cat;

    Categoria(int cat) {
        this.cat = cat;
    }

    public int getValor(){
        return cat;
    }
}
