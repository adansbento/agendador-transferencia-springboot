package br.com.escambo.calculo;


import br.com.escambo.calculo.taxa.TaxaA;
import br.com.escambo.calculo.taxa.TaxaB;
import br.com.escambo.calculo.taxa.TaxaC;
import br.com.escambo.calculo.taxa.TaxaD;

public enum TipoTaxa {
    A(new TaxaA()),
    B(new TaxaB()),
    C(new TaxaC()),
    D(new TaxaD());

    private Taxavel taxa;

    private TipoTaxa(Taxavel taxa){
        this.taxa = taxa;
    }

    public Taxavel getTaxa() {
        return taxa;
    }

}
