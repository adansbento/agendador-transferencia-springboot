package br.com.escambo.service;

import br.com.escambo.model.RetornoTransferencia;
import br.com.escambo.model.Transferencia;

/**
 * Created by adansbento on 31/05/16.
 */
public interface TransferenciaService {

    RetornoTransferencia efetuarTransferencia(Transferencia transferencia);
}
