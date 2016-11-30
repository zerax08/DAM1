package ejercicios;

public class rep207 {

	public static void main(String[] args){
		
		int num=8,num1=7;
		
		
		while(num!=0){
			
			System.out.printf("%d", num);
			num--;
			
			if (num==0){
				System.out.printf("\n");
				num=num1;
				num1--;
			}
		}
	}
}