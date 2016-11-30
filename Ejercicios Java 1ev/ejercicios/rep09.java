package ejercicios;

import java.util.Scanner;

public class rep09 {

	public static void main(String[]args){
		String letra;
		int colum;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame una letra: ");
		letra = tecla.next();
		System.out.println("-----------------");
		for(int fila=1;fila<20;fila++){
			System.out.printf("\n");
		}
		for(int i=1;i<10;i++){
			for(colum=1;colum<5;colum++){
				System.out.printf("\t");
			}
			System.out.printf("%s\n",letra);
			colum=0;
		}
	}
}