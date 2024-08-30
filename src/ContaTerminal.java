import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner

        //exibir as mensagens para nosso usuário

        //obter pela classe scanner os valores do terminal

        // Exibir a mensagem da conta criada


        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua agência!");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite a sua agência!");
        String agencia = sc.next();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo!");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta "+ numero+" e seu saldo "+saldo
        +" já está disponível para saque");





        






    }
}
