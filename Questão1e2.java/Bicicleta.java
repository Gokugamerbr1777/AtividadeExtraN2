// Arquivo: Bicicleta.java (Versão Atividade 2 - Modificada)
public class Bicicleta {
    private int velocidade;
    private int marcha;
    private final int velocidadeMaxima;  // Novo atributo adicionado

    // Construtor modificado - não há mais construtor padrão
    public Bicicleta(int velocidadeMaxima) {
        this.velocidade = 0;
        this.marcha = 0;
        this.velocidadeMaxima = velocidadeMaxima;  // Inicialização do novo atributo
    }

    // Método acelerar modificado para respeitar velocidade máxima
    public void acelerar(int incremento) {
        velocidade = Math.min(velocidade + incremento, velocidadeMaxima);
    }

    // Método frear permanece o mesmo
    public void frear(int decremento) {
        velocidade = Math.max(0, velocidade - decremento);
    }

    // Método imprimirEstados modificado para mostrar velocidade máxima
    public void imprimirEstados() {
        System.out.println("Velocidade: " + velocidade + " km/h, Marcha: " + marcha + ", Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }

    // Getters e Setters (marcha permanece o mesmo)
    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    // Novo getter para velocidadeMaxima
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}