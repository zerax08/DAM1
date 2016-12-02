package ejercicios;

import java.util.Scanner;
import java.math.*;

public class sec03 {

	public static void main (String[] args){
		Scanner tecla = new Scanner (System.in);
		double x, y;
		
		System.out.println("-----------------");
		System.out.println("y=x^4+3*3-2x+1");
		System.out.println("-----------------");
		System.out.println("Dame x:");
		x = tecla.nextInt();
		
		y = Math.pow(x, 4)+3*3-2*x+1;
		
		System.out.println("-----------------");
		System.out.println("y = "+y);
		System.out.println("-----------------");
	}
}
