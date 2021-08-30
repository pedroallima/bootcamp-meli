import java.util.ArrayList;
import java.util.List;

public class Distribuidor {

    public static void main(String[] args) {

        ArrayList<Produto>produtos = new ArrayList<>();

        produtos.add(new NaoPereciveis("sal",2));
        produtos.add(new NaoPereciveis("acuca",5));
        produtos.add(new NaoPereciveis("Coquinha-Retornavel",6));
        produtos.add(new Pereciveis("Banana",2,3));
        produtos.add(new Pereciveis("Abacate",5,2));
        produtos.add(new Pereciveis("Manga", 5, 1));

        for (int i = 0; i <produtos.size(); i++){
            System.out.println(produtos.get(i).toString());
            System.out.println(produtos.get(i).calcule(5));
        }
    }
}
