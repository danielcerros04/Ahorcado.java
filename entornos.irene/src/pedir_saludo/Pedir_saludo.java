package pedir_saludo;

import java.util.Scanner;

public class Pedir_saludo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner input = new Scanner (System.in);
	
	System.out.println("como te llamas?");
	//string nombre = " DANIEL ";
	
	String nombre =input.nextLine();
	
	System.out.println(" introduce otro nombre ");
	
	nombre= input.nextLine();
	
	System.out.println(" hola " + nombre);

	input.close();
	
	
	}

}
