package Produtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cotacao {
    private BigDecimal precoInternet;
    private BigDecimal precoLoja;
    private BigDecimal precoTelefone;
    

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
        return "Data da cotação: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm\n")) + 
        "\nPreço encontrado na internet: R$" + precoInternet +
        ". \nPreço encontrado na loja: R$" + precoLoja +
        ". \nPreço encontrado por telefone: R$" + precoTelefone;
    }


    
}
