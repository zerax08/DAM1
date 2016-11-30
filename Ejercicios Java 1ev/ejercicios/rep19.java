package ejercicios;
import java.util.Scanner;

public class rep19 {

	public static void main(String[] args){

		int num, count=1;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame un numero: ");
		
		num = tecla.nextInt();
		
		while(num>10){
			num = num/10;
			count++;
		}
		System.out.println("es un numero de: "+count+" cifras");
	}
}