package Exercicio01;
import java.util.ArrayList;
public class Ex9 {
    public static void main(String[] args) {


        // Cria um ArrayList que só pode armazenar objetos do tipo String.
        // O tipo entre < > é chamado de "Generics".
        ArrayList<String> frutas = new ArrayList<>();

        // 1. Adicionar elementos (add)
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        System.out.println("Lista inicial: " + frutas); // Saída: [Maçã, Banana, Laranja]

        // 2. Obter um elemento (get)
        String frutaDoMeio = frutas.get(1); // Índices começam em 0
        System.out.println("Fruta na posição 1: " + frutaDoMeio); // Saída: Banana

        // 3. Adicionar em uma posição específica (o elemento na posição 1 e os seguintes são deslocados)
        frutas.add(1, "Morango");

        System.out.println("Lista após adicionar Morango: " + frutas); // Saída: [Maçã, Morango, Banana, Laranja]

        // 4. Remover um elemento (remove)
        frutas.remove(0); // Remove "Maçã"

        System.out.println("Lista após remover Maçã: " + frutas); // Saída: [Morango, Banana, Laranja]

        // 5. Saber o tamanho (size)
        int tamanho = frutas.size();
        System.out.println("Tamanho da lista: " + tamanho); // Saída: 3
    }
}
