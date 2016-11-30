package ejercicios;

import java.util.Scanner;

public class rep05 {

	public static void main(String[] args){
		
		int max=0;
		int est;
		
		Scanner tecla = new Scanner(System.in);
		for(int amigos=6;amigos>0;amigos--){
			
			System.out.println("Dame estatura: ");
			est = tecla.nextInt();
			
			if(est>max){
				max=est;
			}
		}
		System.out.println("---------------------------");
		System.out.println("El mas alto mide: "+max+"cm");
	}
}
