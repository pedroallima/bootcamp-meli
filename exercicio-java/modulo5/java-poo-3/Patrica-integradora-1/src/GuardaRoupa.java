import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    private Integer contador;
    HashMap<Integer, List<Roupa>> dicionario;

    public GuardaRoupa() {
    }

    public GuardaRoupa(Integer contador, HashMap<Integer, List<Roupa>> dicionario) {
        this.contador = contador;
        this.dicionario = dicionario;
    }
    public Integer guardaRoupas(List<Roupa> listaDeRoupas){
        contador = contador +1;
        dicionario.put(contador, listaDeRoupas);
        return contador;
    }

    public String mostrarRoupas(){
        return "" + "contador=" + contador + ", dicionario=" + dicionario;
    }


}