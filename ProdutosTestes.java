package TestesProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutosTestes {
    // Lista de produtos
    private static List<InterfaceProdutos> produtos = new ArrayList<>();

    // Função para cadastrar um novo produto
    public static void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.print("Produto disponível para venda? (1 para Sim, 0 para Não): ");
        int disponivelInput = scanner.nextInt();
        boolean disponivel = disponivelInput == 1;

        InterfaceProdutos produto = new InterfaceProdutos(nome, valor, disponivel);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!\n");
    }

    // Função para listar os produtos cadastrados
    public static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.\n");
        } else {
            System.out.println("Produtos cadastrados:");
            for (InterfaceProdutos produto : produtos) {
                System.out.println(produto);
            }
            System.out.println();  // Quebra de linha
        }
    }

    // Função principal com menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // Menu simples para navegar entre as opções de cadastro e listagem
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
