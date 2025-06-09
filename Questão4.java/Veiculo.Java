package Questão4
// Arquivo: Veiculo.java
public abstract class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void alugar();
}