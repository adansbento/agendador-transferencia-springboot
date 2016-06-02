package br.com.escambo.bo;

/**
 * Created by adansbento on 31/05/16.
 */
public class RetornoTransferenciaBo {

    private int codigoRetorno;
    private String mensagem;

    public int getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(int codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
