package br.com.escambo.calculo;

import br.com.escambo.model.Transferencia;

import java.math.BigDecimal;

public interface Taxavel {

    BigDecimal calcularTaxa(Transferencia transferencia);
}
