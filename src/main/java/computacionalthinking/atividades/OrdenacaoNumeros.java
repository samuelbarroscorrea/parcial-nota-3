package computacionalthinking.atividades;

import java.util.Scanner;

public class OrdenacaoNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Leitura dos números
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibição dos números informados
        System.out.println("\nNúmeros informados:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Exibição dos números ordenados
        System.out.println("\n\nNúmeros em ordem crescente:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
