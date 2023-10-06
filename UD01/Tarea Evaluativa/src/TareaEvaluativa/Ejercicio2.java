package TareaEvaluativa;
import java.io.*;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		String ficheroLectura = "./files/Ejercicio2_Lectura.txt";
		String ficheroEscritura = "./files/Ejercicio2_Escritura.txt";
		String resultado = "";
		
		// Controlar excepciones
		try{
			
			// Objeto de la clase BufferedReader
			BufferedReader fbr = new BufferedReader(new FileReader(ficheroLectura));
			
			// Leer líneas del fichero
			String linea = fbr.readLine();
		    while (linea != null) {
		    	
		    	// Guardar las palabras de la línea en un array
		    	String palabra[] = linea.split(" ");
		    	
		    	// Recorrer el array de palabras
		    	for(int i = 0; i<palabra.length; i++) {
		    		
		    		String palabraInvertida = "";
		    		// Invertir palabra pare comprobar si se es palíndroma
		    		for(int j = palabra[i].length()-1; j >= 0; j--) {
		    			palabraInvertida += palabra[i].charAt(j);
		    		}
		    		
		    		// Comprobar si son iguales la palabra y la palabra invertida
		    		if(palabra[i].equals(palabraInvertida)) {
		    			resultado = resultado + " " + palabra[i];
		    		}
		    		
		    	}
		    			        
		    	// Siguiente línea
		        linea = fbr.readLine();
		    }
		    
		    // Cerrar
		    fbr.close();
		    
		    // Objeto de la clase BufferedWriter
			BufferedWriter fbw = new BufferedWriter(new FileWriter(ficheroEscritura));
			
			// Escribir fichero
			fbw.write(resultado);
			
			// Cerrar
			fbw.close();
			
		}catch(IOException e) {
			System.out.println("Error: "+e);
		}
		
	}

}
