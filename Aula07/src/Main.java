import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int tam = 10;
        int[] num = {9, 2, 7, 1, 8, 4, 3, 10, 5, 6};
        int[] numeros = new int[10];
        int p = 3;
        int pos = 0;

        Arrays.sort(num); //Ordena automaticamente o array de Inteiros

        //Arrays.fill(numeros, 10); Preenche todo array com um numero definido

        //System.arraycopy(num, 0, numeros, 0, tam); //Copia o conteudo de um array para outro, elemento por elemento

        //Arrays.equals(num, numeros); //Retorna um valor boolean (true or false) se os arrays forem iguais

        //System.out.printf("Os arrays são iguais: %s\n", Arrays.equals(num, numeros) ? "Sim" : "Não"); // Operador Ternário ? :

        pos = Arrays.binarySearch(num, p); //Antes de fazer o BinarySearch o array deve estar ordenado
        System.out.printf("O elemento %d está no array?: %s, na posição: %d\n", p, pos > 0 ? "Sim" : "Não", pos);

        for(int n : num){ //For simplificado para a utilização de vetores onde cada elemento do vetor num é armazenado no vetor n
            System.out.println(n);
        }
    }
}