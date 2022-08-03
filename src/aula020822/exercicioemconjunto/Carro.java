package aula020822.exercicioemconjunto;

public class Carro {
    String cor;
    String modelo;
    Boolean ligado;
    double velocidadeAtual;
    double velocidadeMaxima;

    public void ligar(){
        this.ligado = true;
        System.out.println("Carro ligado");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("Carro desligado");
    }
    public void acelerar(double quantidade){
        if ( quantidade < 3 || quantidade > velocidadeMaxima){
            System.out.println("Acelera��o inv�lida.");
        }
        if (this.velocidadeAtual + quantidade >= this.velocidadeMaxima){
            this.velocidadeAtual = this.velocidadeMaxima;
            System.out.printf("Velocidade atual:%.2f , voc� alcan�ou a velocidade m�xima! %n", this.velocidadeMaxima);
        }else{
            this.velocidadeAtual += quantidade;
            System.out.printf("Voc� acelerou %.2f , a velocidade atual �: %.2f",quantidade, this.velocidadeAtual );
        }

    }

    public void frear (double quantidade){
        if ( quantidade < 0 ){
            System.out.println("Valor inv�lido.");
        }
        if (this.velocidadeAtual - quantidade <= 0){
            this.velocidadeAtual = 0;
            System.out.printf("O carro parou =0 %n", this.velocidadeAtual);
        }else{
            this.velocidadeAtual -= quantidade;
            System.out.printf("Voc� freou %.2f , a velocidade atual �: %.2f",quantidade, this.velocidadeAtual );
        }
    }

}
