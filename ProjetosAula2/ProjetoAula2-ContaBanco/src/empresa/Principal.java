package empresa;

// Importações de classes do Java (não estão sendo usadas neste código)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    
        // Criação de uma conta bancária (c1) com número 111, titular "Mario",
        // saldo inicial de 2000 e limite de crédito de 500
        Conta c1 = new Conta(111,"Mario",2000,500);
        
        // Exibe as informações da conta c1 (provavelmente saldo, titular, etc.)
        c1.info();
        
        // Tenta sacar 2000 da conta c1. Se o saque falhar, exibe uma mensagem de erro.
        if(!c1.sacar(2000)) {
            System.out.println("Problema ao sacar");
        }
        
        // Tenta depositar -500 na conta c1. Como valores negativos não fazem sentido
        // para depósitos, o método provavelmente retorna false e exibe uma mensagem de erro.
        if(!c1.depositar(-500)) {
            System.out.println("Problema ao depositar");
        }
        
        // Exibe novamente as informações da conta c1 para mostrar o estado atualizado
        c1.info();
        
        // Criação de uma segunda conta bancária (c2) com número 222, titular "Luigi",
        // saldo inicial de 4000 e limite de crédito de 600
        Conta c2 = new Conta(222,"Luigi",4000,600);
        
        // Transfere 2000 da conta c1 para a conta c2
        c1.transferir(c2, 2000);
        
        // Exibe as informações atualizadas da conta c1 após a transferência
        c1.info();
        
        // Exibe as informações atualizadas da conta c2 após a transferência
        c2.info();
    
    }
    
}
