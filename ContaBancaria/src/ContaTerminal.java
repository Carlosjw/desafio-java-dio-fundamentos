import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = inputUser.next();

        System.out.println("Por favor, digite o número da sua conta: ");
        numero = inputUser.nextInt();

        System.out.println("Por favor, digite o número da sua agência: ");
        agencia = inputUser.next();

        System.out.println("Por favor, digite seu saldo: ");
        saldo = inputUser.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco! Sus agência é "
                + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível.");

    }
}