package Questão4
// Arquivo: Moto.java
public class Moto extends Veiculo implements Motorizado {
    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void alugar() {
        System.out.println("Moto " + modelo + " (" + ano + ") alugada com sucesso!");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo a moto " + modelo + " com gasolina.");
    }
}
