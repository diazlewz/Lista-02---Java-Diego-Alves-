package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Nao e possivel verificar: divisao por zero.");
        } else {
            if (a % b == 0) {
                System.out.println(a + " e multiplo de " + b + ".");
            } else {
                System.out.println(a + " nao e multiplo de " + b + ".");
            }
        }

        scanner.close();
    }
}
