package ejercicios;

import java.util.Scanner;

public class rep04 {

	public static void main(String[] args){
		
		int min=999;
		int edad;
		
		Scanner tecla = new Scanner(System.in);
		for(int amigos=4;amigos>0;amigos--){
			
			System.out.println("Dame edad: ");
			edad = tecla.nextInt();
			
			if(edad<min){
				min=edad;
			}
		}
		System.out.println("---------------------------");
		System.out.println("El mas joves tiene: "+min+" años");
	}
}
