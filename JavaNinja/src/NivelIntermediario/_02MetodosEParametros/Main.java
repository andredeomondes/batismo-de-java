package NivelIntermediario._02MetodosEParametros;

public class Main {
    public static void main(String[] args) {
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke";
        Sasuke.clan = "Uchiha";
        Sasuke.idade = 15;

        Sasuke.cumprimentar();
        int quantosAnosFaltamSasukeHokage = Sasuke.quantosAnosParaSerHokage(18);
        System.out.println(Sasuke.nome + " você tem " + Sasuke.idade + " anos. Faltam " + quantosAnosFaltamSasukeHokage + " anos para ser hokage.");
        Sasuke.sharingan(true);
        Sasuke.sharingan(false);
    }
}
