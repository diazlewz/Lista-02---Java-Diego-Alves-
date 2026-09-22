package br.com.leonardoaraujosenai.lista02;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de casa (anos): ");
        double tempoCasa = scanner.nextDouble();

        double percentualBonus;

        if (tempoCasa < 1) {
            percentualBonus = 0;
        } else if (tempoCasa <= 3) {
            percentualBonus = 0.05;
        } else if (tempoCasa <= 10) {
            percentualBonus = 0.10;
        } else {
            percentualBonus = 0.15;
        }

        double valorBonus = salario * percentualBonus;

        System.out.printf(Locale.US, "Percentual de bonus: %.0f%%%n", percentualBonus * 100);
        System.out.printf(Locale.US, "Valor do bonus: R$ %.2f%n", valorBonus);

        scanner.close();
    }
}
