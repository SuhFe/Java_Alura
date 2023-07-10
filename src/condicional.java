public class condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lancamentos que o cliente está curtindo");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }

    if (incluidoNoPlano == true || tipoPlano.equals("plus")){
        System.out.println("Liberado");
    } else {
        System.out.println("Fora do plano");
    }
  }
}