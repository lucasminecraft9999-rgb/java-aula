package Projetos.Banco2p;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private List<Conta> contas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void ContaAdicionada(Conta adcionandoConta){
        this.contas.add(adcionandoConta);
        System.out.println("Adicionado Com Sucesso");
    }

//   public Conta BuscarConta(String numero) {
//    for (Conta conta : contas){
//        if(conta.getNumeroConta().equals(numero))
//    }
//   }




}
