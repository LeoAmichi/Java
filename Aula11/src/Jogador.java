public class Jogador {
    private String nome;
    private int idade = 0;
    private int vidas = 0;
    static boolean alerta = false; //Uma variável STATIC não é necessário instanciar um objeto para usar um atributo ou metodo
    static int qtdJogadores = 0;

    public Jogador(String nome, int idade, int vidas){
        this.nome = nome;
        this.idade = idade;
        this.vidas = vidas;
    }

    public void info(){
        System.out.printf("Vidas: %d", this.vidas);
        System.out.printf("Alerta: %s", this.vidas);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }
}
