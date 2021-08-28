package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        lerArquivo("Teste");

    }
    public static void lerArquivo(String novoArquivo)  {


        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(novoArquivo));

            while ((texto = bufferedReader.readLine()) != null){
                System.out.println(texto);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("O arquivo especificado não foi  encontrado");

        }
        catch (IOException ex ){
            System.out.println("Erro ao ler arquivo especificado");

        }
    }
}
