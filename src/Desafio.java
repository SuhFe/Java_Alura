import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String menu;
        int saldo = 1000;

        menu = """
            ********************************
            Dados iniciais do Cliente

            Nome : Suzana Fernandes
            Tipo de conta : Corrente
            Saldo Inicial : R$ 1.000,00
            ********************************

            Operacoes :
            """;

        System.out.println(menu);
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
            
        while(opcao != 4){
        System.out.println("1 - Consultar saldo: ");
        System.out.println("2 - Receber valor: ");
        System.out.println("3 - Transferir: ");
        System.out.println("4 - Finalizar:\n\n ");
        System.out.println("Digite a opcao desejada: ");
        opcao = entrada.nextInt();
            
        switch(opcao){
            case 1:
            System.out.println("O saldo atual é de: " + saldo);
            break;
            case 2:
                System.out.println("Informe o valor a receber: ");
                saldo = saldo + entrada.nextInt();
                System.out.println(saldo);
                break;
            case 3:
                System.out.println("Informe o valor a pagar: ");
                saldo = saldo - entrada.nextInt();
                System.out.println(saldo);
                break;
                default:
                System.out.println("Atendimento Finalizado.");
            }
        }
    }
}
