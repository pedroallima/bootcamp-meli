package com.meli;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

	Scanner strInput = new Scanner(System.in);
            String choice,cont = "s";

            while( cont.equalsIgnoreCase("s") ) {
            	   System.out.println("\t\t Sistema de Informação do Empregado\n\n");

    	        System.out.println("1 ===> Adicionar Funcionário");
    	        System.out.println("2 ===> Ver Funcionários ");
    	        System.out.println("3 ===> Excluir Funcionário ");
    	        System.out.println("4 ===> Pesquisar Funcionario ");
    	        System.out.println("5 ===> Atualizar Funcionario");

    	        System.out.print("\n\n");
    	        System.out.println("Escolha uma opcao: ");
    	        choice = strInput.nextLine();

    	        if( choice.equals("1") ) {
					Crud.AddRecord();
    	        } else if( choice.equals("2") ) {
					Crud.ViewAllRecord();
    	        } else if( choice.equals("3") ) {
					Crud.DeleteRecordByID();
    	        }	else if( choice.equals("4") ) {
					Crud.SearchRecordbyID();
    	        }	else if( choice.equals("5") ) {
					Crud.updateRecordbyID();
    	        }

    	        System.out.println("Deseja Continuar? S/N");
    	        cont = strInput.nextLine();

            }
    }

}
