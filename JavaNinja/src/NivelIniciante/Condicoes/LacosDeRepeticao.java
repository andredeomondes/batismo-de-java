package NivelIniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /**
         * Laços de Repetição: Vão repetir uma função inifinitas vezes ou até uma certa condição
         */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        // WHILE
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|                        { ESTRUTURA [ WHILE ] }                             |");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
        // while (condicao) {funcao}
        while (numeroDeClones < numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras ( " + numeroDeClones + " )");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|                          { ESTRUTURA [ FOR ] }                              |");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();

        // FOR
        for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("O Naruto fez um clone das sombras ( " + numeroDeClones + " )");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");

    }
}
