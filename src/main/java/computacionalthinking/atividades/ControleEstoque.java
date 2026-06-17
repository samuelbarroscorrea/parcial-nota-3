package computacionalthinking.atividades;

import java.util.Scanner;

public class ControleEstoque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[10];
        int[] estoque = new int[10];

        int quantidadeProdutos = 0;
        int opcao;

        //Basicamente aqui ele fala: faça
        do {
            System.out.println("\n===== CONTROLE DE ESTOQUE =====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Alterar Estoque");
            System.out.println("3 - Mostrar Estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    if (quantidadeProdutos < 10) {

                        System.out.print("Nome do produto: ");
                        produtos[quantidadeProdutos] = scanner.nextLine();

                        System.out.print("Quantidade: ");
                        estoque[quantidadeProdutos] = scanner.nextInt();
                        scanner.nextLine();

                        quantidadeProdutos++;

                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de produtos atingido.");
                    }

                    break;

                case 2:

                    System.out.print("Digite o nome do produto: ");
                    String nomeBusca = scanner.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < quantidadeProdutos; i++) {

                        if (produtos[i].equalsIgnoreCase(nomeBusca)) {

                            System.out.print("Nova quantidade: ");
                            estoque[i] = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Estoque atualizado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                case 3:

                    if (quantidadeProdutos == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.println("\n===== ESTOQUE ATUAL =====");

                    int maior = estoque[0];
                    int menor = estoque[0];
                    String produtoMaior = produtos[0];
                    String produtoMenor = produtos[0];
                    int total = 0;

                    for (int i = 0; i < quantidadeProdutos; i++) {

                        System.out.println(produtos[i] + " - " + estoque[i] + " unidades");

                        total += estoque[i];

                        if (estoque[i] > maior) {
                            maior = estoque[i];
                            produtoMaior = produtos[i];
                        }

                        if (estoque[i] < menor) {
                            menor = estoque[i];
                            produtoMenor = produtos[i];
                        }
                    }

                    System.out.println("\nProduto com maior estoque: "
                            + produtoMaior + " (" + maior + ")");

                    System.out.println("Produto com menor estoque: "
                            + produtoMenor + " (" + menor + ")");

                    System.out.println("Total de itens armazenados: " + total);

                    break;

                case 4:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        //E aqui é a condição de parada, ele para se opção for igual a 4
        } while (opcao != 4);

        scanner.close();
    }
}
