/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    void ligar() {
        System.out.println("Carro ligado!");
    }

    void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;
        this.velocidadeAtual = novaVelocidade;
    }

    String getCor() {
        return this.cor;
    }

    String getModelo() {
        return this.modelo;
    }
}
