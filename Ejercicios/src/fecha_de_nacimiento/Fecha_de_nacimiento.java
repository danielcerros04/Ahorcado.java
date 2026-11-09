package fecha_de_nacimiento;

import java.util.Scanner;

public class Fecha_de_nacimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print(" Introduce el día");
	int dia= input.nextInt();
	
	System.out.print(" Introduce el mes");
	int mes= input.nextInt();
	
	System.out.print(" Introduce el año");
	int año= input.nextInt();
	
	System.out.println(dia + "/" + mes + "/" + año);
	
	

	
	input.close();
	
	
	
	
	
	
	
	
	
	
	}

}
