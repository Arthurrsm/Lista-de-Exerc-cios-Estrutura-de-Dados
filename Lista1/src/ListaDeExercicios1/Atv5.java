package ListaDeExercicios1;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário um valor para encontrar o número de Fibonacci correspondente
        System.out.print("Digite um valor para encontrar o número de Fibonacci correspondente: ");
        long n = scanner.nextLong();

        // Calculando o número de Fibonacci correspondente ao valor dado
        long fibPrev = 0;
        long fibCurr = 1;
        long fibNext;

        if (n == 0) {
            System.out.println("O número de Fibonacci correspondente é: " + fibPrev);
        } else if (n == 1) {
            System.out.println("O número de Fibonacci correspondente é: " + fibCurr);
        } else {
            for (int i = 2; i <= n; i++) {
                fibNext = fibPrev + fibCurr;
                fibPrev = fibCurr;
                fibCurr = fibNext;
            }
            System.out.println("O número de Fibonacci correspondente é: " + fibCurr);
        }
    }
}
