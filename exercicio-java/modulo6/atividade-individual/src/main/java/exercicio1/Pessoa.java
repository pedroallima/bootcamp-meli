package exercicio1;

public class Pessoa {
    String nome;
    String endereco;
    String telefone;
    Integer idqade;
    Double altura;

    public Pessoa(String nome, String endereco, String telefone, Integer idqade, Double altura) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idqade = idqade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdqade() {
        return idqade;
    }

    public void setIdqade(Integer idqade) {
        this.idqade = idqade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idqade=" + idqade +
                ", altura=" + altura +
                '}';
    }




}
