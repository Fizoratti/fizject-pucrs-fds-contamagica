package br.pucrs.ep.es;

import br.pucrs.ep.es.db.Database;
import br.pucrs.ep.es.model.Caixa;
import br.pucrs.ep.es.model.Cliente;

public class Banco {
    private static Banco INSTANCE = new Banco();

    private static Database db;

    public static Banco getInstance() {
        return INSTANCE;
    }

    private Banco() {}

    public static void start() {
        db = Database.getInstance();
        initCaixas();
    }

    public static void initCaixas() {
        // Caixas prioritários:
        db.add(new Caixa(true));
        db.add(new Caixa(true));
        db.add(new Caixa(true));
        db.add(new Caixa(true));
        db.add(new Caixa(true));
        // Caixas regulares:
        db.add(new Caixa(false));
        db.add(new Caixa());
        db.add(new Caixa());
    }

    public void registrarCliente(Cliente cliente) {
        db.add(cliente);
    }

    public Cliente chamarCliente(boolean prioridade) {
        return OrdenadorDeAtendimento.chamarCliente(db.getClientes(), prioridade);
    }
}
