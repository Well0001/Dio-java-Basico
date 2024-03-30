import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia, nomeCliente = "";
        double saldo = 0;

        Scanner scNum = new Scanner(System.in);
        Scanner scAg = new Scanner(System.in);
        Scanner scCli = new Scanner(System.in);
        Scanner scSaldo = new Scanner(System.in);

        System.out.println("Para iniciarmos seu atendimento digite seu nome: ");
        nomeCliente = scCli.nextLine();

        System.out.println("Bem Vindo " + nomeCliente);
        System.out.println("Digite o numero de sua conta: ");
        numero = scNum.nextInt();

        System.out.println("");
        System.out.println("Agora digite o numero de sua agencia: ");
        agencia = scAg.nextLine();

        System.out.println("");
        System.out.println("Digite o valor a adicionar em seu saldo: ");
        saldo = scSaldo.nextDouble();

        scNum.close();
        scAg.close();
        scCli.close();
        scSaldo.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
