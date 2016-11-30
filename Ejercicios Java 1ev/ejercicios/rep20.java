package ejercicios;

import java.util.Scanner;

public class rep20 {

	public static void main(String[] args){

		int d1=1, d2=0, m1=1, m2=0,a1=1950, a2, a3, a4, s1, s2;
		do{
			
			Scanner tecla = new Scanner(System.in);
			
			System.out.println("Dame tu dia de nacimiento");
			
			d1 = tecla.nextInt();
			
			System.out.println("Dame tu mes de nacimiento");
			
			m1 = tecla.nextInt();
			
			System.out.println("Dame tu año de nacimiento");
			
			a1 = tecla.nextInt();
			
			if(d1>31&&d1<1 || m1>12&&m1<1 || a1<1930&&a1>2016){
				System.out.println("Esa fecha no es reglamentaria");
				continue;
			}
			
			break;
			
		}while(true);
		
		a1 = a1+m1+d1;
		
		a2 = (a1/100)%10;
		a3 = (a1/10)%10;
		a4 = a1%10;
		a1 = a1/1000;
		
		s1 = d1+d2+m1+m2+a1+a2+a3+a4;
		s2 = s1%10;
		s1 = s1/10;
		System.out.println("El numero de la suerte es: "+(s1+s2));
	}
}