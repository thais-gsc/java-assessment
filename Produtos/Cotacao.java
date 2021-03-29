package Produtos;

import java.math.BigDecimal;

public class Cotacao {
    BigDecimal precoInternet;
    BigDecimal precoLoja;
    BigDecimal precoTelefone;

    public Cotacao(BigDecimal precoInternet, BigDecimal precoLoja, BigDecimal precoTelefone) {
        this.precoInternet = precoInternet;
        this.precoLoja = precoLoja;
        this.precoTelefone = precoTelefone;
    }

    public Cotacao() {
    }

    public BigDecimal getPrecoInternet() {
        return precoInternet;
    }

    public void setPrecoInternet(BigDecimal precoInternet) {
        this.precoInternet = precoInternet;
    }

    public BigDecimal getPrecoLoja() {
        return precoLoja;
    }

    public void setPrecoLoja(BigDecimal precoLoja) {
        this.precoLoja = precoLoja;
    }

    public BigDecimal getPrecoTelefone() {
        return precoTelefone;
    }

    public void setPrecoTelefone(BigDecimal precoTelefone) {
        this.precoTelefone = precoTelefone;
    }

    @Override
    public String toString() {
        return "[Preço encontrado na internet: R$" + precoInternet + ",00. \n Preço encontrado na loja: R$" + precoLoja + ",00. \n Preço encontrado por telefone: R$" + precoTelefone + ",00]";
    }

    
}
