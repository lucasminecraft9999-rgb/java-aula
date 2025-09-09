package Exercicio02.Ex1;

import java.util.Scanner;

public class Pessoa {
    public String nome;
    public int idade;
    Scanner scanner = new Scanner(System.in);

public void ColocarNome() {
    System.out.println("Digite seu nome: ");
    nome = scanner.nextLine();

    System.out.println("Digite sua idade");
    idade = scanner.nextInt();

}

  public void chamar(){
      System.out.println("Olá, meu nome é " + nome + " e tenho " + idade +  " anos.\n");
  }


}
