package Produtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Fornecedores.Fornecedor;

public class Cotacao {
    private BigDecimal precoInternet;
    private BigDecimal precoLoja;
    private BigDecimal precoTelefone;
    private Fornecedor fornecedor;
    

    public Cotacao(BigDecimal precoInternet, BigDecimal precoLoja, BigDecimal precoTelefone, Fornecedor fornecedor) {
        this.precoInternet = precoInternet;
        this.precoLoja = precoLoja;
        this.precoTelefone = precoTelefone;
        this.fornecedor = fornecedor;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\n\nData da cotação: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm\n")) + 
        "\nFornecedor: " + Fornecedor.Fornecedores.porCodigo((int)Math.floor(Math.random()*(5-1+1)+1)) +
        "\n\nPreço encontrado na internet: R$" + precoInternet +
        ". \nPreço encontrado na loja: R$" + precoLoja +
        ". \nPreço encontrado por telefone: R$" + precoTelefone;
    }

}
