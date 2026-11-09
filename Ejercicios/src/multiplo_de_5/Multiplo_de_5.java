package multiplo_de_5;

public class Multiplo_de_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int variableA= 1003;
	
	//multiplo de 5
	if(variableA %5 ==0) {
		System.out.println("es multiplo de 5");
	
	} else {
		System.out.println("no es multiplo de 5");
		
		
	}
	
	if (variableA %10 ==0) {
		System.out.println("es multiplo de 10");
	} else {
		System.out.println("no es multiplo de 10");
	
	}
	
	//mayor o menor o igual a 100
	if (variableA > 100) {
		System.out.println(variableA + "es mayor que 100");
		
	}if (variableA < 100) {
		System.out.println(variableA + " es menor que 100");
		
	}
}

}
