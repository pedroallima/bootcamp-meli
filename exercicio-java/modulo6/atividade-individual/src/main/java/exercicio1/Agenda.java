package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Pessoa> pessoas = new ArrayList<Pessoa>();

    ////Recebeumobjetodotipopessoaeadiciona a pessoa na lista
    public void armazenarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    ////Recebeumnome,busca o elemento na lista e remove a pessoa caso ela exista

    public void removerPessoa(String nome){
        for(Pessoa pessoa: pessoas){
            if (pessoa.getNome().equals(nome)){
                pessoas.remove(nome);
                System.out.println("Pessoa de nome: "+pessoa.getNome() + " REMOVIDO");
                return;
            }
        }
        System.out.println("Esta PESSOA NÃO FOI ENCONTRADA");
    }


    //// informa em que posiçãoda agenda está a pessoa

    public void buscarPessoa(String nome){
        for(Pessoa pessoa: pessoas){
            if (pessoa.getNome().equals(nome)){
                System.out.println("Pessoa de nome: "+pessoa.getNome() + " ENCONTRADA");
                return;
            }
        }
        System.out.println("ESTA PESSOA NÃO FOI ENCONTRADA");
    }


    // exibe todos os dados detodas as pessoas da agenda
    public void exibirTodaAgenda(){
        System.out.println("*******PESSOAS AGENDADAS***********");
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getNome());
        }
    }

    //exibe todos os dados da pessoa que está na posição “index” da agenda na console

    void exibirPessoa(int index){
        for(Pessoa pessoa: pessoas){
            if (pessoas.get(index) != null ){
                System.out.println("Nome: "+pessoas.get(index).nome+ " Endereco: "+pessoas.get(index).nome+" Telefone: "+pessoas.get(index).telefone+" Idqade: "+pessoas.get(index).idqade+" Alutira: "+pessoas.get(index).altura);
                return;
            }
        }
        System.out.println("ESTA PESSOA NÃO FOI ENCONTRADA");
    }

    public void listarPessoasEmOrdemAlfabéticaDeNome(){
        pessoas.stream().sorted((Pessoa p1, Pessoa p2) -> p1.getNome().compareTo(p2.getNome()));
        pessoas.forEach(System.out::println);
    }
    public void listarPessoasEmOrdemAlfabeticaDeEndereco(){
        pessoas.stream().sorted((Pessoa p1, Pessoa p2) -> p1.getEndereco().compareTo(p2.getEndereco()));
        pessoas.forEach(System.out::println);

    }
    public void listarPessoasPorIdade(){
        pessoas.stream().sorted((Pessoa p1, Pessoa p2) -> p1.getIdqade().compareTo(p2.getIdqade()));
        pessoas.forEach(System.out::println);

    }

}
