
import java.util.Scanner;                                                   //importando a classe Scanner

public class App {                                                          //criando a classe App
    public static void main(String[] args) throws Exception {               //criando o método main

        try (Scanner teclado = new Scanner(System.in)) {                    //criando um objeto Scanner chamado teclado

            System.out.println("digite Peso e Altura: ");                 //imprimindo a mensagem para orientação do usuário
            double peso = teclado.nextDouble();                             //criando a variável peso e atribuindo o valor digitado pelo usuário
            double altura = teclado.nextDouble();                           //criando a variável altura e atribuindo o valor digitado pelo usuário

            double imc = peso / (altura * altura);                          //criando a variável imc e atribuindo o valor do cálculo do IMC
            System.out.printf("IMC: %.2f", + imc);                              //imprimindo o valor do IMC
        }
    }
}




