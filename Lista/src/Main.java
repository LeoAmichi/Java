import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criar uma lista de inteiro
        List<Integer> numeros = new ArrayList<>();

        //Adiciona elementos nas listas
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(1, 25);

        //Exibe o conteúdo da lista
        System.out.println("Lista de números: " + numeros);

        //Obtém um elemento pelo índice
        int numero = numeros.get(2);
        System.out.println("Lista de números: " + numero);

        //Remove um elemento pelo índice
        numeros.remove(1);

        //Verifica o tamanho da lista
        System.out.println("Tamanho da lista: " + numeros.size());

        //Verifica se a lista contém um elemento
        if(numeros.contains(25))
            System.out.println("Sim a lista contém o número 25");
    }
}