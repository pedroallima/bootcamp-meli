public class temperaturaCidade {
    public static void main(String[] args) {
        String[][] cidades = {
                {"Londres","-2","33"},
                {"Madrid","-2","33"},
                {"Nueva York","-2","33"},
                {"Buenos Aires","-2","33"},
                {"Asunción","-2","33"},
                {"São Paulo","-2","33"},
                {"Lima","-2","33"},
                {"Santiago de Chile","-2","33"},
                {"Lisboa", "-2", "33"},
                {"Tokio","-2","33"}
        };

        for (int indice =0;indice < cidades.length;indice++){
            System.out.println("Cidade:"+cidades[indice][0]+" Minima "+cidades[indice][1]+" Maxima "+cidades[indice][2]);

        }
    }

}
