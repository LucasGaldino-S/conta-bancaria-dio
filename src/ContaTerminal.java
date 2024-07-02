import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta);
        System.out.println("e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
       
