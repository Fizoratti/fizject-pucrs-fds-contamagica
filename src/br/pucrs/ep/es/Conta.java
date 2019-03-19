package br.pucrs.ep.es;

public class Conta {
    public Cliente cliente;
    public Conta(Cliente cliente) {
        setCliente(cliente);
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNomeCliente(){
        return this.cliente.getNome();
    }
}
