package basico;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		System.out.println("Introduce tu nombre");
		String nombre = sc.next();
//		System.out.println("Nombre :" + nombre + " edad :" + edad);

//		try {
//			FileWriter fw = new FileWriter("C:\\Users\\Curso mañana\\Desktop\\test.txt");
//			fw.write("Nombre :" + nombre + " edad :" + edad);
//			fw.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("Success...");
		
		 FileReader fr=new FileReader("C:\\Users\\Curso mañana\\Desktop\\destino\\test.txt");    
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();  
	}

}
