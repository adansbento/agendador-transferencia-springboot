package br.com.escambo;


import br.com.escambo.calculo.taxa.TaxaA;
import br.com.escambo.model.Transferencia;
import br.com.escambo.repository.TransferenciaRepository;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class AgendadorTransferenciaTestes {


    /**
     * Criar nova transferencia
     */
    @Test
    public void criarTransferencia(){
        TransferenciaRepository transferenciaRepository = new TransferenciaRepository();

        Transferencia transferencia = new Transferencia();
        transferencia.setValor(new BigDecimal(100));
        transferencia.setContaOrigem("12345-6");
        transferencia.setContaDestino("65432-1");
        transferencia.setDataTransferencia(LocalDate.now());
        transferencia.setTaxa(new TaxaA().calcularTaxa(transferencia));

        transferenciaRepository.novaTransferencia(transferencia);
        assertNotNull(transferenciaRepository.getTransferencias());
        assertEquals("A lista de transferencia tem que ter 1 elemento",1,transferenciaRepository.getTransferencias().size());


    }
}
