package aula020822;
/*
Data: 02/08/22
Autor: Marina Larissa Carpes Röhrig
 */
public class Conta {
    String nomeTitular;
    double saldo;
    double limite;

    public void sacar(double valor){
        if(this.getSaldo()>= valor) {
            this.saldo = this.saldo - valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso!%n", this.saldo);
        }else {
            System.out.printf("Saque de R$.2f"+ valor +" não realizado. Saldo insuficiente.");
        }
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso!%n",this.saldo);
    }

    public double getSaldo(){
        return this.saldo + this.limite;
    }


}
