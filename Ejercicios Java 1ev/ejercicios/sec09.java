package ejercicios;
import java.util.Scanner;

public class sec09 {
	public static void main(String[]args){
		Scanner tecla = new Scanner(System.in);
		int result,numero,dia,mes,primero = 0,segundo = 0,tercero = 0,cuarto = 0,año,pri,sec,tri,tet,res1,res2;
		
		System.out.println("Escribe mes de nacimiento");
		mes=tecla.nextInt();
		if(mes>9){
			primero = (mes/10)%10;
			segundo = (mes/10)%10;
		
		}
	    System.out.println("Escribe el dia") ;
	    dia=tecla.nextInt();
	    if(dia>9){
	    
		    tercero = (dia/10)%10;
		    
		    cuarto = (dia/10)%10;
	    
	    }
	    System.out.println("Escribe el año") ;
	    año=tecla.nextInt();
	    
	    pri=(año/10)%10;
	    sec=(año/10)%10;
	    tri=(año/10)%10;
	    tet=(año/10)%10;
	    
	    if(mes<12 || mes>0 && dia<31 || dia>0){
	    	if(mes<10 && dia<10){
	    		result=mes+dia+pri+sec+tri+tet;
	    	}else{
	    		result=primero+segundo+tercero+cuarto+pri+sec+tri+tet;
	    	}
	    	res1=(result/10)%10;
		    res2=(result/10)%10;
		    
		    result=res1+res2;
		    
		    System.out.println("Tu numero de la suerte es el:"+result);
	    }else{
	    	System.out.println("Has escrito alun dato imposible en calcular");
	    }
	    
	    
	    
	    
	        
	}
}

	    
	    
	    
	  