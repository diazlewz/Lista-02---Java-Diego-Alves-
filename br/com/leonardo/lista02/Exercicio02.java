package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        int modulo = Math.abs(numero);

        if (numero > 0) {
            System.out.println("E positivo.");
        }
        if (numero % 2 == 0) {
            System.out.println("E par.");
        }
        if (numero % 5 == 0) {
            System.out.println("E multiplo de 5.");
        }
        if (modulo >= 10 && modulo <= 99) {
            System.out.println("Tem dois digitos.");
        }

        scanner.close();
    }
}
