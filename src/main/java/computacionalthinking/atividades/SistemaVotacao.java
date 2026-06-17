package computacionalthinking.atividades;

import java.util.Scanner;

public class SistemaVotacao {
    public static void main(String[] args) {

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int nulos = 0;
        int brancos = 0;
        int voto;

        System.out.println("=== SISTEMA DE VOTACAO ===");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Voto Nulo");
        System.out.println("5 - Voto em Branco");
        System.out.println("0 - Encerrar votacao");

        // Recebe votos até o usuário digitar 0
        while (true) {
            System.out.print("\nDigite seu voto: ");
            voto = scanner.nextInt();

            if (voto == 0) {
                break;
            }

            //Identifica para quem vai o voto
            switch (voto) {
                case 1:
                    candidato1++;
                    break;

                case 2:
                    candidato2++;
                    break;

                case 3:
                    candidato3++;
                    break;

                case 4:
                    nulos++;
                    break;

                case 5:
                    brancos++;
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }

        int totalVotos = candidato1 + candidato2 + candidato3 + nulos + brancos;

        // Exibição do resultado final
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Votos Candidato 1: " + candidato1);
        System.out.println("Votos Candidato 2: " + candidato2);
        System.out.println("Votos Candidato 3: " + candidato3);
        System.out.println("Votos Nulos: " + nulos);
        System.out.println("Votos em Branco: " + brancos);
        System.out.println("Total de Votos: " + totalVotos);

        scanner.close();
    }
}
