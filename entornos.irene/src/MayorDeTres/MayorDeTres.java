package MayorDeTres;

public class MayorDeTres {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// Declara tres variables y muestra por pantalla cuál es el mayor de los tres.
		
		int a= 12;
		int b= 22;
		int c = 56;
		
		int max = a;
		//mayor es 12 
		if(b> max) {
			max=b;
			//mayor sigue siendo 12
		}
		if(c>max) {
			max = c;
			//mayor ocupa 56
		}
		
		System.out.println("el mayor es " + max );
	}

}