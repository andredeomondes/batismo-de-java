package NivelIniciante.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /**
         * SwitchCases =  servem para gerar casos específicos
         * Objetivo: Pedir para o usuário escolher entre os ninjas
         * swithCase
         */

        // Pedir para o usuário:
        Scanner sc = new Scanner(System.in);

        // Mostrar opções para o usuário:
        System.out.println("---------------------------------");
        System.out.println("|          NARUTO WORLD          |");
        System.out.println("---------------------------------");
        System.out.println("| 🪧 Escolha uma opção:          |");
        System.out.println("| 🗡️ 01 🗡️ { NARUTO UZUMAKI }    |");
        System.out.println("| 🗡️ 02 🗡️ { SASUKE UCHIHA }     |");
        System.out.println("| 🗡️ 03 🗡️ { SAKURA HARUNO }     |");
        System.out.println("----------------------------------");

        // ESCOLHA DE OPÇÕES PARA O USUÁRIO
        System.out.print("🪧 DIGITE O NÚMERO: ");
        int escolhaDoUsuario = sc.nextInt();
        System.out.println("🗡️ NÚMERO { 🥷️ " + escolhaDoUsuario + " 🥷 } ");
        System.out.println("-------------------------------");

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Bem-vindo {🥷 NARUTO UZUMAKI 🥷 }");
                break;
            case 2:
                System.out.println("Bem-vindo {🥷 SASUKE UCHIHA 🥷 }");
                break;
            case 3:
                System.out.println("Bem-vinda {🥷 SAKURA HARUNO 🥷 }");
                break;
            default:
                System.out.println("---------------------------------------------------------");
                System.out.println("|  Você não digitou uma resposta válida. Tente de novo!  |");
                System.out.println("---------------------------------------------------------");
                break;
        }

        sc.close();
    }
}
