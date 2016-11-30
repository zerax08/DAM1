package ejercicios;

import java.util.Scanner;

public class rep203 {
    public static void main(String[] args) {
       Scanner tecla = new Scanner(System.in);
       int a=0,i,n;
       
       System.out.println("Ingrese numero");
       n=tecla.nextInt();
       
       for(i=1;i<(n+1);i++){
       if(n%i==0){
           a++;
          }
       }
       
       if(a!=2){
            System.out.println("No es Primo");
          }else{
              System.out.println("Si es Primo");
       }
   }
}

