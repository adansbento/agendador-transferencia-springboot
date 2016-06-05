package br.com.escambo.model;

import java.util.List;

public class RetornoTransferencias {

    private List<Transferencia> transferencias;

    public RetornoTransferencias(List<Transferencia> transferencias) {
        this.transferencias = transferencias;
    }


    public List<Transferencia> getTransferencias() {
        return transferencias;
    }

}
