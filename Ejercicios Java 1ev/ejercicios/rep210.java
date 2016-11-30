package ejercicios;

public class rep210 {
	public static void main(String[] args) { 
		
		String asterisco = "*"; 
		
		for (int i= 1; i<=4; i++){ 
			
			for (int espacios = 5 - i; espacios >0; espacios--){ 
				System.out.printf(" "); 
			}
			for (int lineas = 1; lineas < 2 * i; lineas++){
				System.out.printf(asterisco); 
			}
			System.out.println();
			
		} 
		
		for (int i= 3; i>=1; i--){ 
			
			for (int espacios = 5 - i; espacios >0; espacios--){
				System.out.printf(" "); 
			}
			for (int lineas = 1; lineas < 2 * i; lineas++){
				System.out.printf(asterisco); 
			}
			System.out.println(); 
			
		} 
	} 
}	