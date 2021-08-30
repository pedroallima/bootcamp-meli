import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {
        String Exercicio = "Exercício No 2";
        String Enunciado = "";
        String divExercicio =
                "        ------------------------\n" +
                "        -----"+Exercicio+"-----\n" +
                "        ------------------------\n";
        String divResposta =
                "        ------------------------\n" +
                "        -----RESPOSTA-----------\n" +
                "        ------------------------\n";
        String Exemplos =
                "----------------------------------------\n" +
                "        String 1nome;\n" +
                "        int idade;\n" +
                "        double $aldo;\n" +
                "        String @pellido;\n" +
                "        String direcao;\n" +
                "        boolean carteira de motorista;\n" +
                "        double altura da pessoa;\n" +
                "        int quantidade-de-filhos;";
        String Resposta =

                "        String nome;\n" +
                "        int idade;\n" +
                "        double saldo;\n" +
                "        String apellido;\n" +
                "        String direcao;\n" +
                "        boolean carteira_de_motorista;\n" +
                "        double altura_da_pessoa;\n" +
                "        int quantidade_de_filhos;";


        System.out.println(divExercicio);
        System.out.println(Enunciado);
        System.out.println(Exemplos);
        System.out.println(divResposta);
        System.out.println(Resposta);
/*
------------------------
-----EXERCICIO 2--------
------------------------
        String 1nome;
        int idade;
        double $aldo;
        String @pellido;
        String direcao;
        boolean carteira de motorista;
        double altura da pessoa;
        int quantidade-de-filhos;
-----------------------------

        String nome;
        int idade;
        double saldo;
        String apellido;
        String direcao;
        boolean carteira_de_motorista;
        double altura_da_pessoa;
        int quantidade_de_filhos;
*/

    }
}
