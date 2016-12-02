package ejercicios;
import java.util.Scanner;

public class sec08 {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int c = 0;
		float f = 0;
		
		System.out.println("Escribe los grados centigrados");
		c = s.nextInt();
		
		f=32+(9*(float)c/5);
		
		System.out.println("Los grados Fahrenheit de "+c+" grados son: "+f);
		
	}
	
	
	
	
}
