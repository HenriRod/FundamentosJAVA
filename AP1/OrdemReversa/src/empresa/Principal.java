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
Entender a lógica por trás do código envolve conhecer não apenas o que cada parte faz, mas também **como e por que funciona daquela maneira**. Vamos explorar cada linha com uma abordagem mais lógica e detalhada:

---

### `package empresa;`
- **Lógica:** Define o pacote onde o código está contido. Pacotes ajudam na organização de classes e na modularidade do programa. Isso é especialmente útil em projetos maiores.

---

### `import java.util.ArrayList;`
- **Lógica:** A classe `ArrayList` permite criar listas dinâmicas. Essa classe substitui arrays tradicionais quando o número de elementos pode variar.  
- Você está, na verdade, dizendo: "Quero usar ferramentas que me permitam manipular coleções de dados facilmente."

---

### `import java.util.Iterator;`
- **Lógica:** Embora não seja usado diretamente neste programa, o `Iterator` é uma interface que facilita percorrer coleções como listas ou conjuntos. Pode ser útil futuramente.

---

### `import java.util.Scanner;`
- **Lógica:** `Scanner` captura a entrada do usuário. Ele serve como ponte para interagir com o programa, permitindo que você leia informações inseridas diretamente pelo teclado.

---

### `public class Principal {`
- **Lógica:** Declara a classe principal do programa. `Principal` é apenas um nome, mas a classe serve como a estrutura base onde todo o código será executado.

---

### `public static void main(String[] args) {`
- **Lógica:** Este é o ponto de entrada da aplicação. Sem o método `main`, o programa não seria executado. **"static"** significa que este método pode ser executado sem criar um objeto da classe.

---

### `ArrayList<String> nomes = new ArrayList<>();`
- **Lógica:** Aqui, você cria uma lista dinâmica chamada `nomes`, que armazenará strings. A lógica é: você está declarando uma estrutura para guardar dados de maneira flexível.

---

### `Scanner teclado = new Scanner(System.in);`
- **Lógica:** Inicializa o objeto `Scanner`, permitindo capturar dados digitados pelo usuário. Você está criando o mecanismo para comunicação entre o programa e o mundo externo.

---

### `String msg;`
- **Lógica:** Declara a variável `msg`, que será usada para armazenar temporariamente os nomes inseridos. Isso é como criar um "balde" para carregar dados antes de colocá-los na lista.

---

### `int total = teclado.nextInt();`
- **Lógica:** Captura um número inteiro digitado pelo usuário e o armazena em `total`. Esse valor determina quantos nomes serão inseridos. 
- A lógica é simples: "Leia o dado do teclado e guarde como referência."

---

### `System.out.println("Digite os nomes:");`
- **Lógica:** Exibe uma mensagem ao usuário, orientando-o a fornecer nomes. Isso é parte da interatividade do programa.

---

### `for (int i = 0; i < total; i++) {`
- **Lógica:** Cria um loop que será executado um número de vezes igual a `total`. A lógica por trás do `for` é percorrer uma sequência de valores (de 0 até `total - 1`).

---

### `msg = teclado.next();`
- **Lógica:** Captura o próximo nome digitado pelo usuário e o armazena em `msg`. Aqui acontece a atribuição: você está dizendo "pegue este dado e guarde na variável".

---

### `nomes.add(msg);`
- **Lógica:** Adiciona o conteúdo de `msg` à lista `nomes`. Isso é como colocar o dado coletado (nome) dentro de uma coleção maior.

---

### `System.out.println("Ordem normal");`
- **Lógica:** Exibe uma mensagem indicando que os nomes serão mostrados na ordem em que foram inseridos. Ajuda a organizar a saída para o usuário.

---

### `for (String nome : nomes) {`
- **Lógica:** Um loop baseado em "for-each" que percorre cada nome na lista `nomes`. A lógica é: "Percorrer a coleção e acessar cada elemento diretamente."

---

### `System.out.println(nome);`
- **Lógica:** Exibe o nome atual na lista. Isso imprime na tela o conteúdo de cada elemento.

---

### `System.out.println("Ordem inversa");`
- **Lógica:** Exibe uma mensagem indicando que os nomes serão mostrados na ordem inversa.

---

### `for (int i = total - 1; i >= 0; i--) {`
- **Lógica:** Um loop que começa no último elemento da lista (`total - 1`) e vai até o primeiro (`0`). Essa lógica é usada para percorrer a lista "de trás para frente."

---

### `System.out.println(nomes.get(i));`
- **Lógica:** Obtém o nome na posição `i` da lista e o exibe. A lógica por trás disso é acessar cada elemento diretamente pelo índice.

---

Essa explicação se aprofunda mais na **lógica computacional e nas razões por trás de cada instrução**. Se precisar que eu explique algum conceito em detalhes ainda maior, me avise! 🚀
 */