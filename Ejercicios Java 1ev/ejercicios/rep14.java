package ejercicios;

import java.util.Scanner;

public class rep14 {

	public static void main(String[] args){
		int num, count=0, media=0;
		Scanner tecla = new Scanner(System.in);
		
		do{
			System.out.println("Dame numero: ");
			num = tecla.nextInt();
			System.out.println("----------------");
			
			media = media + num;
			count++;
			
		}while(num!=0);
		
		media = media/(count-1);
		
		System.out.println("La media de los numeros es: " +  media);
	}
}
