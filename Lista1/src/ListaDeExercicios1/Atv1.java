package ListaDeExercicios1;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Recebendo os valores do usuário e armazenando no vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Imprimindo os valores pares
        System.out.println("Valores pares:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        // Imprimindo os valores ímpares
        System.out.println("Valores ímpares:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
