package br.com.escambo.model;

import br.com.escambo.calculo.TipoTaxa;

public class RetornoTipoTaxa {

    private TipoTaxa[] tipoTaxas;

    public RetornoTipoTaxa(TipoTaxa[] tipoTaxas) {
        this.tipoTaxas = tipoTaxas;
    }

    public TipoTaxa[] getTipoTaxas() {
        return tipoTaxas;
    }
}
