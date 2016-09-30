/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaArraysObjetos {
    public static void main(String[] args) {
        Carro[] carros = new Carro[5];

        Carro carro1 = new Carro();
        carro1.cor = "Verde";
        carro1.modelo = "HB20";
        carro1.velocidadeMaxima = 120;

        Carro carro2 = new Carro();
        carro2.cor = "Branco";
        carro2.modelo = "BWM";
        carro2.velocidadeMaxima = 320;

        carros[0] = carro1;
        carros[1] = carro2;

        carros[0].cor = "Preto";

        System.out.println("Carro1: " + carros[0].cor);
        System.out.println("Carro2: " + carros[1].cor);

        for (Carro carro : carros) {
            System.out.println("Carro: " + carro.modelo);
        }
    }
}
