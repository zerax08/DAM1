package ejercicios;
import java.util.Scanner;

public class rep06 {

	public static void main(String[] args){
		
		float count=0, est, media=0, peso;
		Scanner tecla = new Scanner(System.in);
		
		for(int amigos=5;amigos>0;amigos--){
			
			System.out.println("Dame peso: ");
			peso = tecla.nextInt();
			media = media+peso;
			count++;
		
		}
		media = media/count;
		
		System.out.println("---------------------------");
		System.out.println("la media de peso es de: "+media+"kg");
	}
}
