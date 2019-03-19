package br.pucrs.ep.es;

public class Cliente {
    public String nome;

    public Cliente(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
}
