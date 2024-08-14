import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Declaração de variável saldo
        double saldo = 1000;

        //TODO: Conhecer e improtar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagem para o nosso usuário
        System.out.println("Por favor, digite o número da sua conta bancaria");
        //Exibir pela scanner os valores
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + conta + ", e seu saldo " + saldo + ", Já está disponível para saque");


    }
}
