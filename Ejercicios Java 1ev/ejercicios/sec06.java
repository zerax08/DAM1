package ejercicios;
import java.util.Scanner;

public class sec06 {

	public static void main(String[]args){
		Scanner tecla = new Scanner(System.in);
		
		int numero,result1,result2;
		
		System.out.println("Escribe un numero de dos cifras");
		numero = tecla.nextInt();
		
		result1 = numero/10;
		result2=numero%10;
		
		if (result1%2 == 0){
			System.out.println("El numero "+result1+" De el numero "+numero+" Es par");
		}else{
			System.out.println("El numero "+result1+" De el numero "+numero+" Es impar");
		}
		
		if (result2%2 == 0){
			System.out.println("El numero "+result2+" De el numero "+numero+" Es par");
		}else{
			System.out.println("El numero "+result2+" De el numero "+numero+" Es impar");
		}
		
	}
}
