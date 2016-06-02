package br.com.escambo.bo;

import br.com.escambo.entity.Conta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by adansbento on 31/05/16.
 */
public class TransferenciaBo  implements Serializable {

    private Long id;
    private BigDecimal valor;
    private Date dataTransferencia;
    private ContaBo contaDestino;
    private ContaBo contaOrigem;

    public TransferenciaBo(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(Date dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public ContaBo getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(ContaBo contaDestino) {
        this.contaDestino = contaDestino;
    }

    public ContaBo getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(ContaBo contaOrigem) {
        this.contaOrigem = contaOrigem;
    }
}
