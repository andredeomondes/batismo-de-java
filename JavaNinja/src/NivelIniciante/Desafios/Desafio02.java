package NivelIniciante.Desafios;

import java.util.Scanner;

public class Desafio02 {

    // Função para mostrar o menu
    public static void menu() {
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║         🥷 CADASTRO DE NINJAS 🥷     ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.println();
        System.out.println(" [ 🥷 1 ] ~ Cadastrar Ninja");
        System.out.println(" [ 📜 2 ] ~ Listar Ninjas");
        System.out.println(" [ ❌ 3 ] ~ Deletar Ninja");
        System.out.println(" [ 🚪 4 ] ~ Sair");
        System.out.println();
        System.out.print("⚡ Escolha uma opção: ");
    }

    // Função de verificação, para ver se o array de ninja está vazio
    public static boolean listaVazia(String[] ninjas) {
        for (String ninja : ninjas) {
            if (ninja != null) {
                return false; // Significa que tem ninjas na lista (contém)
            }
        }
        return true; // Significa que todos os elementos são nulos na lista (vazia)
    }

    // Função para listar ninjas
    public static void listarNinjas(String[] ninjas) {
        boolean listaVazia = true;

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("🗡️ Ninja " + (i + 1) + ": " + ninjas[i]);
            listaVazia = false;
        }
        if (listaVazia) {
            System.out.println("\n⚠️ Nenhum ninja cadastrado ainda. 🫥⚠️\n");
        } else {
            System.out.println("\n🌟 Esses são os ninjas cadastrados! 🌟\n");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Definições
        int ninjasCadastrados = 0;
        int quantidadeDeNinjas = 0;
        int NUMERO_MAX = 10;
        int escolha = 0;

        String cadastrarNinja;
        String[] ninjas = new String[NUMERO_MAX];


        do {
            menu();
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {

                // CADASTRANDO NINJA(S)
                case 1:
                    System.out.println();
                    System.out.println("-------------------------------------------- ");
                    System.out.println("|             INICIANDO CADASTRO           |");
                    System.out.println("-------------------------------------------- ");
                    System.out.println();

                    if (ninjasCadastrados >= NUMERO_MAX) {
                        System.out.println("⚠️ Lista de Ninjas lotada, tente mais tarde!");
                    } else {
                        System.out.print("🥷 Quantos ninjas você deseja cadastrar: ");
                        quantidadeDeNinjas = sc.nextInt();
                        sc.nextLine();

                        if (quantidadeDeNinjas > (NUMERO_MAX - ninjasCadastrados)) {
                            System.out.println("⚠️ Número de ninjas excede o limite disponível!");
                        } else {
                            for (int i = 0; i < quantidadeDeNinjas; i++) {
                                for (int j = 0; j < NUMERO_MAX; j++) {
                                    if (ninjas[j] == null) {
                                        System.out.print("🥷 Digite o nome do ninja: ");
                                        ninjas[j] = sc.nextLine();
                                        ninjasCadastrados++;
                                        break;
                                    }
                                }
                            }
                            System.out.println("\n🪧 Ninjas cadastrados com sucesso! 🪧\n");
                        }

                    }
                    break;
                case 2:
                    System.out.println("🥷 Lista de Ninjas 🥷");
                    boolean listaVazia = true;

                    for (int i = 0; i < NUMERO_MAX; i++) {
                        if (ninjas[i] != null) {
                            System.out.println("🗡 " + (i + 1) + " 🗡 " + ninjas[i]);
                            listaVazia = false;
                        }
                    }

                    if (listaVazia) {
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("\n⚠️ Opa! Não existem ninjas cadastrados ainda. ⚠️\n");
                        System.out.println("---------------------------------------------------------------\n");

                    }
                    break;
                case 3:
                    boolean deletarListaVazia = true;

                    for (int i = 0; i < NUMERO_MAX; i++) {
                        if (ninjas[i] != null) {
                            deletarListaVazia = false;
                            break;
                        }
                    }

                    if (deletarListaVazia) {
                        System.out.println("\n⚠️ Opa! Não existem ninjas cadastrados ainda. ⚠️\n");
                    } else {
                        System.out.println("🥷 Essa é a Lista de Ninjas 🥷");
                        for (int i = 0; i < NUMERO_MAX; i++) {
                            if (ninjas[i] != null) {
                                System.out.println("🗡 " + (i + 1) + " 🗡 " + ninjas[i]);
                            }
                        }

                        System.out.print("Digite o número do ninja que você quer deletar: ");
                        int numeroNinjaDeletavel = sc.nextInt();
                        sc.nextLine();

                        if (numeroNinjaDeletavel < 1 || numeroNinjaDeletavel > NUMERO_MAX || ninjas[numeroNinjaDeletavel - 1] == null) {
                            System.out.println("\n⚠️ Número inválido ou ninja não encontrado! ⚠️\n");
                        } else {
                            ninjas[numeroNinjaDeletavel - 1] = null;
                            ninjasCadastrados--;

                            System.out.println("\n--------------------------------------");
                            System.out.println("       NINJA DELETADO COM SUCESSO");
                            System.out.println("--------------------------------------\n");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Encerrando 🥷 CADASTRO DE NINJAS 🥷");
                    escolha = 4;
                    break;
                default:
                    System.out.println("⚠️ Opção inválida! Tente novamente. ⚠️");
                    break;
            }
        } while (escolha != 4);

        sc.close();
    }
}
