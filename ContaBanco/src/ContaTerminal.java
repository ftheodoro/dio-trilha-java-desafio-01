import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String numeroConta;
        String  agencia;
        Double saldo;
        
        String  nomeCliente;

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");    
        agencia = scan.next();

        System.out.println("Digite o numero da conta: ");
        numeroConta = scan.next();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scan.next();

        System.out.println("Digite o saldo da conta. ");
        saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque\"");
       
    }
}
