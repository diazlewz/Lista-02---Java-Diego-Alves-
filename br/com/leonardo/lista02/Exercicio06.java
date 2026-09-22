package br.com.leonardoaraujosenai.lista02;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double frete;

        if (valorCompra >= 199.00) {
            frete = 0.0;
        } else {
            frete = 24.90;
        }

        double total = valorCompra + frete;

        System.out.printf(Locale.US, "Frete: R$ %.2f%n", frete);
        System.out.printf(Locale.US, "Total a pagar: R$ %.2f%n", total);

        scanner.close();
    }
}
