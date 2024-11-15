public class Animal {
    private String nome;
    private String raca;
    private int idade;
    public boolean estaComendo;

    public Animal(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.estaComendo = false;
    }

    public String getName(){
        return nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }

    public String getRaca(){
        return raca;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public boolean eat(){
        return estaComendo = true;
    }

    public void mostrar() {

    }
}
