package ejercicios;

import java.util.Scanner;

public class rep08 {

	public static void main(String[]args){
		String letra;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame una letra: ");
		letra = tecla.next();
		System.out.println("-----------------");
		for(int fila=1;fila<3;fila++){
			System.out.printf("\n");
		}
		for(int colum=1;colum<10;colum++){
			System.out.printf("\t");
		}
		for(int i=1;i<10;i++){
			System.out.printf("%s",letra);
		}
	}
}
