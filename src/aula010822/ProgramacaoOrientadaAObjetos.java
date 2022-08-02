package aula010822;

import outropacote.Bicicleta;

/*
Data: 01/08/22
Autor: Marina Larissa Carpes R�hrig
 */
public class ProgramacaoOrientadaAObjetos {
    public static void main(String[] args) {
        // inst�nciando o objeto carro
        Carro unoDeFirma = new Carro();
        // definindo valores para os atributos do objeto carro
        unoDeFirma.cor = "preto";
        unoDeFirma.fabricante = "Fiat";
        unoDeFirma.modelo = "Uno Mille 1.0 com escada";
        unoDeFirma.temEscada = true;

        System.out.printf("O meu carro � da marca %s, de cor %s e modelo %s.%n", unoDeFirma.fabricante, unoDeFirma.cor, unoDeFirma.modelo);


        // chama o m�todo buzinar da classe carro.
        unoDeFirma.buzinar();
        //Define um som para buzina
        unoDeFirma.somdaBuzina = "Bi biiiiiiiiiiiiiiiiii";
        // chama novamente o m�todo buzinar da classe carro
        unoDeFirma.buzinar();

        // Chama a classe Bicicleta que est� em outropacote , portanto � preciso importar ela
        Bicicleta bike = new Bicicleta();

        // instanciar um novo Carro
        Carro sandero = new Carro();
        sandero.cor = "prata";
        sandero.temEscada = false;
        sandero.qtdPortas = 4;
        sandero.modelo = "Sandero hatch 1.0";
        sandero.fabricante = "Renault";
        sandero.buzinar();
        sandero.acelerar();


        System.out.println("Fim do programa");
    }
}
