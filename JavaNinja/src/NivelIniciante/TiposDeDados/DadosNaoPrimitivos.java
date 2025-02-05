package NivelIniciante.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /**
         * Dados não primitivos: String, Array, Class, enum
         * Objetivo:
         **/

        System.out.println("--------------------------");
        System.out.println("|| DADOS NÃO PRIMITIVOS ||");
        System.out.println("--------------------------");
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // ToLowerCase vai colocar tudo em caixa baixa
        System.out.println(aldeiaEmCaixaBaixa);

    }
}
