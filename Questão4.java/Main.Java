package Questão4
// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 1980);
        Moto moto = new Moto("CG 150", 2020);
        BicicletaEletrica bike = new BicicletaEletrica("Caloi E10", 2022);
        
        carro.alugar();
        carro.abastecer();
        
        moto.alugar();
        moto.abastecer();
        
        bike.alugar();
        // bike.abastecer(); // Erro - BicicletaEletrica não implementa Motorizado
    }
}