package ejercicios;

import java.util.Scanner;

public class cond04 {

	public static void main(String[]args){
		int mes;
		Scanner tecla = new Scanner(System.in);
		
		do{
			System.out.println("Dame un mes: ");
			mes = tecla.nextInt();
			if(mes<1||mes>12){
				System.out.println("Ese mes no es valido, introduce uno valido");
				System.out.println("------------------------------------------");
				continue;
			}
			break;
		}while(true);
		
		if(mes==12){
			mes=1;
		}else{
			mes++;
		}
	}
}
