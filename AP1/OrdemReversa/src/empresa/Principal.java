package empresa;

import java.util.ArrayList; // Importa a classe ArrayList, que permite criar listas dinâmicas
import java.util.Iterator; // Importa a classe Iterator (não utilizado neste código, mas pode ser útil para percorrer coleções)
import java.util.Scanner;  // Importa a classe Scanner, usada para capturar a entrada do usuário

public class Principal { // Define a classe principal do programa

    public static void main(String[] args) { // Método principal, ponto de entrada do programa
        // Cria uma lista dinâmica para armazenar os nomes digitados pelo usuário
        ArrayList<String> nomes = new ArrayList<>();
        
        // Cria um objeto Scanner para capturar a entrada do usuário pelo teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declara uma variável do tipo String para armazenar temporariamente os nomes digitados
        String msg;
        
        // Solicita ao usuário que informe quantos nomes deseja inserir
        System.out.println("Digite quantos nomes ira inserir:");
        
        // Lê o número total de nomes que o usuário deseja inserir e armazena na variável 'total'
        int total = teclado.nextInt();
        
        // Solicita ao usuário que insira os nomes
        System.out.println("Digite os nomes:");
        
        // Loop para capturar os nomes digitados pelo usuário
        // O loop começa em 0, executa enquanto 'i' for menor que 'total', e incrementa 'i' a cada iteração
        for (int i = 0; i < total; i++) {
            // Lê um nome digitado pelo usuário e armazena na variável 'msg'
            msg = teclado.next();
            
            // Adiciona o nome armazenado em 'msg' à lista 'nomes'
            nomes.add(msg);
        }
        
        // Exibe os nomes na ordem em que foram inseridos
        System.out.println("Ordem normal");
        
        // Loop para percorrer a lista 'nomes' e imprimir cada elemento
        // Para cada elemento da lista 'nomes', ele é armazenado na variável 'nome' e impresso
        for (String nome : nomes) {
            System.out.println(nome); // Imprime o nome atual
        }
        
        // Exibe os nomes na ordem inversa à que foram inseridos
        System.out.println("Ordem inversa");
        
        // Loop para percorrer a lista 'nomes' de trás para frente
        // O loop começa no último índice (total - 1), executa enquanto 'i' for maior ou igual a 0, e decrementa 'i' a cada iteração
        for (int i = total - 1; i >= 0; i--) {
            // Imprime o nome na posição 'i' da lista
            System.out.println(nomes.get(i));
        }
    }
    
    /* Versão alternativa com o método reverse da classe Collections
    
    public static void main(String[] args) {
        // Cria uma lista dinâmica para armazenar os nomes digitados pelo usuário
        ArrayList<String> nomes = new ArrayList<>();
        
        // Cria um objeto Scanner para capturar a entrada do usuário pelo teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declara uma variável do tipo String para armazenar temporariamente os nomes digitados
        String msg;
        
        // Solicita ao usuário que informe quantos nomes deseja inserir
        System.out.println("Digite quantos nomes ira inserir:");
        
        // Lê o número total de nomes que o usuário deseja inserir e armazena na variável 'total'
        int total = teclado.nextInt();
        
        // Solicita ao usuário que insira os nomes
        System.out.println("Digite os nomes:");
        
        // Loop para capturar os nomes digitados pelo usuário
        for (int i = 0; i < total; i++) {
            // Lê um nome digitado pelo usuário e armazena na variável 'msg'
            msg = teclado.next();
            
            // Adiciona o nome armazenado em 'msg' à lista 'nomes'
            nomes.add(msg);
        }
        
        // Exibe os nomes na ordem em que foram inseridos
        System.out.println("Ordem normal");
        System.out.println(nomes); // Imprime a lista inteira na ordem original
        
        // Inverte a ordem dos elementos da lista
        Collections.reverse(nomes); // Método que inverte a ordem dos elementos da lista
        
        // Exibe os nomes na ordem inversa
        System.out.println(nomes); // Imprime a lista inteira na ordem inversa
    }
    */
}
