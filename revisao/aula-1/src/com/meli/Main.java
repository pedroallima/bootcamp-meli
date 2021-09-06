package com.meli;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Casa casaArray[] = new Casa[4];

        casaArray[0] = new Casa(1,2,3,"Casa do Gugu");
        casaArray[1] = new Casa(1,2,3,"Casa da Xuxa");
        casaArray[2] = new Casa(1,2,3,"Casa do Neymar");
        casaArray[3] = new Casa(1,2,3,"Casa do Silvio Santos");
        
        System.out.println(casaArray[0]);
        System.out.println(casaArray[1]);
        System.out.println(casaArray[2]);
        System.out.println(casaArray[3]);
    }
}
