package cifras;

import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Introduce un numero de 5 cifras: ");
	int numero = input.nextInt();
	
	System.out.println(numero / 10000);
	System.out.println(numero / 1000);
	System.out.println(numero / 100);
	System.out.println(numero / 10);
	System.out.println(numero);
	
	input.close();
	}

}
