package ListaDeExercicios1;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir dimensões das matrizes ao usuário
        System.out.println("Digite o número de linhas e colunas da primeira matriz:");
        int linhas1 = scanner.nextInt();
        int colunas1 = scanner.nextInt();
        System.out.println("Digite o número de linhas e colunas da segunda matriz:");
        int linhas2 = scanner.nextInt();
        int colunas2 = scanner.nextInt();

        // Verificar se é possível multiplicar as matrizes
        if (colunas1 != linhas2) {
            System.out.println("Não é possível multiplicar as matrizes.");
            return;
        }

        // Ler as matrizes do usuário
        int[][] matriz1 = lerMatriz(scanner, linhas1, colunas1);
        int[][] matriz2 = lerMatriz(scanner, linhas2, colunas2);

        // Multiplicar as matrizes
        int[][] resultado = multiplicarMatrizes(matriz1, matriz2);

        // Mostrar o resultado da multiplicação
        System.out.println("O resultado da multiplicação das matrizes é:");
        mostrarMatriz(resultado);
    }

    // Método para ler uma matriz do usuário
    public static int[][] lerMatriz(Scanner scanner, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    // Método para multiplicar duas matrizes
    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas1 = matriz1.length;
        int colunas1 = matriz1[0].length;
        int colunas2 = matriz2[0].length;
        int[][] resultado = new int[linhas1][colunas2];

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int k = 0; k < colunas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    // Método para mostrar uma matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
