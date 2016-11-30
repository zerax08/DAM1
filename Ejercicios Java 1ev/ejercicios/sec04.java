package ejercicios;
import java.util.Scanner;

public class sec04 {

	public static void main(String[]args){
		Scanner tecla = new Scanner(System.in);
		
		int numero,num1,rest,num2,num3,num4,num5,num6,num7,num8,num9;
		System.out.println("Introduce un valor monetario de 4 cifras");
		numero = tecla.nextInt();
		
		if (numero < 10000 && numero >999){
			num1 = numero/500;
			rest = numero%500;
			
			num2 = rest/200;
			rest = rest%200;
			
			num3 = rest/100;
			rest = rest%100;
			
			num4 = rest/50;
			rest = rest%100;
			
			num5 = rest/20;
			rest = rest%20;
			
			num6 = rest/10;
			rest = rest%10;
			
			num7 = rest/5;
			rest = rest%5;
			
			num8 = rest/2;
			rest = rest%2;
			
			num9 = rest/1;
			rest = rest%1;
			
			
			System.out.println("Se necesitan: "+num1+" de 500€ "+num2+" de 200€ "+num3+" de 100€ "+num4+" de 50€ "+num5+" de 20€ "+num6+" de 10€ "+num7+" de 5€ "+num8+" de 2€ "+num9+" de 1€ ");
		}else{
			System.out.println("¡Alerta! \n¡Usuario subnormal!");
		}
	
	}
}
