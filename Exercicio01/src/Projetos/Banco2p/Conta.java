package Projetos.Banco2p;



import java.util.Scanner;



public class Conta {

    public double sacar;

    public double depositar;

    private double saldo;

    Scanner scanner = new Scanner(System.in);



    public Conta(double saldo) {

        this.saldo = saldo;

    }



    public double getSaldo() {

        return saldo;

    }



    public void setSaldo() {

        if(saldo > 0){

            System.out.println("seu saldo é: " + saldo + "R$");

        }

        else {

            System.out.println("Sua conta esta negativa! \n Deposite dinheiro na conta!");

        }

    }



    public void Sacar() {

        System.out.println("voce deseja sacar quanto: ");

        sacar = scanner.nextDouble();



        if(saldo >= sacar){

            saldo -= sacar;

            System.out.println("Saque realizado com sucesso");

        }

        else {

            System.out.println("Saldo Indisponivel");

        }

    }



    public void Depositar(){

        System.out.println("voce deseja depositar quanto: ");

        depositar = scanner.nextDouble();

        saldo += depositar;

    }







}