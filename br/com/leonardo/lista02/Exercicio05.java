package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println(ano + " e bissexto.");
        } else {
            System.out.println(ano + " nao e bissexto.");
        }

        scanner.close();
    }
}
