public class Carro {
    private String modelo;
    private String marca;
    private int ano;

    //Contrutor
    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    //Getter e Setters
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Metodo toString
    @Override
    public String toString(){
        return "Carro [Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + "]";
    }
}
