package com.meli;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    HashMap<Integer, List<Roupa>> gavetas = new HashMap<>();
    private int chave = 0;

    public Integer guardarRoupa(List<Roupa> listaroupa){
        gavetas.put(++chave,listaroupa);
        return chave;
    }
    public List<Roupa> devolverRoupas(int cod){
        List<Roupa> listaeRoupas = gavetas.get(cod);
        gavetas.remove(cod);
        return listaeRoupas;
    }
    public void mostrarRoupas(){
        for (Integer cod: )
    }

}
