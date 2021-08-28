import java.util.*;

public class Poo2_exe_tarde_02 {
    public static void main(String[] args) {

        int vOpcao = 0;
        int cont = 0;
        String[] documentos = {"ïd","Circuito","RG","nome","sobrenome","idade","telefone","celular","número de emergência","grupo sanguíne"};

       // HashMap<String, HashMap<String, String> > formulario = new HashMap<>();

        List<List<String>> formulario = new ArrayList<>();
        formulario.add(new ArrayList<>());
       // c.get(0).add("a");
        //c.get(0).add("b");
       // c.get(0).add("c");
       // c.get(1).add("x");



        System.out.println("( 1 ) Registro de pequeno circuito: menores de 18 anos $ 1300. Acima de 18 anos $ 1.500.");
        System.out.println("( 2 ) Registro de circuito médio: menores de 18 anos $ 2.000. Acima de 18 anos $ 2.300.");
        System.out.println("( 3 ) Registro de circuito médio: menores de 18 anos $ 2.000. Acima de 18 anos $ 2.300.");


        do {


            for (int index = 1; index < documentos.length; index++) {

                formulario.get(0).add(String.valueOf(index));

                Scanner ext_documento = new Scanner(System.in);
                System.out.format("Digite o  seu %s: ",documentos[index]);
                String doc_formulario = String.valueOf(ext_documento.next());
               // formulario.put(documentos[index],doc_formulario);
                formulario.get(cont).add(doc_formulario);

            }

            System.out.printf("Se quiser finalizar o cadastro e so digitar 99 para Sair, caso cotrario digite qualquer valor):");
            Scanner scanner = new Scanner(System.in);
            vOpcao = scanner.nextInt();

            cont = cont+1;

        } while (vOpcao != 99);
        System.out.println(formulario);

    }


}
