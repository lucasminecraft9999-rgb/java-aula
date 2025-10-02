package Exercicio02.herancas;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    Scanner scanner = new Scanner(System.in);
    public Endereco endereco;
    public Aluno1 aluno1;
    public Professor professor;
    public Pessoa() {
        this.endereco = new Endereco();
        this.aluno1 = new Aluno1();
        this.professor = new Professor();
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void ColocarNome() {
        System.out.println("Digite sua rua: ");
        endereco.rua = scanner.nextLine();
        System.out.println("DIgite seu endereço");
        endereco.endereco = scanner.nextLine();
        System.out.println("Digite sua matricula: ");
        aluno1.matricula = scanner.nextLine();
        System.out.println("Digite nome do professor: ");
        professor.disciplina = scanner.nextLine();
    }


  public void apresentar(){
      System.out.println("Olá, meu nome é " + getNome() + " e tenho " + getIdade() +  " anos.\n");
      System.out.println();
      System.out.println("minha rua é: " + endereco.rua + "meu endereço é" + endereco.endereco);
      System.out.println();
      System.out.println("minha matricula é: " + aluno1.matricula + "\n");
    }





}
