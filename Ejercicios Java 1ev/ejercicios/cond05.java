package ejercicios;

import java.util.Scanner;

public class cond05 {

	public static void main(String[]args){
		int nota;
		Scanner tecla = new Scanner(System.in);
		
		do{
			
			System.out.println("Dame una nota: ");
			nota = tecla.nextInt();
			if(nota<0||nota>10){
				System.out.println("Esa nota no es valida, introduce una valida");
				System.out.println("------------------------------------------");
				continue;
			}
			break;
		}while(true);
		
		if(nota<5){
			System.out.println("El primer numero es mas alto");
		}else if(nota==5|nota==6){
			System.out.println("La nota es un aprovado");
		}else if(nota==7||nota==8){
			System.out.println("La nota es un notable");
		}else{
			System.out.println("La nota es un sobresaliente");
		}
	}
}
