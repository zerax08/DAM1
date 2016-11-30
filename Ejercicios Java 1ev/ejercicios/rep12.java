package ejercicios;

import java.util.Scanner;

public class rep12 {
	public static void main(String[]args){
		float altura, peso, resul=0;
		String genero;
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame la altura: ");
		altura = tecla.nextFloat();
		System.out.println("Dame el peso: ");
		peso = tecla.nextFloat();
		System.out.println("---------------------");
		
		altura=altura/100;
		resul=peso/(altura*altura);
		
		if(resul<18.5){
			System.out.println("Bajo peso");
		}else if(resul<24.9){
			System.out.println("Normapeso");
		}else if(resul<26.9){
			System.out.println("Sobrepeso grado I");
		}else if(resul<29.9){
			System.out.println("Sobrepeso grado II");
		}else if(resul<34.9){
			System.out.println("Obesidad tipo I");
		}else if(resul<39.9){
			System.out.println("Obesidad tipo II");
		}else if(resul<49.9){
			System.out.println("Obesidad tipo III (morbida)");
		}else{
			System.out.println("Obesidad tipo I (extrema)");
		}
	}
}
