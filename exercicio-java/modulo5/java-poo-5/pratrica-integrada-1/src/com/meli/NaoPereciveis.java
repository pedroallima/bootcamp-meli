public class NaoPereciveis extends Produto{
    protected String type;

    public NaoPereciveis(String nome, double preco) {
        super(nome, preco);
    }

    public double calcule(int quantidadeDeProdutos){
        return preco*quantidadeDeProdutos;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "type='" + type + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
