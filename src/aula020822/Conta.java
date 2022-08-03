package aula020822;

/*
Data: 02/08/22
Autor: Marina Larissa Carpes Röhrig
 */
public class Conta {
    public Cliente titular = new Cliente();
    public double saldo=0;
    public double limite = 50;
    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo = this.saldo - valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso!%n", this.saldo);
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso!%n", this.saldo);
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public void transferePara(Conta conta, double valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
        }
    }
}
