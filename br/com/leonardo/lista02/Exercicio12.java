package br.com.leonardoaraujosenai.lista02;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o limite diario de saque: ");
        double limiteDiario = scanner.nextDouble();

        System.out.print("Digite o valor solicitado: ");
        double valorSolicitado = scanner.nextDouble();

        if (saldo < valorSolicitado) {
            System.out.println("Saldo insuficiente.");
        } else {
            if (valorSolicitado > limiteDiario) {
                System.out.println("Valor ultrapassa o limite diario de saque.");
            } else {
                double novoSaldo = saldo - valorSolicitado;
                System.out.println("Saque efetuado com sucesso.");
                System.out.printf(Locale.US, "Novo saldo: R$ %.2f%n", novoSaldo);
            }
        }

        scanner.close();
    }
}
