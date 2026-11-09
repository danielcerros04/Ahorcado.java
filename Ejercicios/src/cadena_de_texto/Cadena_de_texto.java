package cadena_de_texto;

import java.util.Scanner;

public class Cadena_de_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Introduce una frase:");
	String frase = sc.nextLine();
	
	System.out.print("Escribe un carácter:");
	char caracter = sc.next().charAt(0);
	
	if (frase.charAt(0)==caracter) {
		System.out.println("Empienzan los dos por la misma letra");
		
	} else {
		System.out.println("No empiezan por la misma letra");
		
		
		
	
		
	}
	
	
	sc.close();
	
	}

}
