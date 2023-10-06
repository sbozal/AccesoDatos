package TareaEvaluativa;
import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		try {
			
			// Objeto de la clase FileReader para leer el fichero
			FileReader reader = new FileReader("./files/Ejercicio1_Lectura.txt");
			
			//Leer fichero por caracteres
			int i = reader.read();
			String lectura = "";
			while(i!=-1) {				
				lectura += (char)i;				
				i=reader.read();
			}
			
			// Cerrar FileReader
			reader.close();		
			
			// Invertir resultado
			String escritura = "";
			for (int j = lectura.length()-1; j >= 0; j--) {
				escritura += lectura.charAt(j);
			}
			
			// Objeto de la clase FileWriter
			FileWriter writer = new FileWriter("./files/Ejercicio1_Escritura.txt");
			
			// Escribir en fichero
			writer.write(escritura);
			
			// Cerrar FileWriter
			writer.close();
			
			
		}catch(IOException e) {
			System.out.println("Error: "+e);
		}
		
	}
	
}
