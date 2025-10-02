package Exercicio01;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double total = (nota1 + nota2 + nota3) / 3 ;

        System.out.println("media sua nota é: " + total);

        boolean ultrapassado = total > 10;

        if (total > 7 && total <= 10){
            System.out.println("Aprovado");
        }
        else if (total > 5 && total <= 7) {
            System.out.println("Recuperaçao");
        }

        else {
            System.out.println("Reprovado");
        }

        if(ultrapassado){
            System.out.println("Voce ultrapassou o limite de notas");
        }




    }
}
