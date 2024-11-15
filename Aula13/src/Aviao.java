import Veiculo.*;

public class Aviao extends Veiculo {
    protected int categoria;

    public Aviao(String nome, int categoria){
        super(nome, 10);
        this.categoria = categoria;
    }

    public void info(){
        super.info();
        System.out.printf("Categoria:%d", this.categoria);
        System.out.printf("Nome:%s", super.getNome());
    }
}
