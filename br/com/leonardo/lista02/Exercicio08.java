package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade maxima da via: ");
        double velocidadeLimite = scanner.nextDouble();

        System.out.print("Digite a velocidade do veiculo: ");
        double velocidadeVeiculo = scanner.nextDouble();

        double percentualExcesso = ((velocidadeVeiculo - velocidadeLimite) / velocidadeLimite) * 100;

        if (velocidadeVeiculo <= velocidadeLimite) {
            System.out.println("Dentro do limite. Nao ha multa.");
        } else if (percentualExcesso <= 20) {
            System.out.println("Infracao media.");
        } else if (percentualExcesso <= 50) {
            System.out.println("Infracao grave.");
        } else {
            System.out.println("Infracao gravissima.");
        }

        scanner.close();
    }
}
