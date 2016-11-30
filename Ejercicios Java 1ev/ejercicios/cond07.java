package ejercicios;

import java.util.Scanner;
public class cond07{
	
	public static void main(String[]args){
		
		int anio=0;
		int mes = 0;
		int dia=0;
		boolean error= false;
		Scanner teclado=new Scanner (System.in);
				
		System.out.println("Introduzca el anio");
		anio=teclado.nextInt();
		
		do{
			
			System.out.println("Introduzca el mes");
			mes=teclado.nextInt();
			
			if(mes<1||mes>12){
				System.out.println("ese mes no vale wey");
				continue;
			}
			break;
		}while (true);
		
		do{
			error=false;
			dia=1;
			
			do{					
				System.out.println("Introduzca el dia");
				dia=teclado.nextInt();
				
				if(dia<1||dia>31){
					System.out.println("ese dia no vale wey");
					continue;
				}
				break;
			}while(true);
			
			if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10){
				if(dia==31){
					dia=1;
					mes++;
				}else{
					dia++;
				}
			}else if(mes!=2&&mes!=12){
				if(dia>30){
					System.out.println("ese dia no vale wey");
					error=true;
				}else{
					if(dia==30){
						dia=1;
						mes++;
					}else{
						dia++;
					}
				}
			}
			if(mes==2){ 
				if(anio%4==0||anio%100==0|anio%400==0){
					if(dia>29){
						System.out.println("ese dia no vale wey");
						error=true;
					}else{
						if(dia==29){
							dia=1;
							mes++;
						}else{
							dia++;
						}
					}				
				}else{
					if(dia>28){
						System.out.println("ese dia no vale wey");
						error=true;
					}else{
						if(dia==28){
							dia=1;
							mes++;
						}else{
							dia++;
						}
					}
				}
			}	
			if(mes==12){
				if(dia==31){
					mes=1;
					dia=1;
					anio++;
				}else{
					dia++;
				}
			}
		}while(error==true);

			
		System.out.println("manana es  "+dia+"/"+mes+"/"+anio);		
	}
}

