import Veiculo.Veiculo;

public class Main {
    public static void main(String[] args) {
        Aviao v1 = new Aviao("Voador", 1);
        Veiculo v2 = new Veiculo("Leo", 2);
        v2.tipo = 2;
        v1.categoria = 2;

        v1.info();

    }
}