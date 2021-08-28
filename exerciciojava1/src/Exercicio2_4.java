import java.util.Random;
public class Exercicio2_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] cliente = new int[50][3];
        int jornalA = 0;
        int jornalB = 0;
        int jornalC = 0;
        int jornalABC = 0;
        int jornalAC = 0;
        int jornalAB = 0;
        int jornalBC = 0;
        int nenhum = 0;

        for (int i = 0; i < 50; i++) {
            for (int k = 0; k <= 2; k++) {
                int numerok = random.nextInt(3);
                cliente[i][k] = numerok;
            }


            int vetor0 = cliente[i][0];
            int vetor1 = cliente[i][1];
            int vetor2 = cliente[i][2];


            switch (vetor0){
                case 0: // primeiro A
                    switch (vetor1){
                        case 0:
                            switch (vetor2){
                                case 0:
                                    jornalA = jornalA+1; // A A A
                                    break;
                                case 1:
                                    jornalAB = jornalAB+1; // A A B
                                    break;
                                case 2:
                                    jornalAC =jornalAC+1; // A A C
                                    break;
                            }
                            break;
                        case 1: // Segundo B
                            switch (vetor2){
                                case 0: // terceiro A
                                    jornalAB = jornalAB+1; // A B A
                                    break;
                                case 1: // terceiro B
                                    jornalAB = jornalAB+1; // A B B
                                    break;
                                case 2: // Terceiro C
                                    jornalABC =jornalABC+1; // A B C
                                    break;
                            }

                            break;
                        case 2: // Segundo C
                            switch (vetor2){
                                case 0: // Terceiro A
                                    jornalAC = jornalAC+1; // A C A
                                    break;
                                case 1: // Terceiro B
                                    jornalABC = jornalABC+1;// A C B
                                    break;
                                case 2: // Terveiro C
                                    jornalAC =jornalAC+1; // A C C
                                    break;
                            }
                            break;
                    }

                    break;
                case 1: //primeiro B
                    switch (vetor1){
                        case 0: // segundo A
                            switch (vetor2){
                                case 0: // terceiro A
                                    jornalAB = jornalAB+1; // B A A
                                    break;
                                case 1: // terceiro B
                                    jornalAB = jornalAB+1;// B A B
                                    break;
                                case 2: // terceiro C
                                    jornalABC =jornalABC+1; // B A C
                                    break;
                            }

                            break;
                        case 1:// segundo B
                            switch (vetor2){
                                case 0: // terceiro A
                                    jornalAB = jornalAB+1; // B B A
                                    break;
                                case 1: // terceiro B
                                    jornalB = jornalB+1;// B B B
                                    break;
                                case 2: // terceiro C
                                    jornalBC =jornalBC+1; // B B C
                                    break;
                            }

                            break;
                        case 2: // segundo C
                            switch (vetor2){
                                case 0: // terceiro A
                                    jornalABC = jornalABC+1; // B C A
                                    break;
                                case 1: // terceiro B
                                    jornalBC = jornalBC+1;// B C B
                                    break;
                                case 2: // terceiro C
                                    jornalBC = jornalBC+1; // B C C
                                    break;
                            }
                            break;
                    }

                    break;
                case 2: // primeiro C
                    switch (vetor1){
                        case 0: // segundo A
                            switch (vetor2){
                                case 0: // terceiro A
                                    jornalAC = jornalAC+1; // C A A
                                    break;
                                case 1: // terceiro B
                                    jornalABC = jornalABC+1;// C A B
                                    break;
                                case 2: // terceiro C
                                    jornalAC =jornalAC+1; // C A C
                                    break;
                            }

                            break;
                        case 1: // segundo B
                            switch (vetor2){
                                case 0: // terceiro A
                                    jornalABC = jornalABC+1; // C B A
                                    break;
                                case 1: // terceiro B
                                    jornalBC = jornalBC+1;// C B B
                                    break;
                                case 2: // terceiro C
                                    jornalBC = jornalBC+1; // C B C
                                    break;
                            }

                            break;
                        case 2: // segundo C
                            switch (vetor2){
                                case 0: // terceiro A
                                    jornalAC = jornalAC+1; // C C A
                                    break;
                                case 1: // terceiro B
                                    jornalBC = jornalBC+1;// C C B
                                    break;
                                case 2: // terceiro C
                                    jornalC =jornalC+1; // C C C
                                    break;
                            }
                            break;
                    }

                    break;
            }



        }

        System.out.println("Sao assinate dos jornais A, B e C =" + jornalABC);
        System.out.println("Sao assinate dos jornais A e C    =" + jornalAC);
        System.out.println("Sao assinate dos jornais A e B    =" + jornalAB);
        System.out.println("Sao assinate dos jornais B e C    =" + jornalBC);
        System.out.println("Sao assinate dos jornais A        =" + jornalA);
        System.out.println("Sao assinate dos jornais B        =" + jornalB);
        System.out.println("Sao assinate dos jornais C        =" + jornalC);


}
    }
