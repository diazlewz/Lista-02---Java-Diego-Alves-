package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero do mes (1 a 12): ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("O mes tem 31 dias.");
            case 4, 6, 9, 11 -> System.out.println("O mes tem 30 dias.");
            case 2 -> System.out.println("O mes tem 28 dias.");
            default -> System.out.println("Mes invalido.");
        }

        scanner.close();
    }
}
