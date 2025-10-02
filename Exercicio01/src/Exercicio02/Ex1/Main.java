package Exercicio02.Ex1;

<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
        pessoa.ColocarNome();
        pessoa.chamar();
=======
import Exercicio02.herancas.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("cuca");
        pessoa.setIdade(27);
        pessoa.ColocarNome();
        pessoa.apresentar();
>>>>>>> dc24a0f8754d2ec2265e4b28b3f5d3761daef7f9
    }
}
