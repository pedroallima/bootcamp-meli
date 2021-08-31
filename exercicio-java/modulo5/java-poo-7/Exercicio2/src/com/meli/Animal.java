package com.meli;

import com.meli.Interfaces.InterfaceAnimal;

public abstract class Animal implements InterfaceAnimal {
/*
Animais Domésticos e
Animais de Fazenda
, atendem
cães ok, gatos ok, porquinhos-da-índia ok, coelhos ok, tartarugas ok, cavalos ok, vacas ok e ovelhas.
*/

    public Animal() {}

    @Override
    public void numeroPaciente() {}

    @Override
    public void especie() {}

    @Override
    public void raca() {}

    @Override
    public void cor() {}

    @Override
    public void dataNascimento() {}

    @Override
    public void nome() {}

/*Ao mesmo tempo, cada paciente tem um proprietário atribuído que deve ser conhecido:
* - ID,
- nome,
- sobrenome,
- data_de_nascimento,
- endereço e
- telefone_contato.
* */



}
