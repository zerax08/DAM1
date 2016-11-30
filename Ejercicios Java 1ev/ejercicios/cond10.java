package ejercicios;
import java.util.Scanner;

public class cond10 {
	
	public static void main(String[]args){
		Scanner tecla = new Scanner(System.in);
		
		double t,sf;
		
		t=-16.66/-58.8;
		sf=5+(16.66*t)+(0.5*(-58.8)*t*t);
		
		System.out.println("El tiempo es de frenada: "+t+" s y distancia sobrante es de"+sf+" m");
	
	}	
}