public class Main {
    public static void main(String[] args) {
        System.out.print(soma(10, 20, 30));
        System.out.print("\n" + soma(10.5, 20.6, 30.9));
    }

    public static int soma(int... n){
        int res = 0;
        for(int numeros: n){
            res += numeros;
        }
        return res;
    }

    public static Double soma(double... n){ //Sobrecarga
        double res = 0;
        for(double numeros: n){
            res += numeros;
        }
        return res;
    }
}