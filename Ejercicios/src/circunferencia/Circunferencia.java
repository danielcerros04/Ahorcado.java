package circunferencia;

import java.util.Scanner;

public class Circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input= new Scanner (System.in);
	
	System.out.print("Introduce el radio:");
	double radio = input.nextDouble();
	
	double longitud = 2 * Math.PI * radio;
	double area = Math.PI * radio * radio;
	
	System.out.println("Longitud de la circunferencia: " + longitud);
	System.out.println("Área de la circunferencia: " + area);
	
	
	
	input.close();
	
	
	
	
	
	
	
	
	}

}
