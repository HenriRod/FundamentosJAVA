import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int persas = 30000;
        int tentativa = 0; // Inicializa a variável tentativa

        System.out.println("O Leônidas, essa guerra ai é contra quantos...");

        // Loop até que o usuário acerte o número de persas
        while (tentativa != persas) {
            tentativa = teclado.nextInt();

            if (tentativa == persas) {
                System.out.println("O LEONIDAS, SÃO CONTRA QUANTOS MESMO?\n Guerreiros, seremos 300 contra 30000 persas!");
            } else if (tentativa < persas) {
                System.out.println("Um pouco mais!");
            } else {
                System.out.println("Um pouco menos!");
            }
        }

        teclado.close(); // Fechando o Scanner para evitar vazamento de recursos
    }
}


//       while(tentativa != persas){
//           msg = 