package br.com.leonardoaraujosenai.lista02;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo de veiculo (1-Carro, 2-Moto): ");
        int tipoVeiculo = scanner.nextInt();

        double tarifaPorHora;

        switch (tipoVeiculo) {
            case 1 -> tarifaPorHora = 8.00;
            case 2 -> tarifaPorHora = 5.00;
            default -> tarifaPorHora = -1;
        }

        if (tarifaPorHora == -1) {
            System.out.println("Opcao invalida.");
        } else {
            System.out.print("Digite a quantidade de horas: ");
            double horas = scanner.nextDouble();

            double valor = tarifaPorHora * horas;

            scanner.nextLine();
            System.out.print("Possui cupom de desconto? (sim/nao): ");
            String temCupom = scanner.nextLine();

            if (temCupom.equalsIgnoreCase("sim")) {
                if (valor >= 50.00) {
                    valor = valor - (valor * 0.20);
                    System.out.println("Cupom aplicado: 20% de desconto.");
                } else {
                    System.out.println("Cupom valido apenas para compras acima de R$ 50,00.");
                }
            }

            if (horas > 12) {
                System.out.println("Aviso: permanencia longa.");
            }
            if (horas > 24) {
                System.out.println("Aviso: sera cobrada diaria.");
            }

            if (horas <= 2) {
                System.out.println("Permanencia: curta.");
            } else if (horas <= 6) {
                System.out.println("Permanencia: media.");
            } else {
                System.out.println("Permanencia: longa.");
            }

            System.out.printf(Locale.US, "Valor final: R$ %.2f%n", valor);
        }

        scanner.close();
    }
}
