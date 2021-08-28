import java.util.Random;
public class Exercicio243 {
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
                int numerok = random.nextInt(2);
                cliente[i][k] = numerok;
            }


            int vetor0 = cliente[i][0];
            int vetor1 = cliente[i][1];
            int vetor2 = cliente[i][2];

            System.out.println("Participante "+i+":: |"+vetor0+"| |"+vetor1+"| |"+vetor2+"|");

            switch (vetor0){
                case 0: // NAO MARCOU A
                    switch (vetor1){
                        case 0: //NAO MARCOU B
                            switch (vetor2){
                                case 0: // NAO MARCOU C
                                    nenhum = nenhum + 1; // X X X// false false false
                                    break;
                                case 1: // MARCOU C
                                    jornalC = jornalC + 1; // X X C
                                    break;
                            }
                            break;
                        case 1: // MARCOU B
                            switch (vetor2){
                                case 0: // NAO MARCOU C
                                    jornalB = jornalB + 1; // X B X
                                    break;
                                case 1: // MARCOU C
                                    jornalBC = jornalBC + 1; // X B C
                                    break;
                            }

                            break;
                    }

                    break;
                case 1: //MARCOU A
                    switch (vetor1){
                        case 0: // NAO MARCOU B
                            switch (vetor2){
                                case 0: // NAO MARCOU C
                                    jornalA = jornalA+1; // A X X
                                    break;
                                case 1: // MARCOU C
                                    jornalBC = jornalBC+1;// B X C
                                    break;
                            }

                            break;
                        case 1:// MARCOU  B
                            switch (vetor2){
                                case 0: // NAO MARCOU C
                                    jornalAB = jornalAB+1; // A B X
                                    break;
                                case 1: // MARCOU C
                                    jornalABC = jornalABC+1;// A B C
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

