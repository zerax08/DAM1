package ejercicios;


public class rep201 {

	public static void main(String[] args){
		
		int num=15,sum=0;
		
		do{
			sum = num + sum;
			num++;
		}while(num<=20);
		System.out.println("la suma  de todos los numeros comprendidos entre 15 y 20 es: "+sum);
	}
}
