import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando o Scanner para entrada do usuário
        Scanner scan = new Scanner(System.in);

        // Criando um ArrayList para armazenar objetos Cachorro dinamicamente
        ArrayList<Cachorro> listaDeCachorros = new ArrayList<>();

        String nome, raca;
        int idade;
        char verificador;

        // Loop para adicionar cachorros dinamicamente
        while (true) {
            // Solicitando as informações do cachorro
            System.out.println("Digite o nome do cachorro: ");
            nome = scan.next();

            System.out.println("Digite a raça do cachorro: ");
            raca = scan.next();

            System.out.println("Digite a idade do cachorro: ");
            idade = scan.nextInt();

            // Adicionando o cachorro à lista de cachorros
            listaDeCachorros.add(new Cachorro(nome, raca, idade));

            // Verificando se o usuário quer continuar adicionando mais cachorros
            System.out.println("Deseja continuar adicionando? S/N");
            verificador = scan.next().charAt(0);

            if (verificador == 'N' || verificador == 'n') {
                break;  // Sai do loop se o usuário escolher 'N'
            }
        }

        // Exibindo todos os cachorros da lista
        System.out.println("\nLista de Cachorros adicionados:");
        for (Cachorro dog : listaDeCachorros) {
            System.out.println("Informações do Animal:");
            System.out.println("Nome: " + dog.getName());
            System.out.println("Raça: " + dog.getRaca());
            System.out.println("Idade: " + dog.getIdade() + " anos\n");
        }

        // Fechando o scanner
        scan.close();
    }
}
