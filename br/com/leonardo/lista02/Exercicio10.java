package br.com.leonardoaraujosenai.lista02;

import java.util.Scanner;
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuario: ");
        String usuario = scanner.nextLine();

        if (!usuario.equals("admin")) {
            System.out.println("Usuario nao encontrado.");
        } else {
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        scanner.close();
    }
}
