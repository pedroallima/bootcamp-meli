import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_2 {
    public static void main(String[] args) {
        double aumento = 0;
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite o preco de fabricacao");
        int salario_funcionario = salario.nextInt();


        if(salario_funcionario<=20000) {
            aumento = 0.20;
        } else if(salario_funcionario > 20000 && salario_funcionario <= 45000) {
            aumento = 0.10;
        } else if(salario_funcionario > 45000) {
            aumento = 0.5;
        }
        double novo_salario = salario_funcionario + (salario_funcionario * aumento);

        String salario_funcionario2 = String.valueOf(NumberFormat.getCurrencyInstance(Locale.US).format(salario_funcionario));
        String novo_salario2 = String.valueOf(NumberFormat.getCurrencyInstance(Locale.US).format(novo_salario));

        System.out.println("Parabens!!! seu salario aumentou de "+salario_funcionario2+" para "+novo_salario2);
    }
}
