import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class todos {

    public static void main(String[] args) {
        // Exercicios do Laboratorio dia 20/08/2021
        // Menu principal

        int vOpcao = 0;

        do {
            System.out.printf("Escolha o Exercicio 1 a 4 (99 para Sair):");
            Scanner scanner = new Scanner(System.in);
            vOpcao = scanner.nextInt();

            switch (vOpcao){
                case 1: // Exercicio 1
                    Exercicio1();
                    break;
                case 2: // Exercicio 2
                    Exercicio2();
                    break;
                case 3: // Exercicio 3
                    Exercicio3();
                    break;
                case 4: // Exercicio 4
                    Exercicio4();
                    break;
                case 99: // Opcao incorreta
                    System.out.println("########## Fim de Programa ##########");
                    break;
                default: // Opcao incorreta
                    System.out.printf(">>>> Opcao Incorreta!");
            }


        } while (vOpcao != 99);


    }

    public static void Exercicio1() {

        System.out.println("INICIO - ########## Exercicio 01 ########## ");

        //---------------------------------------------
        System.out.printf("Digite Valor Custo:");
        //-- Captura da Custo
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        scanner.useDelimiter(",");

        double vCusto = scanner.nextDouble();

        int vFabrica = 0;
        double vPercEnvio = 0;

        do {
            //---------------------------------------------
            System.out.printf("Digite o Cod da Fabrica (1 ate 3):");
            //-- Captura da Fabrica
            Scanner scanner2 = new Scanner(System.in);
            scanner2.useLocale(Locale.US);

            vFabrica = scanner2.nextInt();


            switch (vFabrica) {
                case 1: // Fabrica 1
                    vPercEnvio = 0.7;
                    break;
                case 2: // Exercicio 2
                    vPercEnvio = 0.15;
                    break;
                case 3: // Exercicio 3
                    vPercEnvio = 0.22;
                    break;
                default: // Opcao incorreta
                    System.out.println("Opcao Incorreta!");
            }
        } while (vFabrica == 0);

        // -- Calculo % Envio
        double vValorEnvio = vCusto * vPercEnvio;

        // -- Print do Calculo
        System.out.println("Valor de Envio: " + vValorEnvio);

        // -- Adicionando o Custo do Envip no Custo Total
        vCusto = vCusto + vValorEnvio;

        double vPercLucro = 00.25;

        // -- Adionando Lucro
        double vLucro = vCusto * vPercLucro;

        // -- Print do Lucro
        System.out.println("Valor de Lucro: " + vLucro);

        //--- Retorno do Calculo Final
        System.out.println("Valor de Final: " + (vCusto + vLucro));
        System.out.println("########## FIM - Exercicio 01 ########## ");
    }


    public static void Exercicio2() {

        System.out.println("INICIO - ########## Exercicio 02 ########## ");

        //---------------------------------------------
        System.out.printf("Digite RG:");
        //-- Captura da RG
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);


        String vRG = scanner.next();

        //--------------------------------------------
        System.out.printf("Digite Salario Formato 00.00:");
        //-- Captura da RG
        Scanner scanners = new Scanner(System.in);
        scanners.useLocale(Locale.US);


        double vSalario = scanner.nextDouble();
        double vPercentual = 0;
        double vAumento = 0;

        if (vSalario <= 20000.00) {
            vPercentual = 0.20;
        } else if (vSalario > 20000.00 && vSalario <= 45000.00 ){
            vPercentual = 0.10;
        } else if (vSalario > 45000.00) {
            vPercentual = 0.05;
        }

        vAumento = vSalario * vPercentual;

        System.out.println("Funcionario: " + vRG );
        System.out.println("Salario: " + vSalario );
        System.out.println("Percentual Autorizado: " + (vPercentual * 100) + "%");
        System.out.println("Valor Autorizado: " + vAumento);
        //--- Retorno do Calculo Final
        System.out.println("Valor de Final: " + (vSalario + vAumento));
        System.out.println("########## FIM - Exercicio 02 ########## ");
    }

    public static void Exercicio3() {
        System.out.println("INICIO - ########## Exercicio 03 ########## ");

        Random random = new Random();
        int vClientes = 6;
        int vPlano = 0;
        double vValorServ1 = 1500.00, vValorServ2 = 700.00;
        String vServ1 = "Segurança com câmeras / Preço fixo de US $ 1.500 por mês",
                vServ2 = "Câmera de segurança + patrulha / Preço de $ 1500 + $ 700 para serviço de patrulha";

        System.out.println("########## Cliente  -   Servico -   Total ########## ");
        for (int i = 0;i <= vClientes;i++){
            vPlano = random.nextInt(2)+1;

            if (vPlano == 1){
                System.out.println("########## " + i + "  -   " +  vServ1 + "   -   " + vValorServ1 + " ########## ");
            } else {
                System.out.println("########## " + i + "  -   " +  vServ2 + "   -   " + (vValorServ1 + vValorServ2) +" ########## ");
            }


        }
        System.out.println("########## FIM - Exercicio 03 ########## ");
    }

    public static void Exercicio4() {
        System.out.println("########## INICIO - Exercicio 04 ########## ");

        int vContadorABC = 0,
                vContadorAB = 0,
                vContadorAC = 0,
                vContadorA = 0,
                vContadorB = 0,
                vContadorBC = 0,
                vContadorC = 0;

        String vResposta = "";


        for(int i=1;i<=50;i++){
            System.out.printf("Digite o Jornal do Leitor " + i + " Ex. ABC:");
            //-- Captura da Fabrica
            Scanner scanner = new Scanner(System.in);

            vResposta = scanner.next().toUpperCase();

            /// -- Assinantes do A
            if (vResposta.equals("A")) {
                vContadorA++;
            }

            /// -- Assinantes do AB
            if (vResposta.equals("AB")) {
                vContadorAB++;
            }

            /// -- Assinantes do AC
            if (vResposta.equals("AC")) {
                vContadorAC++;
            }
            //------------------------------------------------------------------------------------------------

            /// -- Assinantes do B
            if (vResposta.equals("B")) {
                vContadorB++;
            }

            /// -- Assinantes do BC
            if (vResposta.equals("BC")) {
                vContadorBC++;
            }
            //------------------------------------------------------------------------------------------------

            /// -- Assinantes do C
            if (vResposta.equals("C")) {
                vContadorC++;
            }
            //------------------------------------------------------------------------------------------------

            /// -- Assinantes do ABC
            if (vResposta.equals("ABC")) {
                vContadorABC++;
            }
            //------------------------------------------------------------------------------------------------
        }

        System.out.println("#########################################");
        System.out.println("### Total Assinantes dos 3 Jornais - " + (vContadorABC) + " ####");
        System.out.println("### Total Assinantes Diarios A     - " + vContadorA + " ####");
        System.out.println("### Total Assinantes Diarios AB    - " + (vContadorAB) + " ####");
        System.out.println("### Total Assinantes Diarios AC    - " + (vContadorAC) + " ####");

        System.out.println("### Total Assinantes Diarios B     - " + vContadorB + " ####");
        System.out.println("### Total Assinantes Diarios BC    - " + (vContadorBC) + " ####");

        System.out.println("### Total Assinantes Diarios C     - " + vContadorB + " ####");

        System.out.println("#########################################");

        System.out.println("########## FIM - Exercicio 04 ########## ");
    }
}
