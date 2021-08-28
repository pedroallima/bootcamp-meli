import java.util.Scanner;

public class Exercicio2_3 {
    public static void main(String[] args) {
        int[] cliente = new int[7];
        int fatura;

        System.out.println("Serviço 1: Segurança com câmeras - Preço fixo de US $ 1.500 por mês");
        System.out.println("Serviço 2: Câmera de segurança + patrulha - Preço de $ 1500 + $ 700");

        for(int i = 0; i< 7;i++){
            Scanner dias_campanha = new Scanner(System.in);
            System.out.println("Digite o servico do funcionario "+(i+1));
            cliente[i] = dias_campanha.nextInt();

        }
        for(int i = 0; i< 7;i++) {
            int valor = cliente[i];
            if(valor == 1){
                fatura = 1500;
            }else{
                fatura = 1500+700;
            }

            System.out.println("Valor do Cliente "+(i+1)+" tem a fatura de "+fatura);
        }

    }
}
