package Questão3
// Arquivo: Leao.java
public class Leao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O leão ruge: Grrrrr!");
    }

    @Override
    public void alimentar() {
        System.out.println("O leão está comendo carne.");
    }
}