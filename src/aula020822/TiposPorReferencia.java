package aula020822;
/*
Data: 02/08/22
Autor: Marina Larissa Carpes R�hrig
 */
public class TiposPorReferencia {
    public static void main(String[] args) {
        // Exemplos de tipos primitivos
        int a = 10;
        int b = a;
        b = 20;
        System.out.println("Valor de 'a' �: "+a);
        System.out.println("Valor de 'b' �: "+b);


        // Exemplo de tipo por refer�ncia
        Conta c1 = new Conta();
        Conta c2 = c1;
        System.out.println(c1);
        System.out.println(c2);
        c1.depositar(100);
        c2.depositar(50);
        System.out.println(c1.getSaldo());\
        System.out.println(c2.getSaldo());



    }
}
