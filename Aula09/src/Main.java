import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //Metodo Main
        Scanner scan = new Scanner(System.in);

        Jogador jogador1 = new Jogador();
        jogador1.nome = scan.next();
        jogador1.idade = scan.nextInt();

        System.out.println(jogador1.nome);
        System.out.println(jogador1.idade);

    }
}