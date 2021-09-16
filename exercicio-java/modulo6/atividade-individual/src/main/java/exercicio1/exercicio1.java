package exercicio1;

public class exercicio1 {
    /*Em sua classe principal:
    ● crie 10 pessoas e adicione as mesmas na agenda.
    ● remova uma pessoa da lista
    ● busque uma pessoa na lista pelo seu nome;
    ● apresente todas as pessoas que estão na agenda;
    ● apresente uma pessoa em específico;
    OBS: utilize os métodos da classe Agenda para estas operações;*/

/*Plus
●CrieummétodolistarPessoasEmOrdemAlfabéticaDeNome()paraordenaralista de pessoas em ordem alfabética de nome;
●CrieummétodolistarPessoasEmOrdemAlfabeticaDeEndereco() para ordenar a lista de pessoas em ordem alfabética de endereço;
●CrieummétodolistarPessoasPorIdade()paraordenaralistadepessoasemordem decrescente de idade (do mais idoso para o mais novo)
*/


    public static void main(String[] args) {
      Agenda agenda = new Agenda();

      //crie 10 pessoas e adicione as mesmas na agenda.
      Pessoa pessoa = new Pessoa("Pedro","rua cerejeira","87988264086",35,1.70);
      Pessoa pessoa2 = new Pessoa("Pedro2","rua cerejeira2","87988264081",32,1.70);
      Pessoa pessoa3 = new Pessoa("Pedro3","rua cerejeira3","87988264082",33,1.70);
      Pessoa pessoa4 = new Pessoa("Pedro4","rua cerejeira4","87988264083",34,1.70);
      Pessoa pessoa5 = new Pessoa("Pedro5","rua cerejeira5","87988264084",37,1.70);
      Pessoa pessoa6 = new Pessoa("Pedro6","rua cerejeira6","87988264085",39,1.70);
      Pessoa pessoa7 = new Pessoa("Pedro7","rua cerejeira7","879882640866",32,1.70);
      Pessoa pessoa8 = new Pessoa("Pedro8","rua cerejeira7","87988264087",30,1.70);
      Pessoa pessoa9 = new Pessoa("Pedro9","rua cerejeira9","87988264088",21,1.70);
      Pessoa pessoa10 = new Pessoa("Pedro10","rua cerejeira10","879882640869",40,1.70);


      //Adicionando as pessoas na lista
      agenda.armazenarPessoa(pessoa);
      agenda.armazenarPessoa(pessoa2);
      agenda.armazenarPessoa(pessoa5);
      agenda.armazenarPessoa(pessoa6);
      agenda.armazenarPessoa(pessoa4);
      agenda.armazenarPessoa(pessoa3);
      agenda.armazenarPessoa(pessoa8);
      agenda.armazenarPessoa(pessoa9);
      agenda.armazenarPessoa(pessoa10);

      //remova uma pessoa da lista
      agenda.removerPessoa("Pedro");
      // busque uma pessoa na lista pelo seu nome;
      agenda.buscarPessoa("Pedro2");
      //apresente todas as pessoas que estão na agenda;
      agenda.exibirTodaAgenda();
      //apresente uma pessoa em específico;
      agenda.exibirPessoa(1);

      System.out.println("-----------------------------Ordenando por ordem alfabetica-------------------------------");
        agenda.listarPessoasEmOrdemAlfabéticaDeNome();

      System.out.println("-----------------------------Ordenando por ordem alfabetica-------------------------------");
      agenda.listarPessoasEmOrdemAlfabeticaDeEndereco();

      System.out.println("---------------------------------Ordenando por ordem idade--------------------------------");
      agenda.listarPessoasPorIdade();
    }

}
