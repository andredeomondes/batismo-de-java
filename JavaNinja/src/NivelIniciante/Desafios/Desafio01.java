package NivelIniciante.Desafios;

public class Desafio01 {
    public static void main(String[] args) {

        // Ninja 01 - Kakashi Hatake
        String nomeNinja1 = "Kakashi Hatake";
        int idadeNinja1 = 26;
        String missaoNinja1 = "Proteger o Hokage";
        char nivelMissaoNinja1 = 'S';
        String statusMissaoNinja1;

        if (idadeNinja1 >= 15) {
            statusMissaoNinja1 = "Concluída";
        } else if (nivelMissaoNinja1 == 'C' || nivelMissaoNinja1 == 'D') {
            statusMissaoNinja1 = "Concluída";
        } else {
            statusMissaoNinja1 = "Não concluída";
        }

        System.out.println("-------------------------------------");
        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missão: " + missaoNinja1 + " | Nível de missão: " + nivelMissaoNinja1);
        System.out.println("--------------------------------------");
        System.out.println("Status da missão de " + nomeNinja1 + ": " + statusMissaoNinja1);
        System.out.println("-------------------------------------");


        // Ninja 02 - Naruto Uzumaki
        String nomeNinja2 = "Naruto Uzumaki";
        int idadeNinja2 = 12;
        String missaoNinja2 = "Resgatar um amigo ferido";
        char nivelMissaoNinja2 = 'S';
        String statusMissaoNinja2;

        if (idadeNinja2 >= 15) {
            statusMissaoNinja2 = "Concluída";
        } else if (nivelMissaoNinja2 == 'C' || nivelMissaoNinja2 == 'D') {
            statusMissaoNinja2 = "Concluída";
        } else {
            statusMissaoNinja2 = "Não concluída";
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missão: " + missaoNinja2 + " | Nível de missão: " + nivelMissaoNinja2);
        System.out.println("-------------------------------------");
        System.out.println("Status da missão de " + nomeNinja2 + ": " + statusMissaoNinja2);
        System.out.println("-------------------------------------");

        // Ninja 03 - Itachi Uchiha
        String nomeNinja3 = "Itachi Uchiha";
        int idadeNinja3 = 14;
        String missaoNinja3 = "Resgatar o Clã Uchiha";
        char nivelMissaoNinja3 = 'D';
        String statusMissaoNinja3;

        if (idadeNinja3 >= 15) {
            statusMissaoNinja3 = "Concluída";
        } else if (nivelMissaoNinja3 == 'C' || nivelMissaoNinja3 == 'D') {
            statusMissaoNinja3 = "Concluída";
        } else {
            statusMissaoNinja3 = "Não concluída";
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missão: " + missaoNinja3 + " | Nível de missão: " + nivelMissaoNinja3);
        System.out.println("-------------------------------------");
        System.out.println("Status da missão de " + nomeNinja3 + ": " + statusMissaoNinja3);
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("...");

    }
}
