package Fornecedores;

import java.util.Arrays;
import java.util.List;

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

    public static class Fornecedores {

        static Contato contato1 = new Contato("9999-1234", "coyote@entregas.com");
        static Contato contato2 = new Contato("9999-5678", "papaleguas@entregas.com");
        static Contato contato3 = new Contato("9988-4321", "presuntinho@entregas.com");
        static Contato contato4 = new Contato("9987-8765", "pernalonga@entregas.com");
        static Contato contato5 = new Contato("9921-3050", "patolino@entregas.com");
    
        
        private static Fornecedor[] fornecedores = {
    
            new Fornecedor("Coyote S.A.", contato1),
            new Fornecedor("Papaleguas Inc.", contato2),
            new Fornecedor("Porquinho Produtos", contato3),
            new Fornecedor("Coelho Verduras", contato4),
            new Fornecedor("Limpezas Pato", contato5),
            
        };
    
        public List<Fornecedor> todos() {
            return Arrays.asList(fornecedores);
        }

        public static Fornecedor porCodigo(int codigo) {
            return fornecedores[codigo];
        }

        @Override
        public String toString() {
            return "Fornecedores []";
        }

        
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "" + contato;
    }

    
}
