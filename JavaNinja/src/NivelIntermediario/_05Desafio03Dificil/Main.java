package NivelIntermediario._05Desafio03Dificil;

public class Main {
    public static void main(String[] args) {

        // Ninja Qualquer
        Ninja Kim_Macintosh = new Ninja();
        Kim_Macintosh.nome = "Kim Macintosh";
        Kim_Macintosh.cla = "Macintosh";
        Kim_Macintosh.idade = 18;
        Kim_Macintosh.nivel = "Genin";

        Kim_Macintosh.missao = " Recuperar um ninja ferido ";
        Kim_Macintosh.nivelDificuldade = "Genin";
        Kim_Macintosh.statusMissao = "Em andamento";

        Kim_Macintosh.mostrarInformacoes();

        // Ninja do Clã Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.cla = "Uchiha";
        Sasuke.idade = 16;
        Sasuke.nivel = "Genin";

        Sasuke.missao = " Recuperar Sakura";
        Sasuke.nivelDificuldade = "Genin";
        Sasuke.statusMissao = "Incompleta";
        Sasuke.mostrarInformacoes();




    }


}
