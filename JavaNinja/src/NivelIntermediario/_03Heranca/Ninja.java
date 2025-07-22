package NivelIntermediario._03Heranca;

public class Ninja {
    String nome;
    String aldeia;
    String nivel;
    String clan;
    int idade;


    void exibirNinja() {
        System.out.println("\n 🐱‍👤 Personagem: " + nome + " " + clan);
        System.out.println("\n    ♣ Aldeia:  " + aldeia);
        System.out.println("\n    ♣ Idade:  " + idade);
        System.out.println("\n    ♣ Nivel:  " + nivel);
        System.out.println("\n-------------------------------------\n ");
    }

}
