import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //Metodo Main
        Scanner scan = new Scanner(System.in);

        Jogador Carlos = new Jogador();
        Carlos.setCPF("03024430105");
        Jogador Leo = new Jogador();
        Leo.setCPF("4192984182830");

        System.out.println(Carlos.getCPF());
        System.out.println(Leo.getCPF());

    }
}