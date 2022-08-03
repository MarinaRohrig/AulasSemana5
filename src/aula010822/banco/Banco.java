package aula010822.banco;

import aula020822.Conta;

import java.util.Scanner;

/*
Data: 01/08/22
Autor: Marina Larissa Carpes Röhrig
 */
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta minhaConta = new Conta();
        int escolha;

        System.out.println("**** Bem-Vindo ao Banco! ****");
        System.out.println("Digite seu nome");
        minhaConta.titular.nome = scanner.nextLine();
        System.out.println("Como no exemplo: R$2900.50");
        System.out.println(minhaConta.titular.nome+" digite seu saldo");
        minhaConta.saldo = Double.parseDouble(scanner.nextLine());
        do {
            System.out.println("");
            System.out.println("Digite o número referente a função que deseja executar");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Mostrar saldo");
            System.out.println("4 - Sair");
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1: {
                    System.out.println("Digite o valor a ser sacado. Como no exemplo 10.60 ");
                    minhaConta.sacar(Double.parseDouble(scanner.nextLine()));
                    break;
                }
                case 2: {
                    System.out.println("Digite o valor a ser depositado. Como no exemplo 10.60 ");
                    minhaConta.depositar(Double.parseDouble(scanner.nextLine()));
                    break;
                }
                case 3: {
                    System.out.printf("O cliente %s possuí saldo de R$%.2f %n", minhaConta.titular.nome, minhaConta.saldo);
                    break;
                }
                case 4: {
                    System.out.println("**** Fim do Programa! ****");
                    break;
                }
            }
        } while (escolha != 4);

        scanner.close();
    }
}
