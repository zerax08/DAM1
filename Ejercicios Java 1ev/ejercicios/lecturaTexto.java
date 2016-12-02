package ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;

	public class lecturaTexto {
		public static void main(String[] args) {
		    try {
		        Scanner s = new Scanner(new File("archivo.txt"));
		        System.out.println(s.nextLine());
		        System.out.println(s.nextInt());
		        s.nextLine();
		        System.out.println(s.nextDouble());
		        s.nextLine();
		        System.out.println(s.nextLine());
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();
		    } catch (InputMismatchException e){
		        e.printStackTrace();
		    }
		}
	}