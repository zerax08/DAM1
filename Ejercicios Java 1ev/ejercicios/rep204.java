package ejercicios;


public class rep204 {

	public static void main(String[] args){

		String letra="*";
		int colum;
		
		for(int fila=1;fila<10;fila++){
			System.out.printf("\n");
		}
		for(int i=1;i<30;i++){
			for(colum=1;colum<5;colum++){
				System.out.printf("\t");
			}
			for(int columast=1;columast<15;columast++){
				System.out.printf(letra);
			}
			System.out.println();
			colum=0;
		}
	}
}
