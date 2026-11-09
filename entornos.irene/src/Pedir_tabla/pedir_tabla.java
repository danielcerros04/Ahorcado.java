package Pedir_tabla;

import java.util.Scanner;

public class pedir_tabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println(" introduce un numero");
	int num1= input.nextInt();
	
	System.out.println(" introduce un segundo numero");
	int num2= input.nextInt();
	
	int suma= num1 + num2;
	
	
	//suma
	System.out.println(" la suma es : " + suma );
	
	//resta
	
	System.out.println(" La resta es : " + (num1- num2));
	
	
	//multiplicacion
	System.out.println(" La multiplicacion es : " + (num1*num2));
	
	//division
	//System.out.println("La division es: " + (num1/num2));
	
	if(num2 !=0) {
	
		System.out.println("La division es : " + (num1/num2));
		
	} else {
		System.out.println(" no se puede dividir entre 0");
		
	}
		/*
		 * num1 = 0 num2= 5 --> resultado da 0
		 * num1 = 5 y num2= 0 --> no se puede dividir ente 0
		 * 						si no esta el if Else sale mensaje de error
		 * num1= 0 y num2 =0 --> no se puede dividir entre 0
		 * 						si no esta el if Else sale mensaje de error
		 * 
		 */
		
		input.close();
		
	}
	
	}

