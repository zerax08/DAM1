package ejercicios;
import java.util.Scanner;

public class rep18 {
	
	public static void main(String[]args){
		
		Scanner tecla = new Scanner(System.in);
		int dia,mes;
		
		System.out.println("Dime el dia en el que naciste");
		dia=tecla.nextInt();
		if(dia>31){
			System.out.println("Te has confundido");
			return;
		}
		System.out.println("Dime el mes");
		mes=tecla.nextInt();
		if(mes>12){
			System.out.println("Te has confundido");
			return;
		}
		
		if(dia>=21 && mes==3 || dia<=20 && mes==4){
			System.out.println("Aries");
			
		}else if(dia>=21 && mes == 4 || dia<=21 && mes == 5){
			System.out.println("Tauro");
			
		}else if(dia>=22 && mes == 5 || dia <=21 && mes==6){
			System.out.println("Geminis");
			
		}else if(dia>=21 && mes==6 || dia<=23 && mes==7){
			System.out.println("Cancer");
			
		}else if(dia>=24 && mes == 7 || dia<=23 && mes==8){
			System.out.println("Leo");
			
		}else if(dia>=24 && mes == 8 || dia<=23 && mes==9){
			System.out.println("Virgo");
			
		}else if(dia>=24 && mes == 9 || dia<=23 && mes==10){
			System.out.println("Libra");
			
		}else if(dia>=24 && mes == 10 || dia <=22 && mes == 11){
			System.out.println("Escorpio");
			
		}else if(dia>=23 && mes==11 || dia<=21 && mes==12){
			System.out.println("Sagitario");
											
		}else if(dia>=22 && mes==12 || dia<=20 && mes ==1){
			System.out.println("Capricornio");
												
		}else if(dia>=21 && mes==1 || dia<=19 && mes==2){
			System.out.println("Acuario");
													
		}else if(dia>=20 && mes==2 || dia<=20 && mes==3){
			System.out.println("Piscis");
		}
	}				
}