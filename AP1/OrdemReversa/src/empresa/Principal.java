package empresa;

import java.util.ArrayList; // Importa a classe ArrayList, que permite criar listas dinâmicas
import java.util.Iterator; // Importa a classe Iterator (não utilizado neste código, mas pode ser útil para percorrer coleções)
import java.util.Scanner;  // Importa a classe Scanner, usada para capturar a entrada do usuário

public class Principal { // Define a classe principal do programa

    public static void main(String[] args) { // Método principal, ponto de entrada do programa
        ArrayList<String> nomes = new ArrayList<>(); // Lista dinâmica para armazenar os nomes
        Scanner teclado = new Scanner(System.in);    // Objeto Scanner para capturar a entrada do usuário
        String msg;                                  // Variável para armazenar temporariamente os nomes

        System.out.println("Digite quantos nomes ira inserir:"); // Solicita ao usuário o número de nomes
        int total = teclado.nextInt();                          // Lê o número total de nomes

        System.out.println("Digite os nomes:"); // Solicita ao usuário que insira os nomes
        for (int i = 0; i < total; i++) {       // Loop para capturar os nomes digitados
            msg = teclado.next();               // Lê um nome digitado
            nomes.add(msg);                     // Adiciona o nome à lista
        }

        System.out.println("Ordem normal"); // Exibe os nomes na ordem em que foram inseridos
        for (String nome : nomes) {         // Loop para percorrer e imprimir cada nome
            System.out.println(nome);       // Imprime o nome atual
        }

        System.out.println("Ordem inversa"); // Exibe os nomes na ordem inversa
        for (int i = total - 1; i >= 0; i--) { // Loop para percorrer a lista de trás para frente
            System.out.println(nomes.get(i)); // Imprime o nome na posição 'i'
        }
    }
    
    /* Versão alternativa com o método reverse da classe Collections
    
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(); // Lista dinâmica para armazenar os nomes
        Scanner teclado = new Scanner(System.in);    // Objeto Scanner para capturar a entrada do usuário
        String msg;                                  // Variável para armazenar temporariamente os nomes

        System.out.println("Digite quantos nomes ira inserir:"); // Solicita ao usuário o número de nomes
        int total = teclado.nextInt();                          // Lê o número total de nomes

        System.out.println("Digite os nomes:"); // Solicita ao usuário que insira os nomes
        for (int i = 0; i < total; i++) {       // Loop para capturar os nomes digitados
            msg = teclado.next();               // Lê um nome digitado
            nomes.add(msg);                     // Adiciona o nome à lista
        }

        System.out.println("Ordem normal"); // Exibe os nomes na ordem em que foram inseridos
        System.out.println(nomes);         // Imprime a lista inteira na ordem original

        Collections.reverse(nomes);        // Inverte a ordem dos elementos da lista
        System.out.println(nomes);         // Exibe os nomes na ordem inversa
    }
    */
}


/* 

 */