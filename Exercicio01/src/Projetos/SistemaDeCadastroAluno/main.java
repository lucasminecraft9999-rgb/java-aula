package Projetos.SistemaDeCadastroAluno;

import Exercicio02.herancas.Aluno1;
import jdk.jfr.Timespan;

import java.io.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        String opcao;

        do {
            System.out.println("Bem vindo ao sistema de cadastro de alunos");
            System.out.println("Digite do 0 ao 4 para o menu principal");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Salvar alunos em arquivo");
            System.out.println("4 - Ler alunos do arquivo");
            System.out.println("0 - sair");
            opcao = scanner.nextLine();


            switch (opcao) {

                case "1": {
                    Aluno adicionandoAluno = new Aluno();

                    System.out.println("-------Cadastramento-------");
                    System.out.println("Digite seu nome:");
                    adicionandoAluno.setNome(scanner.nextLine());
                    System.out.println("Digite sua matricula:");
                    adicionandoAluno.setMatricula(scanner.nextLine());
                    System.out.println("Digite seu curso:");
                    adicionandoAluno.setCurso(scanner.nextLine());
                    listaAlunos.add(adicionandoAluno);
                    break;
                }
                case "2": {
                    if (listaAlunos.isEmpty()) { // verificando se a lista esta vazia ou nao
                        System.out.println("Lista vazia");
                    } else {
                        for (Aluno aluno : listaAlunos) {
                            System.out.println(aluno.getNome());
                            System.out.println(aluno.getCurso());
                            System.out.println(aluno.getMatricula());
                        }
                    }
                    break;
                }

                case "3": {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("alunos.txt"))) {
                        System.out.println("Salvando alunos em arquivo");

                        for (Aluno aluno : listaAlunos) {
                            String linha = aluno.getNome() + "|" + aluno.getCurso() + "|" + aluno.getMatricula() + "\n";
                            writer.write(linha);
                        }

                        System.out.println("Alunos salvos com sucesso");
                    } catch (IOException e) {
                        System.out.println("Erro ao salvar alunos em arquivo");
                    }
                    break;
                }

                case "4": {

                    try (BufferedReader reader = new BufferedReader(new FileReader("alunos.txt"))) {

                        String linha;

                        while ((linha = reader.readLine()) != null) {
                            System.out.println(linha);
                        }


                    } catch (FileNotFoundException e) {
                        System.out.println("Arquivo nao encontrado");
                    } catch (IOException e) {
                        System.out.println("Erro ao ler alunos do arquivo");
                    }

                    break;
                }

            }
        }
        while(!opcao.equals("0"));
        try {
            System.out.println("Saindo do sistema");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println(".");
            scanner.close();
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
