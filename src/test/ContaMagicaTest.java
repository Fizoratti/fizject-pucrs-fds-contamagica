package test;

import br.pucrs.ep.es.ContaMagica;
import br.pucrs.ep.es.model.Cliente;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ContaMagicaTest {
    private ContaMagica conta;

    @Before
    public void setUp() {
        conta = new ContaMagica(new Cliente("Felipe", 24));
        conta.depositar(new BigDecimal("5000"));
    }

    @Test
    public void validarValorTest() {

    }

    @Test
    public void depositarTest() {
        conta.depositar(new BigDecimal("5000"));
        assertEquals(new BigDecimal("10000"), conta.getSaldo());
    }

    @Test
    public void saldoTest() {
        assertEquals(new BigDecimal("5000"), conta.getSaldo());
    }

    @Test
    public void retirarTest() {
        conta.retirar(new BigDecimal("1000"));
        assertEquals(new BigDecimal("4000"), conta.getSaldo());
    }
}
