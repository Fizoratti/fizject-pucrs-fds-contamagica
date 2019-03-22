package br.pucrs.ep.es;

public enum Disponibilidade {
    LIVRE(0),
    OCUPADO(1);

    private final int disp;

    Disponibilidade(int disp) {
        this.disp = disp;
    }

    public int getValor(){
        return disp;
    }
}
