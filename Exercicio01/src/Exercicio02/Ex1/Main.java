package Exercicio02.Ex1;

import Exercicio02.herancas.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("cuca");
        pessoa.setIdade(27);
        pessoa.ColocarNome();
        pessoa.apresentar();
    }
}
