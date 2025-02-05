package NivelIniciante.Array;

public class ArrayAula02 {
    public static void main(String[] args) {


        System.out.println("------------------------------------------------------");
        System.out.println("|    ESTUDO DE ARRAYS - PADRÃO DE INICIALIZAÇÃO      |");

        // Array são tipo referência!
        // [ STRING ] inicializa como [ NULL ]
        String[] ninja = new String[4];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        System.out.println("------------------------------------------------------");
        System.out.print("Esté é o modelo de inicialização da [ STRING ] ~ ");
        System.out.println(ninja[3]);
        System.out.println("------------------------------------------------------");


        // [ INT ] inicializa como [ 0 ]
        int[] idade = new int[2];
        System.out.print("Esté é o modelo de inicialização do [ INT ] ~ ");
        System.out.println(idade[1]);
        System.out.println("------------------------------------------------------");


        // [ DOUBLE ] inicializa como [ 0.0 ]
        double[] flutuante = new double[2];
        System.out.print("Esté é o modelo de inicialização do [ DOUBLE ] ~ ");
        System.out.println(flutuante[1]);
        System.out.println("------------------------------------------------------");


        // [ BOOLEAN ] inicializa como [ FALSE ]
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.print("Esté é o modelo de inicialização do [ BOOLEAN ] ~ ");
        System.out.println(verdadeiroOuFalso[0]);
        System.out.println("------------------------------------------------------");


    }
}
