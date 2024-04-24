package ListaDeExercicios1;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Recebendo os valores do usuário e armazenando no vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Calculando a média ponderada
        double soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i] * (i + 1); // Multiplicando o valor pelo índice e somando
        }
        double media = soma / 55; // Soma dos índices de 1 a 10 é 55

        // Imprimindo a média ponderada
        System.out.println("A média ponderada dos valores é: " + media);
    }
}
