package br.pucrs.ep.es;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Caixa> caixas = new ArrayList<>();

    public Banco() {
        initCaixas();
    }

    public void initCaixas() {
        caixas.add(new Caixa());
        caixas.add(new Caixa());
        caixas.add(new Caixa());
        caixas.add(new Caixa());
        caixas.add(new Caixa());
        caixas.add(new Caixa());
    }

}
