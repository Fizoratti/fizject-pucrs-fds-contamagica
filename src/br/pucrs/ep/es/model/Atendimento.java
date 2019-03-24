package br.pucrs.ep.es.model;

import br.pucrs.ep.es.model.Cliente;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Atendimento {
    private Cliente cliente;
    private Date dataHoraAtendimento;
    private String data;
    private String hora;

    public Atendimento(Cliente cliente) {
        dataHoraAtendimento = new Date();
        data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtendimento);
        hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtendimento);
    }

}
