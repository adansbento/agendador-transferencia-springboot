package br.com.escambo.service;

import br.com.escambo.bo.RetornoTransferenciaBo;
import br.com.escambo.bo.TransferenciaBo;
import br.com.escambo.entity.Transferencia;

/**
 * Created by adansbento on 31/05/16.
 */
public interface TransferenciaService {

    RetornoTransferenciaBo efetuarTransferencia(TransferenciaBo transferencia);
}
