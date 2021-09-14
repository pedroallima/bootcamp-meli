package com.meli;

/*

- cpf (formatado com a máscara ###.###.###-##),
- nome,
- sobrenome,
- data_de_nascimento,
- endereço e
- telefone_contato.

* */

import java.util.ArrayList;
import java.util.List;

public class Proprietario extends Pessoa {
   // public String cpf;
   // public String nome;
   // public String sobrenome;
   //  public String dataNascimento;
    public String endereco;
    public String telefone;

    public List<Paciente> animais ArrayList;

    // ● Cadastrar proprietários;
    public Proprietario(String cpf, String nome, String sobrenome, String dataNascimento, String endereco, String telefone) {
        super(cpf, nome, sobrenome, dataNascimento);
        this.endereco = endereco;
        this.telefone = telefone;
    }


}
