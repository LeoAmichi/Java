public class Main {
    public static void main(String[] args) {

        //Similiar ao DEFINE em C, definindo uma constante
        final int tam = 5;

        //Criar um Array em Java, Java já inicializa as variáveis inteiras com 0
        int[] num = new int[tam];

        //Outra forma de inicializar um array
        int[] numeros = {3, 4, 5, 6, 7};

        //Retorna o tamanho do array .length
        System.out.print(num.length);

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            System.out.printf("\n%d", num[i]);
        }
    }
}