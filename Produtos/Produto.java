package Produtos;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Produto {

    private int id;
    private String nome;
    private String tipo;

    public Cotacao cotacao;

    static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Produto(int id,String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Produto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Produto(Cotacao cotacao) {
        this.cotacao = cotacao;
    }

    public Cotacao getCotacao() {
        return cotacao;
    }

    public void setCotacao(Cotacao cotacao) {
        this.cotacao = cotacao;
    }

    @Override
        public String toString() {
            return "[Produto " + this.getId() + ".\nNome: " + this.getNome() + ".\nTipo: " + this.getTipo() + " Cotação: " + this.getCotacao() +  "]\n";
        } 


    public static Produto removerProduto(int id) {

        int idBusca = id;

        Produto removeId = new Produto();

        removeId =  listaProdutos.stream().filter(idPdt ->idPdt.getId() == idBusca).findAny().get();

        return removeId;
    }

    public void remove(Produto removeId) {
    }

    public Stream<Produto> stream() {
        return null;
    }

    // public void menuCadastrarCotacao(Scanner input, Produto produto) {
    //     System.out.println("Informe o ID do produto que deseja cadastrar a cotação.");
    //     int idBusca = input.nextInt();

    //     Produto buscaID = listaProdutos.stream().filter(idPdt ->idPdt.getId() == idBusca).findAny().get();

    //     System.out.println("Informe o preço encontrado na internet.");
    //     BigDecimal precoInternet = input.nextBigDecimal();

    //     System.out.println("Informe o preço encontrado na loja.");
    //     BigDecimal precoLoja = input.nextBigDecimal();

    //     System.out.println("Informe o preço encontrado por telefone.");
    //     BigDecimal precoTelefone = input.nextBigDecimal();
    
    //     Cotacao cotacao = new Cotacao();
    //     cotacao.setPrecoInternet(precoInternet);
    //     cotacao.setPrecoLoja(precoLoja);
    //     cotacao.setPrecoTelefone(precoTelefone);
        
    //     buscaID.setCotacao(cotacao);
    // }
}

