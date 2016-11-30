package ejercicios;

public class rep03 {
	public static void main(String[] args){
		
		for(int i=10;i>=1;i--){
			System.out.printf("%d",i);
			if(i>1){
				System.out.printf(", ");
			}else{
				System.out.printf(".");
			}
		}
	}
}
