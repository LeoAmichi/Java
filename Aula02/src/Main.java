
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite o valor do segundo numero: ");
        int n2 = scan.nextInt();

        System.out.printf("O resultado da soma: %d", soma2(n1, n2));

        System.out.printf("%n%d", soma(10, 20, 30, 40)); //4 argumentos passados

    }

    public static int soma(int... numeros){ //...numeros é um array de inteiros de tamanho variável dependendo do numero de argumentos passados na chamada da função
        int res = 0;
        for(int n:numeros)
            res += n;
        return res;
    }

    public static int soma2(int n1, int n2){
        return n1 + n2;
    }

    /*public static void msg(String m, int num){
        for(int i = 0; i < num; i++){
            System.out.println(m);
        }
    } */
}