package aula020822.exercicioemconjunto;

public class Main {
    public static void main(String[] args) {
        Carro fuscaAzul = new Carro ();
        fuscaAzul.cor = "Azul";
        fuscaAzul.modelo = "Fusca";
        fuscaAzul.velocidadeAtual = 0;
        fuscaAzul.velocidadeMaxima = 900;

        fuscaAzul.ligar();

        System.out.println(fuscaAzul.cor);
        System.out.println(fuscaAzul.modelo);
        System.out.println(fuscaAzul.velocidadeAtual);
        System.out.println(fuscaAzul.velocidadeMaxima);

        fuscaAzul.acelerar(901);
    }
}
