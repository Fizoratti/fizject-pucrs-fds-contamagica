package br.pucrs.ep.es;

import java.util.List;

public class Caixa {
    private Disponibilidade disponibilidade;
    private List<Atendimento> historico;

    public Caixa() {
        setLivre();
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public void setLivre() {
        setDisponibilidade(Disponibilidade.LIVRE);
    }
    public void setOcupado() {
        setDisponibilidade(Disponibilidade.OCUPADO);
    }

    public void atender(Cliente cliente) {
        setOcupado();
        historico = new Atendimento(cliente);
    }

    public void dispensar() {

    }
}
