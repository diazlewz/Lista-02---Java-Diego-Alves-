package br.com.leonardoaraujosenai.lista02;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Escolha a operacao (1-Soma, 2-Subtracao, 3-Multiplicacao, 4-Divisao): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> System.out.printf(Locale.US, "Resultado: %.2f%n", numero1 + numero2);
            case 2 -> System.out.printf(Locale.US, "Resultado: %.2f%n", numero1 - numero2);
            case 3 -> System.out.printf(Locale.US, "Resultado: %.2f%n", numero1 * numero2);
            case 4 -> {
                if (numero2 == 0) {
                    System.out.println("Nao e possivel dividir por zero.");
                } else {
                    System.out.printf(Locale.US, "Resultado: %.2f%n", numero1 / numero2);
                }
            }
            default -> System.out.println("Opcao invalida.");
        }

        scanner.close();
    }
}
