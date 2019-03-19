package br.pucrs.ep.es;

import java.math.BigDecimal;

public class ContaMagica extends Conta {
    private BigDecimal saldo;
    private Categoria status;

    public ContaMagica(Cliente cliente) {
        super(cliente);
        this.saldo = new BigDecimal("0.0");
        this.status = Categoria.SILVER;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }
    public Categoria getStatus(){
        return this.status;
    }
//    public void deposito(BigDecimal valor) {…}
//    public void retirada(BigDecimal valor) {…}
}
