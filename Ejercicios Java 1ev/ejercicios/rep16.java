package ejercicios;

import java.util.Scanner;

public class rep16 {
	
	public static void main(String[] args){

		int n;
		String let;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("dame una letra: ");
		let=tecla.next();
		System.out.println("-----------------");
		for(int i = 0; i<10; i++){
			for(n = 0; n<10; n++){
				System.out.printf(let);
			}
			System.out.println();
			n=0;
		}

	}
}
