package Questão3
// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao();
        Peixe peixe = new Peixe();
        
        leao.emitirSom();
        leao.alimentar();
        
        peixe.emitirSom();
        peixe.alimentar();
        peixe.nadar();
    }
}