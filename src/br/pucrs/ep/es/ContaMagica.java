package br.pucrs.ep.es;

import br.pucrs.ep.es.model.Categoria;
import br.pucrs.ep.es.model.Cliente;
import br.pucrs.ep.es.model.Conta;

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

    public void depositar(BigDecimal valor) {
        BigDecimal saldoAntes = getSaldo();
        if(validarValor(valor)) {
            this.saldo = this.saldo.add(new BigDecimal(Double.parseDouble(valor.toString()) * status.getValorizacao()));
        }
        updateStatus(saldoAntes, this.saldo);
    }

    public void retirar(BigDecimal valor) {
        BigDecimal saldoAntes = getSaldo();
        if(validarValor(valor)) {
            this.saldo = this.saldo.subtract(new BigDecimal(Double.parseDouble(valor.toString())));
        }
        updateStatus(saldoAntes, this.saldo);
    }

    private boolean validarValor(BigDecimal valor) {
        boolean flag = false;
        if(valor.doubleValue() > 0.0) {
            flag = true;
        }
        return flag;
    }

    private void updateStatus(BigDecimal saldoAntes, BigDecimal saldoDepois) {
        if(saldoAntes.doubleValue() < saldoDepois.doubleValue()) { // Depósito
            if (getSaldo().doubleValue() >= 50000) {
                upgradeStatus(2);
            }
            if (getSaldo().doubleValue() >= 200000) {
                upgradeStatus(3);
            }
        }
        boolean downgrade = false;
        if(saldoAntes.doubleValue() > saldoDepois.doubleValue()) { // Retirada
            if (saldoAntes.doubleValue() > 100000 && saldoDepois.doubleValue() < 100000) {
                downgrade = true;
            }
            if (saldoAntes.doubleValue() > 25000 && saldoDepois.doubleValue() < 25000) {
                downgrade = true;
            }
            if (downgrade) {
                downgradeStatus();
            }
        }
    }

    private void upgradeStatus(int categoria) {
        switch(categoria) {
            case 2:
                this.status = Categoria.GOLD;
                break;
            case 3:
                this.status = Categoria.PLATINUM;
                break;
            default:
                this.status = Categoria.SILVER;
        }
    }

    private void downgradeStatus() {
        switch(this.status.getCategoria()) {
            case 3:
                this.status = Categoria.GOLD;
                break;
            default:
                this.status = Categoria.SILVER;
        }
    }

}
