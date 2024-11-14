import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Cria uma lista ed objetos do tipo Carro
        List<Carro> listaCarros = new ArrayList<>();

        //Adiciona objetos do tipo carro à lista
        listaCarros.add(new Carro("Civic", "Honda", 2020));
        listaCarros.add(new Carro("Mobi", "Fiat", 2021));
        listaCarros.add(new Carro("Mustang", "Ford", 2024));

        System.out.println("Lista de Carros");
        for(Carro carro: listaCarros){
            System.out.println(carro);
        }

        //Pega o primeiro carro da lista e armazena em uma variável do tipo Carro
        Carro primeiroCarro = listaCarros.getFirst();
        System.out.println("Primeiro carro da Lista: " + primeiroCarro);

        //Modifica o modelo do primeiro carro
        primeiroCarro.setModelo("Lambo");
        System.out.println("Primeiro Carro alterado da lista: " + listaCarros.getFirst());

        //Remove o segundo carro da Lista
        listaCarros.remove(1);

        for(Carro carros: listaCarros){
            System.out.println(carros);
        }


    }
}