import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Produtos.Cotacao;
import Produtos.Produto;

public class Menu {
    public static int menuObterOpcao(Scanner input) throws Exception {

        boolean valido = false;
        int opcao = 7;
        
        while (!valido) {        
            System.out.println("Digite a opção desejada: ");
            System.out.println("[1] Cadastrar novo produto");
            System.out.println("[2] Alterar um produto existente");
            System.out.println("[3] Excluir um produto existente");
            System.out.println("[4] Cadastrar nova cotação");
            System.out.println("[5] Buscar produto");
            System.out.println("[6] Listar todos os produtos cadastrados");
            System.out.println("[7] Sair");

            try {
                String entrada = input.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 1 && opcao <= 7) {
                    valido = true;
                }
                else {
                    throw new Exception("Entrada inválida.");
                }
            }
            catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite novamente.");
            }
        }
        return opcao;
        
    }

// OPÇÃO 1 --- CADASTRO DE PRODUTO ---

    public static void menuCadastrarProduto(Scanner input, ArrayList<Produto> listaProdutos) {

        System.out.println("Informe o nome do produto.");
        String nome = input.nextLine();

        System.out.println("Informe o tipo do produto.");
        String tipo = input.nextLine();
    
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setTipo(tipo);

        produto.setId(listaProdutos.size() + 1) ;

        listaProdutos.add(produto);

        System.out.println("Produto cadastrado com sucesso\n");
    }

    // OPÇÃO 2 --- ALTERAÇÃO DE PRODUTO ---

    public static void menuAlteraProduto(Scanner input, ArrayList<Produto> listaProdutos) throws ACMEException {

        System.out.println("Informe o ID do produto que deseja alterar.");

        int idBusca = input.nextInt();

        Produto alteraId =  listaProdutos.stream().filter(idPdt ->idPdt.getId() == idBusca).findAny().get();

        System.out.println("Informe qual ação deseja realizar:");
        System.out.println("1 - Alterar nome.");
        System.out.println("2 - Alterar tipo.");
        System.out.println("3 - Alterar ambos.");

        int escolha = input.nextInt();

        if (escolha == 1 || escolha == 2 || escolha == 3) {

            if (escolha == 1) {

                System.out.println("Informe o novo nome do produto: ");
    
                String novoNome = input.next();
    
                alteraId.setNome(novoNome);

                System.out.println("Nome alterado com sucesso.\n");
            }
            else if (escolha == 2) {

                System.out.println("Informe o novo tipo do produto: ");
    
                String novoTipo = input.next();
    
                alteraId.setTipo(novoTipo);

                System.out.println("Tipo alterado com sucesso.\n");
            }
            else if (escolha == 3) {

                System.out.println("Informe o novo nome do produto: ");
    
                String novoNome = input.next();
    
                alteraId.setNome(novoNome);

                System.out.println("Nome alterado com sucesso.\n");
                
                System.out.println("Informe o novo tipo do produto: ");
    
                String novoTipo = input.next();
    
                alteraId.setTipo(novoTipo);

                System.out.println("Tipo alterado com sucesso.\n");
            }
        }
        else {
            throw new ACMEException();
        }
    }

    // OPÇÃO 3 --- EXCLUSÃO DE PRODUTO ---
    
    public static void menuRemoveProduto(Scanner input, ArrayList<Produto> listaProdutos) {
        
        System.out.println("Informe o ID do produto que deseja excluir.");

        int idBusca = input.nextInt();

        try {
            Produto removeId =  listaProdutos.stream().filter(idPdt ->idPdt.getId() == idBusca).findAny().get();
    
            listaProdutos.remove(removeId);
    
            System.out.println("Produto excluído com sucesso.\n");
    
            System.out.println(listaProdutos);
        } 
        catch (InputMismatchException exception) {
            System.out.println("Entrada inválida");
        }
        catch (NoSuchElementException exception) {
            System.out.println("Não existe produto com este ID");
        }
    }

    // OPÇÃO 4--- CADASTRO DE COTAÇÃO ---

    public static void menuCadastrarCotacao(Scanner input, ArrayList<Produto> listaProdutos) {

        System.out.println("Informe o ID do produto que deseja cadastrar a cotação.");

        int idBusca = input.nextInt();

        try {
            Produto buscaID = listaProdutos.stream().filter(idPdt ->idPdt.getId() == idBusca).findAny().get();
    
            System.out.println("Informe o preço encontrado na internet.");
            BigDecimal precoInternet = input.nextBigDecimal();
    
            System.out.println("Informe o preço encontrado na loja.");
            BigDecimal precoLoja = input.nextBigDecimal();
    
            System.out.println("Informe o preço encontrado por telefone.");
            BigDecimal precoTelefone = input.nextBigDecimal();
        
            Cotacao cotacao = new Cotacao();
            cotacao.setPrecoInternet(precoInternet);
            cotacao.setPrecoLoja(precoLoja);
            cotacao.setPrecoTelefone(precoTelefone);
            
            buscaID.setCotacao(cotacao);

            System.out.println("Cotação cadastrada com sucesso.\n");
        } 
        catch (NoSuchElementException exception) {
            System.out.println("Entrada inválida.");
        }
    }
}