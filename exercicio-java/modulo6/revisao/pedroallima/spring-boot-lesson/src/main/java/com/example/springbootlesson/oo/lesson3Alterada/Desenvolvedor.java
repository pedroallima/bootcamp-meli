package com.example.springbootlesson.oo.lesson3Alterada;

public class    Desenvolvedor extends Funcionario {
    Integer senha;
    public Desenvolvedor(String n, String s, double sal, String Integer) {
        super(n, s, sal);
        this.senha = senha;
    }

    private static String gerarSenha(){
        int qtdeMaximaCaracteres = 8;
        String[] caracteres = { "0", "1", "b", "2", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "      " + gerarSenha() + "     " + getSalario();
    }
}
