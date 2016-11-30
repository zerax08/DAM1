package ejercicios;

import java.util.Scanner;

public class cond02 {
	public static void main(String[]args){
		int edad;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame la edad: ");
		edad = tecla.nextInt();
		
		if(edad>65){
			System.out.println("Es juvilado");
		}else if(edad>35){
			System.out.println("Es adulto");
		}else{
			System.out.println("Es joven");
		}
	}
}
