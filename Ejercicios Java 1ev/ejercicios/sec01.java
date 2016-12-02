package ejercicios;

import java.util.Scanner;

public class sec01 {

	public static void main(String[] args){
		Scanner tecla = new Scanner (System.in);
		String nombre;
		
		System.out.println("Dame tu nombre: ");
		nombre = tecla.next();
		
		System.out.println("\nHola "+nombre);
	}
}
