package Questão1e2
// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        Bicicleta minhaBicicleta = new Bicicleta(30);
        
        minhaBicicleta.setMarcha(1);
        minhaBicicleta.acelerar(10);
        minhaBicicleta.imprimirEstados();
        
        minhaBicicleta.setMarcha(2);
        minhaBicicleta.acelerar(25); // Tentará ultrapassar a velocidade máxima
        minhaBicicleta.imprimirEstados();
        
        minhaBicicleta.frear(5);
        minhaBicicleta.imprimirEstados();
    }
}