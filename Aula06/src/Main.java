import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        final int tam = 5;
        char[] gabarito = {'a', 'b', 'c', 'b', 'e'};
        char[] respostas = new char[tam];
        int nota = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < respostas.length; i++){
            System.out.printf("Digite a resposta da pergunta %d: ", i + 1);
            respostas[i] = scan.next().charAt(0); // O charAt serve para aramazenar somente o primeiro termo da string
            if(respostas[i] == gabarito[i]){
                nota += 2;
            }
        }
        System.out.printf("Você tirou a nota: %d", nota);


    }
}