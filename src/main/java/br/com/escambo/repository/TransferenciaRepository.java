package br.com.escambo.repository;

import br.com.escambo.model.Transferencia;

import java.util.ArrayList;
import java.util.List;

public class TransferenciaRepository {

    private List<Transferencia>  transferencias = new ArrayList<>(0);


    public void novaTransferencia(Transferencia transferencia){

        long id = transferencias.size()+1;
        transferencia.setId(id);
        transferencias.add(transferencia);

    }

    public List<Transferencia> obterTransferencias() {
        return transferencias;
    }
}
