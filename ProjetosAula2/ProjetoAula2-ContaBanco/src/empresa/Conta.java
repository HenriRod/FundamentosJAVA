package empresa;

public class Conta {
    // Atributos da classe Conta que armazenam informações sobre a conta bancária
    int numero; // Número da conta
    String titular; // Nome do titular da conta
    double saldo; // Saldo atual da conta
    double limite; // Limite de crédito da conta
    
    // Construtor da classe Conta
    // Serve para inicializar os atributos da conta ao criar um novo objeto Conta
    public Conta(int numero, String titular, double saldo, double limite) {
        super(); // Chama o construtor da classe pai (não é necessário aqui, mas foi incluído)
        this.numero = numero; // Inicializa o número da conta
        this.titular = titular; // Inicializa o nome do titular
        this.saldo = saldo; // Inicializa o saldo da conta
        this.limite = limite; // Inicializa o limite de crédito da conta
    }

    // Método para sacar dinheiro da conta
    // Retorna false se o valor for maior que o limite, maior que o saldo ou menor/igual a zero
    boolean sacar(double valor) {
        if(valor > limite || valor > saldo || valor <= 0) {
            return false; // Saque inválido
        }
        saldo -= valor; // Subtrai o valor do saldo
        return true; // Saque realizado com sucesso
    }
    
    // Método para depositar dinheiro na conta
    // Retorna false se o valor for menor ou igual a zero
    boolean depositar(double valor) {
        if(valor <= 0) {
            return false; // Depósito inválido
        }
        saldo += valor; // Adiciona o valor ao saldo
        return true; // Depósito realizado com sucesso
    }
    
    // Método para transferir dinheiro para outra conta
    // Primeiro tenta sacar o valor da conta atual; se o saque for bem-sucedido, deposita o valor na outra conta
    boolean transferir(Conta outra, double valor) {
        if(!this.sacar(valor)) { // Tenta sacar o valor da conta atual
            return false; // Transferência falhou se o saque não for possível
        }
        outra.depositar(valor); // Deposita o valor na conta de destino
        return true; // Transferência realizada com sucesso
    }
    
    // Método para exibir informações da conta
    // Mostra o nome do titular, número da conta, saldo e limite
    void info() {
        System.out.println("Nome: " + titular); // Exibe o nome do titular
        System.out.println("Numero: " + numero); // Exibe o número da conta
        System.out.println("Saldo: " + saldo); // Exibe o saldo atual
        System.out.println("Limite: " + limite); // Exibe o limite de crédito
    }
}
