package com.meli;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Crud {

    public static void AddRecord() throws IOException {

        		BufferedWriter bw = new BufferedWriter( new FileWriter("db/Funcionario.csv",true) );
        		Scanner strInput = new Scanner(System.in);

        		String ID, name, age, addr;

        		System.out.print("Insira o ID do funcionário: ");
        		ID = strInput.nextLine();
        		System.out.print("Digite o nome do funcionário: ");
        		name = strInput.nextLine();
        		System.out.print("EEntre a Idade do Funcionário: ");
        		age = strInput.nextLine();
        		System.out.print("Digite o endereço do funcionário: ");
        		addr = strInput.nextLine();

        		bw.write(ID+";"+name+";"+age+";"+addr);
        		bw.flush();
        		bw.newLine();
        		bw.close();

        }

    public static void ViewAllRecord() throws IOException {
                BufferedReader br = new BufferedReader( new FileReader("db/Funcionario.csv") );

                String record;


                while( ( record = br.readLine() ) != null ) {

                    StringTokenizer st = new StringTokenizer(record,";");

                    System.out.println(st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken());

                }

                br.close();

            }

    public static void DeleteRecordByID() throws IOException {
                		Scanner strInput =  new Scanner(System.in);
                		String ID, record;


                		File tempDB = new File("db/Funcionario_temp.csv");
                		File db = new File("db/Funcionario.csv");


                		BufferedReader br = new BufferedReader( new FileReader( db ) );
                		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );

                		System.out.println("\t\t Excluir Registro de Funcionário\n");

                		System.out.println("Insira o ID do funcionário: ");
                		ID =  strInput.nextLine();

                		while( ( record = br.readLine() ) != null ) {
                			if( record.contains(ID) )
                				continue;
                			bw.write(record);
                			bw.flush();
                			bw.newLine();
                		}
                		br.close();
                		bw.close();

                		db.delete();
                		tempDB.renameTo(db);

                }

	public static void SearchRecordbyID() throws IOException {
                    		String ID,record;
                    		Scanner strInput = new Scanner(System.in);

                    		BufferedReader br = new BufferedReader( new FileReader("db/Funcionario.csv") );

                    		System.out.println("\t\t Pesquisar registro de funcionário\n");


                    		System.out.println("Insira o ID do funcionário: ");
                    		ID = strInput.nextLine();


                    		while( ( record = br.readLine() ) != null ) {

                    			StringTokenizer st = new StringTokenizer(record,";");
                    			if( record.contains(ID) ) {
                    				System.out.println(st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      ");
                    			}

                    		}


                    		br.close();



                    }

	public static void updateRecordbyID() throws IOException {
		String newName, newAge, newAddr, record, ID,record2;

		File db = new File("db/Funcionario.csv");
		File tempDB = new File("db/Funcionario_temp.csv");

		BufferedReader br = new BufferedReader( new FileReader(db) );
		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );

		Scanner strInput = new Scanner(System.in);

		System.out.println("\t\t Registro Atualizado\n\n");
		/****/
		System.out.println("Insira o ID do funcionário: ");
		ID = strInput.nextLine();


		while( ( record = br.readLine() ) != null ) {

			StringTokenizer st = new StringTokenizer(record,";");
			if( record.contains(ID) ) {
				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
			}

		}

		br.close();
		/****/
		System.out.println("Digite o Nome: ");
		newName = strInput.nextLine();
		System.out.println("Digite o ano: ");
		newAge = strInput.nextLine();
		System.out.println("Digite o endereco: ");
		newAddr = strInput.nextLine();

		BufferedReader br2 = new BufferedReader( new FileReader(db) );

		while( (record2 = br2.readLine() ) != null ) {
			if(record2.contains(ID)) {
				bw.write(ID+";"+newName+";"+newAge+";"+newAddr);
			} else {

				bw.write(record2);
			}
			bw.flush();
			bw.newLine();
		}

		bw.close();
		br2.close();
		db.delete();
		boolean success = tempDB.renameTo(db);
		System.out.println(success);

	}

}

