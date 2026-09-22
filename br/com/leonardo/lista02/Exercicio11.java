package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a frequencia (%): ");
        double frequencia = scanner.nextDouble();

        System.out.print("Digite a media final: ");
        double media = scanner.nextDouble();

        if (frequencia < 75) {
            System.out.println("Reprovado por falta.");
        } else {
            if (media >= 7) {
                System.out.println("Aprovado.");
            } else if (media >= 5) {
                System.out.println("Recuperacao.");
            } else {
                System.out.println("Reprovado por nota.");
            }
        }

        scanner.close();
    }
}
