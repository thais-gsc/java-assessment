package Fornecedores;

public class Fornecedor {
    
    private String nome;

    public Contato contato;

    public Fornecedor(String nome, Contato contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public Fornecedor() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
