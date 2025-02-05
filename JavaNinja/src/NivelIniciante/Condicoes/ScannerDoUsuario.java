package NivelIniciante.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /**
         * Scanner = É um jeito de trazer osuário spara de dentro da aplicação
         * Objetivo = O usuário vai criar um ninja e vamos validar os dados
         **/

        Scanner caixaDeScan = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------");
        System.out.println("| 🥷 Bem vindo(a) ao criador de personagens do Naruto 🥷  |");
        System.out.println("-----------------------------------------------------------");
        System.out.println();

        // Receber o nome do Ninja
        System.out.print("🗡️️ Digite o nome do personagem: ");
        String nomeDoNinja = caixaDeScan.nextLine();
        System.out.println("Nome do personagem { 🥷 " + nomeDoNinja.toUpperCase() + " 🥷 } confirmado.");

        // Receber a idade do Ninja
        System.out.print("🗡️️ Digite a idade do personagem: ");
        int idadeDoNinja = caixaDeScan.nextInt();
        System.out.println(" { 🥷 " + nomeDoNinja.toUpperCase() + " 🥷 } tem + { " + idadeDoNinja + " } anos.");

        // Tratamento de Dados

        if (idadeDoNinja >= 18) {
            System.out.println("🪧 Esse ninja já é maior de idade e pode ir para missões fora da Aldeia da Folha 🪧");
        } else {
            System.out.println("🪧 Esse ninja é muito novo ainda, precisa treinar mais antes de sair da vila 🪧");
        }

        // Fechar sempre o Scanner
        caixaDeScan.close();


    }
}
