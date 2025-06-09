package Questão3
// Arquivo: Peixe.java
public class Peixe extends Animal implements Aquatico {
    @Override
    public void emitirSom() {
        System.out.println("O peixe faz bolhas: blub blub");
    }

    @Override
    public void alimentar() {
        System.out.println("O peixe está comendo algas.");
    }

    @Override
    public void nadar() {
        System.out.println("O peixe está nadando rapidamente.");
    }
}
