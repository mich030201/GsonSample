package clases;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		int edad = -1;
		String nombre, apellidos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca su nombre: ");
		nombre = scanner.nextLine();
		
		System.out.print("Introduzca sus apellidos: ");
		apellidos = scanner.nextLine();
		
		try {
			System.out.print("Introduzca su edad: ");
			edad = scanner.nextInt();
		} catch(Exception e) {
			System.out.println("Edad no valida");
		}
		
		scanner.close();

		Persona p = new Persona(nombre, apellidos, edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		
		System.out.println(json);

	}

}
