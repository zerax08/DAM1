package ejercicios;

import java.util.Scanner;

public class rep17 {
	public static void main(String[] args){

		int num,num1,opcion;
		float resul;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("dame un numero: ");
		num=tecla.nextInt();
		System.out.println("-----------------");
		System.out.println("dame otro numero: ");
		num1=tecla.nextInt();
		System.out.println("-----------------");
		System.out.println("¿que quieres hacer?");
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Acavar");
		System.out.println("Introduce una opcion: ");
		opcion=tecla.nextInt();
		
		switch(opcion){
		
		case 1: 
			resul = num + num1;
			System.out.println(num+" + "+num1+" = "+resul);
			break;
		case 2:
			resul = num - num1;
			System.out.println(num+" - "+num1+" = "+resul);
			break;
		case 3:
			resul = num * num1;
			System.out.println(num+" * "+num1+" = "+resul);
			break;
		case 4:
			resul = num / num1;
			System.out.println(num+" / "+num1+" = "+resul);
			break;
		case 5:
			return;
		default:
			System.out.println("Esa opcion no es correcta, cerrando el programa");
		}
	}
}
