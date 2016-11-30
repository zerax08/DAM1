package ejercicios;

public class rep02 {

	public static void main(String[] args){
		
		int resul=0;
		
		for(int i=1;i<=100;i++){
			resul= i+resul;
		}
		System.out.println("la solucion es: "+resul);
	}
}
