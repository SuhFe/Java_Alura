public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
            Filme de aventura com gala dos anos 80.
            Este é um Text Block.
            Ele permite escrever textos com múltiplas linhas
            sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
            """;
        System.out.println(sinopse);

        int classification = (int) (media / 2);
        System.out.println(classification);
   
    }
}
