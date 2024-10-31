import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Carro modelo = new Carro();

        System.out.print("Digite o nome do carro: ");
        modelo.nome = scan.next();

        System.out.print("Digite a marca do carro: ");
        modelo.marca = scan.next();

        System.out.print("Digite a idade do carro: ");
        modelo.idade = scan.nextInt();

        modelo.MostrarInfo();
    }
}