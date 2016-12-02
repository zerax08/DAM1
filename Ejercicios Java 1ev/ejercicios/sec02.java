package ejercicios;

import java.util.Scanner;

public class sec02 {

	public static void main (String[] args){
		Scanner tecla = new Scanner(System.in);
		int base, altura, area;
		
		System.out.println("Dame la base del triangulo:");
		base = tecla.nextInt();
		
		System.out.println("\nDame la altura del triangulo:");
		altura = tecla.nextInt();
		
		area = base*altura/2;
		
		System.out.println("\nEl area del triangulo es: "+area);
	}
}
