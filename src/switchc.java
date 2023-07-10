public class switchc {
    public static void main(String[] args){
        int dia = 6;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo"; 
                break;
            case 2:
                nomeDia = "Segunda-feira"; 
                break;
            case 3:
                nomeDia = "Terca-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quita-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
    }
    System.out.println("O dia " + dia + " é " + nomeDia);
    
}
}
