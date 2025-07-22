package NivelIntermediario._02MetodosEParametros;

import java.util.Objects;

public class Ninja {
    String nome;
    String clan;
    int idade;

    public void cumprimentar() {
        System.out.println("Olá! Eu sou " + nome + " tenho " + idade + " anos e sou do clan " + clan + "." );
    }

    public void sharingan(boolean statusSharingan) {
        if (Objects.equals(clan, "Uchiha")) {
            if (statusSharingan == true) {
                System.out.println("Sharingan ativado!");
            } else {
                System.out.println("Sharingan desativado!");
            }
    }}

    public int quantosAnosParaSerHokage(int idadeMinima) {
        return idadeMinima - idade;
    }
}
