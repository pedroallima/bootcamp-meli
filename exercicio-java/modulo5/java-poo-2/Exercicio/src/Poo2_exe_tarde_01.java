import java.util.HashMap;
import java.util.Scanner;

public class Poo2_exe_tarde_01 {
    public static void main(String[] args) {

        int vOpcao = 0;
        String[] documentos = {"Circuito","RG","nome","sobrenome","idade","telefone","celular","número de emergência","grupo sanguíne"};

        HashMap<String, String> formulario = new HashMap<>();

        System.out.println("( 1 ) Registro de pequeno circuito: menores de 18 anos $ 1300. Acima de 18 anos $ 1.500.");
        System.out.println("( 2 ) Registro de circuito médio: menores de 18 anos $ 2.000. Acima de 18 anos $ 2.300.");


        do {



            for (int index = 0; index < documentos.length; index++) {
                // E maior de idade

                    Scanner ext_documento = new Scanner(System.in);
                    System.out.format("Digite o  seu %s: ",documentos[index]);
                    String doc_formulario = String.valueOf(ext_documento.next());
                    formulario.put(documentos[index],doc_formulario);
                    }

            System.out.printf("Se quiser finalizar o cadastro e so digitar 99 para Sair, caso cotrario digite qualquer valor):");
            Scanner scanner = new Scanner(System.in);
            vOpcao = scanner.nextInt();

        } while (vOpcao != 99);
        System.out.println(formulario);

    }

}
