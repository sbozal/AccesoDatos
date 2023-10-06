package TareaEvaluativa;
import java.io.*;
import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		File fichero = new File("./files/Ejercicio3.zip");
		
		try (
	            InputStream inputStream = new FileInputStream(fichero);
		) {
			
			// Cabecera de un fichero zip
			byte[] cabeceraZip = {80, 75, 3, 4};
			
			// Cabecera de nuestro fichero
			byte[] cabeceraFichero = new byte[4];
			inputStream.read(cabeceraFichero);
			
			// Comprobar si son iguales
			if (!Arrays.equals(cabeceraZip, cabeceraFichero)) {
                System.out.println("El fichero NO es un ZIP");
            }else {
            	System.out.println("El fichero SI es un ZIP");
			}			
			
		}catch(IOException e) {
			System.out.println("Error: " + e);
		}
	}
	
}
