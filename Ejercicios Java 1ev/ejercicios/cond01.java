package ejercicios;
import java.util.*;

public class cond01 {
	
	public static void main(String[]args){
		int num1,num2;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame un numero: ");
		num1 = tecla.nextInt();
		
		System.out.println("Dame otro numero: ");
		num2 = tecla.nextInt();
		
		if(num1>num2){
			System.out.println("El primer numero es mas alto");
		}else{
			System.out.println("El segundo numero es mas alto");
		}
		
	}
}
