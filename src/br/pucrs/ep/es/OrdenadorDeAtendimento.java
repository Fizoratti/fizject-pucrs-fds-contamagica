package br.pucrs.ep.es;

import br.pucrs.ep.es.model.Cliente;

import java.util.List;
import java.util.stream.Collectors;

public class OrdenadorDeAtendimento {
    public static Cliente chamarCliente(List<Cliente> clientes, boolean prioritario) {
        Cliente cliente = clientes.get(0); // Primeiro cliente da fila
        if(prioritario) {
            List<Cliente> prioritarios = clientes
                                        .stream()
                                        .filter(p -> p.getIdade() >= 65)
                                        .collect(Collectors.toList());
            cliente = prioritarios.get(0); // Primeiro cliente idoso da fila
        }
        return cliente;
    }
}
