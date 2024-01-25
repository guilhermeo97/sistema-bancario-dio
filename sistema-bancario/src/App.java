import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.nextLine();

        System.out.println("Por favor, digite a conta!");
        numero = scan.nextInt();

        System.out.println("Por favor, digite o seu saldo");
        saldo = scan.nextDouble();
        
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta: " + numero + " e seu saldo é: R$" + saldo + "já está disponível para saque");
    
        scan.close();
    }
}
