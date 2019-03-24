package br.pucrs.ep.es.model;

import br.pucrs.ep.es.model.Cliente;

public class Conta {
    private Cliente cliente;

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
