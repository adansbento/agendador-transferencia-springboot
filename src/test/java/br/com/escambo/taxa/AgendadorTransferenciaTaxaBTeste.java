package br.com.escambo.taxa;


import br.com.escambo.AgendadorTransferenciaUtilTeste;
import br.com.escambo.calculo.taxa.TaxaB;
import br.com.escambo.model.Transferencia;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class AgendadorTransferenciaTaxaBTeste {

    @Test
    public void testeTaxaBComDataTransferenciaDeTrintaDias(){
        TaxaB taxaB = new TaxaB();
        LocalDate dataAtualMaisTrintaDias = LocalDate.now().plusDays(30);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(dataAtualMaisTrintaDias,new BigDecimal("100.00"));
        assertTrue("TaxaB com data Transferencia 30 dias e Valor 100.00 taxa tem que ser igual a 10.00",new BigDecimal("10.00").compareTo(taxaB.calcularTaxa(transferencia))==0);
    }


    @Test
    public void testeTaxaBComDataTransMaiorQueTrintaDias(){
        TaxaB taxaB = new TaxaB();
        LocalDate dataAtualMaisTQuarentaDias = LocalDate.now().plusDays(40);
        Transferencia transferencia = AgendadorTransferenciaUtilTeste.criaTransferencia(dataAtualMaisTQuarentaDias,new BigDecimal("100.00"));
        assertTrue("axaB com data Transferencia 40 dias e  Valor 100.00 taxa tem que ser igual a 8.00",new BigDecimal("8.00").compareTo(taxaB.calcularTaxa(transferencia))==0);
    }

}
