public class exercicio2 {
    public static void main(String[] args) {
        /*Exercício proposto: Criar um programa para converter de Celsius  para Farenheit
         Fórmula para conversao: (temperatura em Celsius * 1.8) + 32
         Logo após, definir Sting com resultado.
        */

        System.out.println(" ==> Temperatures <==");

        double temperatureCelsius = 29.5; //temperatura em graus Celsius a ser convertida
        System.out.println("TemperatureToday: " + temperatureCelsius + "°C");

        double conversao = (temperatureCelsius * 1.8)+ 32; //Conversao da temperatura de graus Celsius para Farenheit
        int temperatureFahrenheit = (int)conversao; //Conversao feita utilizando recurso Casting, utilizado para que dados imcompatíveis possam ser utilizados em uma mesma operacao ou expressao.
        
        System.out.println("TemperatureToday: " + temperatureFahrenheit + "°F");

    }
}