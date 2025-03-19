import java.util.Scanner;      // importa a classe Scanner

public class App {
    public static void main(String[] args) throws Exception {

        int idade = 10;     // variável inteira
        String nome = "Mario";      // variável string
        idade = idade +2;       // operação de soma
        double peso = 72.5;      // variável double

        Scanner teclado = new Scanner(System.in);      // cria um objeto Scanner
        System.out.println("Digite idade, peso e nome: ");      // imprime uma string antes de receber os valores do teclado
        idade = teclado.nextInt();      // para receber um inteiro do teclado utiliza nextInt
        peso = teclado.nextDouble();   // para receber um double do teclado utiliza nextDouble
        nome = teclado.next();         // para receber uma string do teclado utiliza next   "pois nextstring não existe"


        System.out.println("nome: " + nome);      // imprime uma string + variavel idade
        System.out.printf("idade: %d\n", idade);      // imprime uma string e subistitui %d pela variavel idade
        System.out.printf("peso: %.2f\n", peso);      // imprime uma string e subistitui %f pela variavel peso com 2 casas decimais


        if (idade < 18) {      // se idade for maior ou igual a 18
            System.out.println("Acesso Bloqueado");      // imprime uma string
        }

        else if (idade <65) {      // não existe elif em java, utiliza-se else if
            System.out.println("adulto");      // imprime uma string
        }       

        else {      // se não for nenhuma das condições acima
            System.out.println("adulto idoso");      // imprime uma string
        }       

//      while () {                  while é um laço de repetição
//      }      

      for(int i=0;i<10;i++) {       // for é um laço de repetição que tem 3 partes: inicialização, condição e incremento ou decremento... neste caso ele vai de 0 a 9 incrementando de 1 em 1!
            System.out.println("valor: " + i);              // imprime uma string + variavel i que é o contador do laço
        }       // fim do laço for
    

        //lista

        int megaSena[] = {11,14,21,30,37,56};      // cria um array de inteiros

        megaSena[0] = 10;       // altera o valor do primeiro elemento do array para 10 "obs arrays começam em 0 igual o python"

        int numeros[] = new int[200];    // cria um array de inteiros com 200 posições "obs arrays em java são fixos, não podem ser aumentados ou diminuidos"


        teclado.close(); // fecha o objeto Scanner para evitar vazamento de recursos
    }
}