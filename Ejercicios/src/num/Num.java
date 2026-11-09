package num;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// Solicitar valor inicial
		System.out.print("Introduce un número entero: ");
		int num = sc.nextInt();
		// Incrementar en 77
		num = num + 77;
		System.out.println("Después de incrementar en 77: " + num);
		// Decrementar en 3
		num = num - 3;
		System.out.println("Después de decrementar en 3: " + num);
		// Duplicar el valor
		num = num * 2;
		System.out.println("Después de duplicar el valor: " + num);
	
		sc.close();
	}

}
