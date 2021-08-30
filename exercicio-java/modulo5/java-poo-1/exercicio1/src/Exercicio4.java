//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio4 {
    public Exercicio4() {
    }

    public static void main(String[] var0) {
        double var1 = 2.3563899E7D;
        double var3 = 0.0245D;
        double var5 = 0.15D;
        double var7 = 0.3D;
        double var9 = 0.0D;
        System.out.println("Parabens voce ganhou: 23.563.899");
        double var11 = var1 * var3;
        double var13 = var1 * var5;
        double var15 = var1 * var7;
        System.out.println("O 1 desconto de 2.45%, retirou = " + NumberFormat.getCurrencyInstance(Locale.US).format(var11));
        System.out.println("O 2 desconto de 15%, retirou = " + NumberFormat.getCurrencyInstance(Locale.US).format(var13));
        System.out.println("O 3 desconto de 3%, retirou = " + NumberFormat.getCurrencyInstance(Locale.US).format(var15));
        var9 = var1 - (var11 + var13 + var15);
        System.out.println("Total de Desconto: " + NumberFormat.getCurrencyInstance(Locale.US).format((var11 + var13 + var15)));
        System.out.println("---------------------------------------------");
        System.out.println("Seu saldo Liguido eh: " + NumberFormat.getCurrencyInstance(Locale.US).format(var9));
    }
}
