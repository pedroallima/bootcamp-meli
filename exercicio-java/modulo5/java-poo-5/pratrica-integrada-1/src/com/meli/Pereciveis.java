public class Pereciveis extends Produto{
    private int dataDeValidade;

    public Pereciveis(String nome, double preco, int dataDeValidade) {
        super(nome, preco);
        this.dataDeValidade = dataDeValidade;
    }
    public double calcule(int quantidadeDeProdutos){
        switch (dataDeValidade){
            case 1:
                return (quantidadeDeProdutos * preco)/4;
            case 2:
                return (quantidadeDeProdutos * preco)/3;
            default:
                return (quantidadeDeProdutos * preco)/2;
        }
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "dataDeValidade=" + dataDeValidade +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
