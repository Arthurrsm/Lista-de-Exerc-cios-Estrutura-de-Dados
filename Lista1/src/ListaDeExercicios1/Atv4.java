package ListaDeExercicios1;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor X
        System.out.print("Digite um valor para X: ");
        int x = scanner.nextInt();

        // Colocando o valor X na primeira posição do vetor
        vetor[0] = x;

        // Preenchendo as posições subsequentes do vetor com a metade do valor da posição anterior
        for (int i = 1; i < 100; i++) {
            vetor[i] = vetor[i - 1] / 2;
        }

        // Mostrando o vetor
        System.out.println("Vetor resultante:");
        for (int i = 0; i < 100; i++) {
            System.out.println(vetor[i]);
        }
    }
}
