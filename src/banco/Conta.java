package banco;
/*
Data: 01/08/22
Autor: Marina Larissa Carpes Röhrig
 */
public class Conta {
    String nomeTitular;
    double saldo;

    public void sacar(double valor){
        this.saldo = this.saldo - valor;
        System.out.printf("Saque de R$%.2f realizado com sucesso!%n",this.saldo);
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso!%n",this.saldo);
    }

    public double getSaldo(){
        return this.saldo;
    }

}
