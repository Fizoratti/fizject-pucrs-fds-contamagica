package br.pucrs.ep.es.model;

import java.util.List;

public class Caixa {
    private Disponibilidade disponibilidade;
    private boolean prioritario;

    public Caixa() {
        setLivre();
        setPrioridade(false);
    }

    /**
     * @param prioritario define se o caixa prioriza clientes (true) ou não prioriza (false)
     */
    public Caixa(boolean prioritario) {
        setLivre();
        setPrioridade(prioritario);
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
        //historico = new Atendimento(cliente);
    }

    public void dispensar() {

    }

    public void setPrioridade(boolean prioridade) {
        this.prioritario = prioridade;
    }
}
