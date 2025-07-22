package NivelIntermediario._05Desafio03Dificil;

public class Ninja {

    // Personagem
    String nome;
    String cla;
    int idade;
    String nivel;

    // Missao

    String missao;
    String nivelDificuldade;
    String statusMissao;


    public void mostrarInformacoes() {
        System.out.println("\n 🔎 Informações do Ninja 🔎");
        System.out.println(" - Nome: " + nome);
        System.out.println(" - Clã: " + cla);
        System.out.println(" - Idade: " + idade);
        System.out.println(" - Nível: " + nivel);
        System.out.println(" \n 📖 Informações da Missão 📖  ");
        System.out.println(" - Missão: " + missao);
        System.out.println(" - Nível de dificuldade: " + nivelDificuldade);
        System.out.println(" - Status da missão: " + statusMissao);
        System.out.println("\n-----------------------------------------------");
    }
}
