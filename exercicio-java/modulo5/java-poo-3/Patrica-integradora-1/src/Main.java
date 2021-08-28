import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa(0,new HashMap<>());


        List<Roupa> cliente = new ArrayList<>();


        Roupa vestimenta1 = new Roupa("C&A","Cueca");
        Roupa vestimenta2 = new Roupa("Heringue","Camisa");
        Roupa vestimenta3 = new Roupa("Flamengo","Camiseta");
        Roupa vestimenta4 = new Roupa("Heringue","Camisa");



        cliente.add(vestimenta1);
        cliente.add(vestimenta2);
        cliente.add(vestimenta3);
        cliente.add(vestimenta4);



        Integer indiceDicionario = guardaRoupa.guardaRoupas(cliente);

        System.out.println(guardaRoupa.mostrarRoupas());
    }
}
