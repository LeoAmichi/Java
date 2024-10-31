import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Um objeto chamado scan do tipo Scanner é instanciado a partir da classe Scanner, utilizando a entrada padrão System.in para capturar dados do teclado"

        //int x = 11; Uma variável do tipo inteiro que recebe 10*
        float n1 = 0;
        float n2 = 0;
        final float MEDIA = 6;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = scan.next();

        System.out.print("Digite o primeiro número: ");
        n1 = scan.nextFloat();

        System.out.print("Digite o segundo numero: ");
        n2 = scan.nextFloat();

        float media = (n1 + n2) / 2;

        if(media > MEDIA)
            System.out.printf("Parabens %s, você foi aprovado com a media: %f", nome, media);
        else
            System.out.printf("%s, você foi reprovado com a media: %f", nome, media);
    }
}