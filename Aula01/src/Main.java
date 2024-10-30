import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Um objeto chamado scan do tipo Scanner é instanciado a partir da classe Scanner, utilizando a entrada padrão System.in para capturar dados do teclado"

        int x = 11; //Uma variável do tipo inteiro que recebe 10*
        int n1 = 0;
        int n2 = 0;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = scan.next();

        System.out.print("Digite o primeiro número: ");
        n1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = scan.nextInt();

        System.out.printf("%s, Olá, a soma entre os numeros digitados: %d", nome, n1 + n2);

    }
}