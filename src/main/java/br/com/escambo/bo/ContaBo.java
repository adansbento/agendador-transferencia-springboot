package br.com.escambo.bo;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by adansbento on 31/05/16.
 */
public class ContaBo  implements Serializable {

    private Long id;
    private String numeroConta;
    private BigDecimal saldo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnumeroConta() {
        return numeroConta;
    }

    public void setnumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
