package Questão4
// Arquivo: BicicletaEletrica.java
public class BicicletaEletrica extends Veiculo {
    public BicicletaEletrica(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void alugar() {
        System.out.println("Bicicleta Elétrica " + modelo + " (" + ano + ") alugada com sucesso!");
    }
}
