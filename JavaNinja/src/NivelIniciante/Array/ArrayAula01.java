package NivelIniciante.Array;

public class ArrayAula01 {
    public static void main(String[] args) {

        // Array de Ninja
        String[] ninja = new String[16];

        // Time 01
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        // Sensei do Time 01
        ninja[3] = "Kakashi Hatake";

        // Time 02
        ninja[4] = "Kiba Inuzuka";
        ninja[5] = "Hinata Hyuuga";
        ninja[6] = "Shino Aburame";
        // Sensei do Time 02
        ninja[7] = "Kurenai Yuhi";

        // Time 03
        ninja[8] = "Shikamaru Nara";
        ninja[9] = "Choji Akimichi";
        ninja[10] = "Ino Yamanaka";
        // Sensei do Time 03
        ninja[11] = "Asuma Sarutobi";

        // Time 04
        ninja[12] = "Rock Lee";
        ninja[13] = "Neji Hyuga";
        ninja[14] = "Tenten Mitsashi";
        // Sensei do Time 04
        ninja[15] = "Might Guy";

        // Apresentação do Sistema
        System.out.println("-------------------------------------------");
        System.out.println("🗡        🥷 EQUIPE DE NINJAS 🥷        🗡");
        System.out.println("-------------------------------------------");
        System.out.println();

        int contagemDeEquipes = 1;

        // Listagem de Equipes + Sensei
        for (int i = 0; i < ninja.length; i++) {

            if (i % 4 == 3) {
                System.out.println("🗡️ EQUIPE " + contagemDeEquipes + " 🗡️");

                for (int j = i - 3; j < i; j++) {
                    System.out.println("🥷 " + ninja[j] + " 🥷");
                }
                System.out.println();
                System.out.println("🥋 SENSEI " + ninja[i] + " 🥋");
                System.out.println("--------------------------------------");
                System.out.println();
                contagemDeEquipes++;
            }
        }
    }
}