package ejercicios;

import java.util.Scanner;

public class sec01 {
	
	
	public static void main(String[]args){
		
		Scanner tecla = new Scanner(System.in);
	
		int numero, min, sec;
		
		System.out.println("Escribe la hora");
		numero = tecla.nextInt();
		
		min = numero*60;
		sec = min*60;
		
		System.out.println("La Hora en minutos es de: "+min);
		System.out.println("La Hora en segundos es de: "+sec);
		
		
	}
}
