package ejercicios;

import java.util.Scanner;

public class rep205 {
	public static void main(String[] args) {
		
		int num, resul=1;
		Scanner tecla = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		num=tecla.nextInt();
		
		for(;num>1;num--){
			resul = resul*num;
		}
		System.out.println("Su numero factorial es: "+resul);
	}
}
