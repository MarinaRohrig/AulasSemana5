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
            System.out.println("Aceleração inválida.");
        }
        if (this.velocidadeAtual + quantidade >= this.velocidadeMaxima){
            this.velocidadeAtual = this.velocidadeMaxima;
            System.out.printf("Velocidade atual:%.2f , você alcançou a velocidade máxima! %n", this.velocidadeMaxima);
        }else{
            this.velocidadeAtual += quantidade;
            System.out.printf("Você acelerou %.2f , a velocidade atual é: %.2f",quantidade, this.velocidadeAtual );
        }

    }

    public void frear (double quantidade){
        if ( quantidade < 0 ){
            System.out.println("Valor inválido.");
        }
        if (this.velocidadeAtual - quantidade <= 0){
            this.velocidadeAtual = 0;
            System.out.printf("O carro parou =0 %n", this.velocidadeAtual);
        }else{
            this.velocidadeAtual -= quantidade;
            System.out.printf("Você freou %.2f , a velocidade atual é: %.2f",quantidade, this.velocidadeAtual );
        }
    }

}
