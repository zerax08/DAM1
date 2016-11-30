package ejercicios;
import java.util.Scanner;

public class sec02 {
	public static void main(String[]args){
		
		float hombres,mujeres,total;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Dame numero de hombres");
		hombres = tecla.nextInt();
		
		System.out.println("Dame numero de mujeres");
		mujeres = tecla.nextInt();
		
		total = mujeres+hombres;
		
		hombres = hombres*100/total;
		mujeres = 100-hombres;
		
		System.out.println("El porcentaje de mujeres es de: "+mujeres+"%");
		System.out.println("El procentaje de hombres es de: "+hombres+"%");
	}

}
