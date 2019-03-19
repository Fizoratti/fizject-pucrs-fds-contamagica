package br.pucrs.ep.es;

public class Conta {
    private Cliente cliente;
    private Conta(Cliente cliente) {
        setCliente(cliente);
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNomeCliente(){
        return this.cliente.getNome();
    }
}
