package com.meli;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import com.meli.*;

public class MainCrud2 {

	public static void main(String[] args) throws IOException {


		
		// CrudCSV(String path, String delimiter)
		// CrudCSV(String path)

		CrudCSV db = new CrudCSV("db/Funcionario.csv");


		//Para pesquisar no arquivo e imprimir todos os resultados (por padrão, a primeira coluna é a coluna INTEGER PRIMARE_KEY):
		// Map<Integer, String[]> search(String column, String value)
		// Map<Integer, String[]> search(String column, int value)

		Map<Integer,String[]> results = db.search("first_name", "Phil");
		for (String[] result : results.values()){
			System.out.println(Arrays.toString(result));
		}

		// Inserir uma linha
		// Boolean insert(String[] value)
		String[] values = {"Jason", "Heinlen", "heinlenjas@example.com", "Male"};
		db.insert(values);


		// Para Alterar
		// Boolean alter(int id, String[] value)
		// Boolean alter(int id, String column, String value)

		db.alter(1002, "email", "JasonH@example.com");

		// Exluir
		// Boolean delete(int id)

		db.delete(1002);


	}
}
