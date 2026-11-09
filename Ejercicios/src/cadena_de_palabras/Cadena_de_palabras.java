package cadena_de_palabras;

import java.util.Scanner;

public class Cadena_de_palabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Introduce una frase");
	String frase= input.nextLine(); //Hola que tal
	
	
	frase = frase.replace(" ", "");
	
	System.out.println(frase);
			
	input.close();
	
	 
	
	
	
	
	
	
	
	
	
	}

}
