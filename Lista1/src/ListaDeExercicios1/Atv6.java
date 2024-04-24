package ListaDeExercicios1;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Solicitar ao usuário os valores para preencher a matriz
        System.out.println("Digite os valores da matriz 3x3:");

        // Preenchendo a matriz com os valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando o determinante da matriz usando a regra de Sarrus
        int determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2])
                + (matriz[0][1] * matriz[1][2] * matriz[2][0])
                + (matriz[0][2] * matriz[1][0] * matriz[2][1])
                - (matriz[0][2] * matriz[1][1] * matriz[2][0])
                - (matriz[0][0] * matriz[1][2] * matriz[2][1])
                - (matriz[0][1] * matriz[1][0] * matriz[2][2]);

        // Exibindo o determinante da matriz
        System.out.println("O determinante da matriz é: " + determinante);
    }
}
