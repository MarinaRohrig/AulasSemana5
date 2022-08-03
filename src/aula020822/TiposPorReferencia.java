package aula020822;
/*
Data: 02/08/22
Autor: Marina Larissa Carpes Röhrig
 */
public class TiposPorReferencia {
    public static void main(String[] args) {
        // Exemplos de tipos primitivos
        int a = 10;
        int b = a;
        b = 20;
        System.out.println("Valor de 'a' é: "+a);
        System.out.println("Valor de 'b' é: "+b);


        // Exemplo de tipo por referência
        Conta c1 = new Conta();
        Conta c2 = c1;
        System.out.println(c1);
        System.out.println(c2);
        c1.depositar(100);
        c2.depositar(50);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        // Instancia duas variáveis de tipo conta por referência com valores iguais.
        // Mas os valores são iguais

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.titular.nome = "Marina";
        conta1.saldo = 50;

        conta2.titular.nome = "Marina";
        conta2.saldo = 50;

        System.out.println(conta1 == conta2);

        System.out.println(conta2.saldo == conta1.saldo);

        conta1.transferePara(conta2,10);

        System.out.printf("O saldo da conta de %s é de R$%.2f.%n",conta1.titular.nome,conta1.getSaldo());
        System.out.printf("O saldo da conta de %s é de R$%.2f.%n",conta2.titular.nome,conta2.getSaldo());

    }
}
