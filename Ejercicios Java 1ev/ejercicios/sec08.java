package ejercicios;
import java.util.Scanner;

public class sec08 {
	public static void main(String[]args){
		Scanner tecla = new Scanner(System.in);
		 int numero;
	    
	     int tercero;
	     int segundo;
	     int primero;
	             
	          System.out.print("Escribe un numero de 3 digitos: \n" );
	        numero = tecla.nextInt();
	      
	       
	       
	        tercero = numero%10;
	 
	        numero = numero/10;
	        segundo = numero%10;
	 
	        numero = numero/10;
	        primero = numero%10;
	 
	        System.out.printf("Los numeros separados son:");
	        System.out.printf("%d  %d  %d \n", primero, segundo, tercero);

	}
}
