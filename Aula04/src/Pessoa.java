public class Pessoa {
    String nome;
    int idade;

    //Construtor usando "this" para diferenciar variáveis locais e de instância
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void fazerAniversário(){
        this.idade++;
        System.out.printf("%nParabéns %s, Feliz Aniversário", this.nome);
        System.out.printf("%nIdade: %d", this.idade);
    }
}
