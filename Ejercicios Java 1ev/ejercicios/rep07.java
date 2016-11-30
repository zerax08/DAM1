package ejercicios;

import java.util.Scanner;

public class rep07 {

	public static void main(String[]args){
		int num;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame un numero: ");
		num = tecla.nextInt();
		System.out.println("-----------------");
		for(int i=1;i<=10;i++){
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}
