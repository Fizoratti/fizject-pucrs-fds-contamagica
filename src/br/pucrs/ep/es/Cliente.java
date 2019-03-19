package br.pucrs.ep.es;

public class Cliente {
    public String nome;
    public int idade;

    public Cliente(String nome) {
        setNome(nome);
    }
    public Cliente(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
