package Exercicio01;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu salario: ");
        double salarioBruto = scanner.nextDouble();

        System.out.println("Seu salario é: " + salarioBruto);

           double desconto = salarioBruto * 0.10;
         salarioBruto = salarioBruto - desconto;

        System.out.println("Desconto do seu salario é: " + salarioBruto);

    }
}
