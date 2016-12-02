package ejercicios;

import java.util.Scanner;
public class rep208 { 
    public static void main(String[]args){ 
	    Scanner tecla = new Scanner(System.in);
	    int cant=0;
	    System.out.println("Dame el numero");
	    cant=tecla.nextInt();
	    int dinero[]= new int [9]; 
	    int i=0; 
	    while(cant>0){ 
	        while(cant-500>=0){ 
	            cant=cant-500; 
	            dinero[0]++; 
	        } 
	        while(cant-200>=0){ 
	            cant=cant-200; 
	            dinero[1]++; 
	        } 
	        while(cant-100>=0){ 
	            cant=cant-100; 
	            dinero[2]++; 
	        } 
	        while(cant-50>=0){ 
	            cant=cant-50; 
	            dinero[3]++; 
	        } 
	        while(cant-20>=0){ 
	            cant=cant-20; 
	            dinero[4]++; 
	        } 
	        while(cant-10>=0){ 
	            cant=cant-10; 
	            dinero[5]++; 
	        } 
	        while(cant-5>=0){ 
	            cant=cant-5; 
	            dinero[6]++; 
	        } 
	        while(cant-2>=0){ 
	            cant=cant-2; 
	            dinero[7]++; 
	        } 
	        while(cant-1>=0){ 
	            cant=cant-1; 
	            dinero[8]++; 
	        } 
	    } 
	    for(i=0;i<9;i++){ 
	        if(i==0){ 
	            System.out.println(dinero[i]+ " billetes de 500");
	        }else if(i==1){ 
	        	System.out.println(dinero[i]+ " billetes de 200"); 
	        }else if(i==2) {
	        	System.out.println(dinero[i]+ " billetes de 100"); 
	        }else if(i==3){ 
	        	System.out.println(dinero[i]+ " billetes de 50"); 
	        }else if(i==4){ 
	        	System.out.println(dinero[i]+ " billetes de 20"); 
	        }else if(i==5){ 
	        	System.out.println(dinero[i]+ " billetes de 10"); 
	        }else if(i==6){ 
	        	System.out.println(dinero[i]+ " billetes de 5"); 
	        }else if(i==7){ 
	        	System.out.println(dinero[i]+ " monedas de 2"); 
	        }else if(i==8){ 
	        	System.out.println(dinero[i]+ " monedas de 1"); 
	    	}
	    } 
    } 
} 
