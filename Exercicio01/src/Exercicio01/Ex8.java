package Exercicio01;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobre Nome: ");
        String SobreNome = scanner.nextLine();

        String NomeCompleto = nome + " " + SobreNome;

        System.out.println("seu nome completo é : " + NomeCompleto);
    }
}
