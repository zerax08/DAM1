package ejercicios;

import java.util.Scanner;

public class cond06 {
	
	public static void main(String[]args){
		int mes;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame un nº de mes: ");
		mes = tecla.nextInt();
		
		switch(mes){
		
			case 1:
				System.out.println("e");
				break;
			case 2:
				System.out.println("f");
				break;
			case 3:
				System.out.println("m");
				break;
			case 4:
				System.out.println("a");
				break;
			case 5:
				System.out.println("m");
				break;
			case 6:
				System.out.println("jn");
				break;
			case 7:
				System.out.println("jl");
				break;
			case 8:
				System.out.println("a");
				break;
			case 9:
				System.out.println("s");
				break;
			case 10:
				System.out.println("o");
				break;
			case 11:
				System.out.println("n");
				break;
			case 12:
				System.out.println("d");
				break;
			default: System.out.println("Error, ese mes no es valido");
							
		}
	
	}
}
