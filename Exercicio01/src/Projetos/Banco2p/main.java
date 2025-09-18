package Projetos.Banco2p;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Conta conta = new Conta(0.0);
        Scanner scanner = new Scanner(System.in);
        String opcaoConta;

        do {
        System.out.println(" 1 - saldo");
        System.out.println(" 2 - depositar");
        System.out.println(" 3 - sacar");
        System.out.println(" 4 - Exit");
        System.out.print("escolha as opçoe: ");
        opcaoConta = scanner.nextLine();


            switch (opcaoConta) {
                case "1": {
                    conta.setSaldo();

                    break;
                }
                case "2": {
                    conta.Depositar();
                    break;
                }
                case "3": {
                    conta.Sacar();
                    break;
                }
            }
        }
        while (!opcaoConta.equals("4"));

            System.out.println("Bye (: ");
            scanner.close();


    }
}
