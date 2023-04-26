/*MANEJO DE ARCHIVOS Y CARPETAS
 * Este programa crea una capeta y archivo, escribe un archivo
 * luego compara el dato ingresado con la lista del archivo
 */
package cl.marely;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class LectoescrituraArchivo {


	
	/*
	 * METODO BUSCARTEXTO
	 * Este método realiza el proceso de tectura y comparación con el texto ingresado
	 */
	public static void buscarTexto(String archivo, String texto) {
		int i = 0;
		try {
			File fichero = new File(archivo);
			if (fichero.exists()) {   //verifica la existencia del archivo
				FileReader fr = new FileReader(fichero);
				BufferedReader br = new BufferedReader(fr);
				String data = br.readLine();  
				while (data != null) {    //repite el ciclo hasta que sea null
					if (data.equalsIgnoreCase(texto)) { // compara linea leída con el texto ingresado
						i++; // contador de veces que es encontrado el texto en el archivo
					}
					data = br.readLine(); //lectura de línea
				}
				br.close();
			} else {
				System.out.println("El fichero ingresado no existe");
			}
		} catch (Exception e) {
			System.out.println("Excepcion leyendo fichero : " + e);
		}
		System.out.println("\nLa palabra '" + texto + "' aparece " + i + " veces en el fichero.");
	}


	
	/*
	 * METODO CREALISTA
	 * Este método crea una ArrayList con la información para escribir en el archivo
	 * 	 */
	public static ArrayList<String> creaLista() {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Gato");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Perro");
		lista.add("Daniel");
		lista.add("Perro");
		lista.add("Camila");
		System.out.println("Lista creada: " + lista);
		return lista;

	}

	
	
	public static void crearArchivo(String directorio, String fichero) {

		File fileDirectorio = new File(directorio);
		File fileArchivo = new File(fichero);

		if (!fileDirectorio.exists()) {
			if (fileDirectorio.mkdirs()) {    //crea el directorio
				System.out.println("Directorio creado");
				try {
					fileArchivo.createNewFile();    //crea archivo
					System.out.println("Archivo creado");
					FileWriter fileW = new FileWriter(fileArchivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);
					ArrayList<String> arrayList = creaLista(); // método para crear lista de datos
					Iterator<String> it = arrayList.iterator(); //itera la lista para realizar la escritura del archivo
					it.forEachRemaining(elemento -> {    
						try {
							bufferedWriter.write(elemento);
							bufferedWriter.newLine();
						} catch (IOException e) {
							e.printStackTrace();
						}
					});
					bufferedWriter.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Error al crear directorio");
			}
		} else {
			System.out.println("Directorio ya esta creado");

		}
	}



	public static void main(String[] args) {
		String directorio = "src/directorio";  //Declara ruta de directorio
		String fichero = "src/directorio/fichero.txt"; //Declara ruta de archivo
		crearArchivo(directorio, fichero);  //método para crear archivo y carpeta
		Scanner sc = new Scanner(System.in);   
		System.out.println("Ingrese texto: "); 
		String texto = sc.nextLine(); //Ingreso de texto desde consola
		buscarTexto(fichero, texto);   //metodo para realizar lectura y comparaación de datos
		sc.close();
	}
}