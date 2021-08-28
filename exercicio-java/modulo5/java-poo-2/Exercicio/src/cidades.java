public class cidades {
    public static void main(String[] args) {
        String[] cidades = {"Londres","Madrid","Nova York","Buenos Aires","Asuncion","Sao Paulo","Lima","Santiado de Chile","Lisboa","Tokyo"};
        int[][] temperaturas = {{-2,33}, {-3,32}, {-8,27}, {4,37}, {6,42}, {5,43}, {0,39}, {-7,26}, {-1,31}, {-10,35}};
        for (int i = 0; i < cidades.length; i++){
            System.out.println(cidades[i]+" "+temperaturas[i][0] + " "+ temperaturas[i][1]);
        }
    }
}