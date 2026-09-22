package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar.");
        }
        if (idade >= 18) {
            System.out.println("Pode dirigir.");
        }
        if (idade >= 60) {
            System.out.println("E idoso.");
        }

        scanner.close();
    }
}
