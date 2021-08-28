public class Exercicio1 {
    public static void main(String[] args) {
        String Exercicio = "Exercício No 1";
        String Enunciado = "Um estudante de programação tentou fazer declarações de variáveis com seus respectivos tipos em Java, mas teve várias dúvidas ao fazer isso. A partir daí, ele nos forneceu seu código e pediu a ajuda de um desenvolvedor experiente que poderia ajudá-lo. Você poderia copiar seu código em algum IDE e verificar se as correções são necessárias?";
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
                        "        String apelido = Gomez;\n" +
                        "        int idade = \"35\";\n" +
                        "        boolean = \"false\";\n" +
                        "        String saldo = 45857.90\n" +
                        "        double nome = \"Julián\";";
        String Resposta =
                        "        String apelido = \"Gomez\";\n" +
                        "        int idade = 35;\n" +
                        "        boolean variavel = false;\n" +
                        "        double saldo = 45857.90;\n" +
                        "        String nome = \"Julián\";";


        System.out.println(divExercicio);
        System.out.println(Enunciado);
        System.out.println(Exemplos);
        System.out.println(divResposta);
        System.out.println(Resposta);


/*
        System.out.println(apelido);
        System.out.println(idade);
        System.out.println(variavel);
        System.out.println(String.format("%.2f",saldo));
        System.out.println(nome);
*/

    }
}
