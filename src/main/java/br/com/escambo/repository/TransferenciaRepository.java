package br.com.escambo.repository;

import br.com.escambo.model.Transferencia;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransferenciaRepository {

    private List<Transferencia>  transferencias = new ArrayList<>(0);


    public void novaTransferencia(Transferencia transferencia){

        long id = transferencias.size()+1;
        transferencia.setId(id);
        transferencias.add(transferencia);

    }

    public List<Transferencia> getTransferencias() {
        return transferencias;
    }
}
