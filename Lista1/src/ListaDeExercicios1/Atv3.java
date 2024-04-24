package ListaDeExercicios1;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor inicial
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Colocando o valor lido na primeira posição do vetor
        vetor[0] = valor;

        // Preenchendo o restante do vetor com o dobro do valor da posição anterior
        for (int i = 1; i < 10; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }

        // Mostrando o vetor
        System.out.println("Vetor resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }
}
