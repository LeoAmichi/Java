public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Golf");
        c1.setLigado(true);
        c1.info();

        CarroCombate c2 = new CarroCombate("Mustang", 200);
        c2.info();
        c2.sofrerFano(100);
        c1.sofrerFano(30);

    }
}