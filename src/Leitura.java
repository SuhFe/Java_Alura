import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in); //System.in: parâmetro para indicar que queremos ler a entrada do usuário pelo teclado.

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine(); //recebe instrucoes do usuario do tipo String
        System.out.println("Qual o ano de lancamento? ");
        int anoDeLancamento = leitura.nextInt(); //recebe uma informacao do usuario do tipo inteiro
        System.out.println("Qual a sua avaliacao para este filme?");
        double avaliacao = leitura.nextDouble(); //recebe uma informacao do usuario do tipo double


        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }

}
