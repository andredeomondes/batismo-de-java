package NivelIniciante.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /**
         * IF E ELSE - Condições
         * Objetivo:Passar o ninja de nível de acordo com o número de missões
         * */

        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}
