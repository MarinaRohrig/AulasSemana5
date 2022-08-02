package aula010822;
/*
Autor: Marina Larissa Carpes Röhrig
Data: 01/08/22
 */
public class Carro {
    // Atributos da classe Carro
    String cor;
    String fabricante;
    String modelo;
    int qtdPortas;
    boolean temEscada;
    String somdaBuzina;
    double velocidade;

    // Métodos da classe Carro
    public void acelerar(){
        velocidade++;
    }
    public void frear(){
        velocidade--;
    }
    public void buzinar(){
        if (this.somdaBuzina == null || this.somdaBuzina.isBlank()) {
            System.out.println("BEE BEE");
        }else{
            System.out.println(this.somdaBuzina);
        }
    }
}
