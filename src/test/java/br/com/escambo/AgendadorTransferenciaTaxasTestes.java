package br.com.escambo;

import br.com.escambo.calculo.taxa.TaxaA;
import br.com.escambo.model.Transferencia;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class AgendadorTransferenciaTaxasTestes {

    /*
     *
     *  A: Operações do tipo A tem uma taxa de $2 mais 3% do valor da transferência
     *
     */

    @Test
    public void testeTaxaA(){
        TaxaA taxaA = new TaxaA();
        assertEquals("TaxaA Valor 100 taxa tem que ser igual a 5",new BigDecimal(5),taxaA.calcularTaxa(criarTransferecnia()));
    }


        public Transferencia criarTransferecnia(){

            Transferencia transferencia = new Transferencia();
            transferencia.setContaDestino("10010-9");
            transferencia.setContaOrigem("30100-4");
            transferencia.setDataCadastro(LocalDate.now());
            transferencia.setDataTransferencia(LocalDate.now());
            transferencia.setValor(new BigDecimal(100));

            return transferencia;
        }

}
