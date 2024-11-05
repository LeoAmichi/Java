public class Jogador {
    private String nome;
    private int idade;
    private int indice;
    private String CPF;

    public String setNome(String nome)
    {
        return this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public String setCPF(String CPF)
    {
        return this.CPF = CPF;
    }

    public String getCPF()
    {
        return CPF;
    }
}
