package NivelIniciante.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
         * Dados primitivos: int, double,  float, char, boolean, short.
         * Objetivo da aula: criar um ninja { Naruto }
         */

        String nome = "Naruto"; // Valor máximo: 2 bilhões //
        int idade = 16;
        double altura = 1.64;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        String vida;

        if(vivoOuMorto = true) {
            vida = "Vivo";
        } else {
            vida = "Morto";
        }
        Long saldoBancario = 999999L; // Valor máximo: 9 trilhões //


        System.out.println("--------------------------");
        System.out.println("|| DADOS PRIMITIVOS ||");
        System.out.println("--------------------------");
        System.out.println("Nome: " + nome); // Comando para mostrar a variável
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Status de vida: " + vida);
        System.out.println("Saldo bancário: R$" + saldoBancario + ",00");
        System.out.println("--------------------------");

    }
}
