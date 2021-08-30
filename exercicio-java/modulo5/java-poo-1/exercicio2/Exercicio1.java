import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Exercicio1 {

    public static void main(String[] args) {
        double porcentagem = 0;
        int distancia = 0;
        Scanner dias_campanha = new Scanner(System.in);
        System.out.println("Digite o preco de fabricacao");
        int preco_custo = dias_campanha.nextInt();

        System.out.println("Fabrica 1 a 500KM de distancia e a taxa de envio de 7%");
        System.out.println("Fabrica 2 a 780KM de distancia e a taxa de envio de 15%");
        System.out.println("Fabrica 3 a 1200KM de distancia e a taxa de envio de 22%");

        Scanner fabrica = new Scanner(System.in);
        System.out.println("Digite a fabrica");
        int id_fabrica = fabrica.nextInt();


        if(id_fabrica == 1) {
            porcentagem = 0.7;
            distancia = 500;
        } else if(id_fabrica == 2) {
            porcentagem = 0.15;
            distancia = 780;
        } else if(id_fabrica == 3) {
            porcentagem = 0.22;
            distancia = 1200;
        }
        double custo_envio =  porcentagem * preco_custo;
        double produto_lucro = preco_custo + custo_envio;
        double custo_final = produto_lucro + (produto_lucro * 0.25) ;
        System.out.println("Valor do produto eh: "+NumberFormat.getCurrencyInstance(Locale.US).format(custo_final));
        System.out.println("voce escolheo a fabrica "+id_fabrica+" que fica ao uma distancia de "+distancia+"KM da SEDE.");
    }
}
