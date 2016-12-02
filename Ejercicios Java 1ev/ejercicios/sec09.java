package ejercicios;
import java.util.Scanner;

public class sec09 {
	public static void main(String[]args){
		Scanner tecla = new Scanner(System.in);
		float altura = 0;
		float base = 0;
		double h = 0;
		
		System.out.println("Escribe la altura");
		altura=tecla.nextInt();
		System.out.println("Escribe la base");
		base=tecla.nextInt();
		
		h = Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2));
		
		System.out.println("La hipotenusa es de: "+h);
	
	}
	//h=razia2a^2+b^2
	//math.sqrt()
}
