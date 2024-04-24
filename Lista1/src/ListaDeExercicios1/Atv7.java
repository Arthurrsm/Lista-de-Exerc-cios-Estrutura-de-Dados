package ListaDeExercicios1;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo um número inteiro entre 2 e 5 do usuário
        int N;
        do {
            System.out.print("Digite um número inteiro entre 2 e 5: ");
            N = scanner.nextInt();
        } while (N < 2 || N > 5);

        // Criando uma matriz quadrada de NxN
        int[][] matriz = new int[N][N];

        // Preenchendo a matriz com valores de 1 até N^2
        int valor = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Calculando o quadrado da matriz
        int[][] quadradoMatriz = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                quadradoMatriz[i][j] = matriz[i][j] * matriz[i][j];
            }
        }

        // Exibindo o quadrado da matriz
        System.out.println("O quadrado da matriz " + N + "x" + N + " é:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(quadradoMatriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
