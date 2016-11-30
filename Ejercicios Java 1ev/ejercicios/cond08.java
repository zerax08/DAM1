package ejercicios;

import java.util.Scanner;

public class cond08 {
	
	public static void main(String[]args){
		int opcion;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("----\n");
		System.out.println("1.- Musica");
		System.out.println("2.- Cine");
		System.out.println("3.- Teatro");
		System.out.println("4.- Radio");
		System.out.println("5.- Futbol\n");
		System.out.println("---------------------\n");
		
		System.out.println("Dame una opcion: ");
		opcion = tecla.nextInt();
		
		switch(opcion){
		
			case 1:
				System.out.println("Has elegido Musica:");
				System.out.println("Musicas de moda: music1, music2, music3");
				break;
			case 2:
				System.out.println("Has elegido Cine:");
				System.out.println("Cartelera actual: Pratata, El wombat y Gramilgos");
				break;
			case 3:
				System.out.println("Has elegido Teatro:");
				System.out.println("No hay teatros disponibles en estos momentos");
				break;
			case 4:
				System.out.println("Has elegido Radio:");
				System.out.println("Radio activada");
				break;
			case 5:
				System.out.println("Has elegido Futbol:");
				System.out.println("Proximo partido: fnc contra royal");
				break;
			default: System.out.println("Esa opcion es incorrecta");
		}

	}
}
