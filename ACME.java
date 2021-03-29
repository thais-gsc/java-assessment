import java.util.ArrayList;

import java.util.Scanner;

import Produtos.Produto;

public class ACME {

    static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao = 1;

        // while (opcao != 7) {
        //     opcao = Menu.menuObterOpcao(input);

        //     switch (opcao) {
        //         case '1':
        //             System.out.println("--- CADASTRO DE PRODUTO ---");
                    
        //             Menu.menuCadastrarProduto(input, listaProdutos);

        //             break;

        //         case '2':
        //             System.out.println("--- ALTERAÇÃO DE PRODUTO ---");

        //             Menu.menuAlteraProduto(input, listaProdutos);

        //         case '3':
        //             System.out.println("--- EXCLUSÃO DE PRODUTO ---");

        //             Menu.menuRemoveProduto(input, listaProdutos);

        //         case '4':
        //             System.out.println("--- CADASTRO DE COTAÇÃO ---");

        //             Menu.menuCadastrarCotacao(input, listaProdutos);

        //         case '5':
        //             System.out.println("--- BUSCA ---");

        //             consultarProduto(input, listaProdutos);
                
        //         case '6':
        //             System.out.println("--- LISTAGEM DE PRODUTOS ---");

        //             System.out.println(listaProdutos);

        //         case '7':
        //             System.out.println("--- AGRADECEMOS POR UTILIZAR NOSSO SISTEMA. ATÉ BREVE ---");
        //     }
        // }
        while (opcao != 7) {
            opcao = Menu.menuObterOpcao(input);

            if (opcao == 1) {
                System.out.println("--- CADASTRO DE PRODUTO ---");
                    
                Menu.menuCadastrarProduto(input, listaProdutos);
            }
            else if (opcao == 2) {
                System.out.println("--- ALTERAÇÃO DE PRODUTO ---");

                Menu.menuAlteraProduto(input, listaProdutos);
            }
            else if (opcao == 3) {
                System.out.println("--- EXCLUSÃO DE PRODUTO ---");

                Menu.menuRemoveProduto(input, listaProdutos);
            }
            else if (opcao == 4) {
                System.out.println("--- CADASTRO DE COTAÇÃO ---");

                Menu.menuCadastrarCotacao(input, listaProdutos);
            }

            else if (opcao == 5) {
                System.out.println("--- BUSCA DE PRODUTO ---");

                consultarProduto(input, listaProdutos);
            }

            else if (opcao == 6) {
                System.out.println("--- LISTAGEM DE PRODUTOS ---");

                System.out.println(listaProdutos);
            }
            else if (opcao == 7) {
                System.out.println("--- AGRADECEMOS POR UTILIZAR NOSSO SISTEMA. ATÉ BREVE ---");
        }
    }
}

    public static void consultarProduto(Scanner input, ArrayList<Produto> listaProdutos) {
        System.out.println("Deseja pesquisar por:");
        System.out.println("1 - Nome do Produto");
        System.out.println("2 - ID do Produto");

        int escolha = input.nextInt();

        if (escolha == 1) {
            System.out.println("Informe o nome do produto: ");

            String nomeBusca = input.nextLine();

            System.out.println(porNome(nomeBusca));
        }
        else if (escolha == 2) {
            System.out.println("Informe o ID do produto: ");

            int idBusca = input.nextInt();

            System.out.println(porID(idBusca));
        }

    }


    public static ArrayList<Produto>porNome(String nome) {
        
        String nomeBusca = nome;

        Produto buscaNome = new Produto();

        ArrayList<Produto> listaBuscaNome = new ArrayList<>();

        buscaNome = listaProdutos.stream().filter(nomePdt ->nomePdt.getNome() == nomeBusca).findAny().get();

        listaBuscaNome.add(buscaNome);

        return listaBuscaNome;
    }



    public static ArrayList<Produto> porID(int id) {

        int idBusca = id;

        Produto buscaID = new Produto();

        ArrayList<Produto> listaBuscaID = new ArrayList<>();

        buscaID = listaProdutos.stream().filter(idPdt ->idPdt.getId() == idBusca).findAny().get();

        listaBuscaID.add(buscaID);

        return listaBuscaID;
    }

}