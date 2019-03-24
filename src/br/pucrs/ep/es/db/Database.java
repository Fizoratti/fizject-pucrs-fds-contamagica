package br.pucrs.ep.es.db;

import br.pucrs.ep.es.model.Atendimento;
import br.pucrs.ep.es.model.Caixa;
import br.pucrs.ep.es.model.Cliente;
import br.pucrs.ep.es.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database INSTANCE = new Database();

    private static List<Cliente> clientes;
    private static List<Conta> contas;
    private static List<Caixa> caixas;
    private static List<Atendimento> atendimentos;

    private Database() {}

    public static Database getInstance() {
        return INSTANCE;
    }

    public static void start() {
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
        caixas = new ArrayList<>();
        atendimentos = new ArrayList<>();
    }

    public void add(Cliente cliente) {
        clientes.add(cliente);
    }
    public void add(Conta conta) {
        contas.add(conta);
    }
    public void add(Caixa caixa) {
        caixas.add(caixa);
    }
    public void add(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public ArrayList<Cliente> getClientes() {
        return (ArrayList<Cliente>) clientes;
    }
}
