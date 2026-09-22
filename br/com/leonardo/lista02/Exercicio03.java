package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Digite a umidade relativa do ar (%): ");
        double umidade = scanner.nextDouble();

        if (temperatura >= 38) {
            System.out.println("Alerta de calor extremo.");
        }
        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa.");
        }
        if (temperatura >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada.");
        }

        scanner.close();
    }
}
