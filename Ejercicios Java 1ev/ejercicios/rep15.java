package ejercicios;

import java.util.Scanner;

public class rep15 {
	
	public static void main(String[] args){

		int num,num1;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("dame un numero: ");
		num=tecla.nextInt();
		System.out.println("\n\n\n\n\n\n\n");
		System.out.println("-----------------");
		System.out.println("dame un numero: ");
		num1=tecla.nextInt();
		
		
		while(num!=num1){
			
			if(num>num1){
				System.out.println("te has quedado corto");
			}else{
				System.out.println("te has pasado");
			}
			System.out.println("-------------------");
			System.out.println("intentalo denuevo: ");
			num1=tecla.nextInt();
		}
		System.out.println("Has acertado!");
	}
}
