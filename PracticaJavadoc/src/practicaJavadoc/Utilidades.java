package practicaJavadoc;

/**
 * Clase que contiene diferentes métodos de utilidad
 * para realizar operaciones matemáticas y comprobaciones.
 *
 * @author Administrator
 * @version 1.0
 */
public class Utilidades {

    /**
     * Comprueba si un número es par.
     *
     * @param número que se quiere comprobar.
     * @return true si el número es par, false si es impar.
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Calcula cuál es el mayor de tres números.
     *
     * @param a primer número.
     * @param b segundo número.
     * @param c tercer número.
     * @return el mayor de los tres números.
     */
    public static int mayorDeTres(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }

    /**
     * Calcula el área de un rectángulo.
     *
     * @param base base del rectángulo.
     * @param altura altura del rectángulo.
     * @return el área del rectángulo.
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Comprueba si un texto empieza por una letra determinada.
     *
     * @param texto texto que se quiere comprobar.
     * @param letra letra que se quiere buscar al principio.
     * @return true si empieza por esa letra, false en caso contrario.
     */
    public static boolean empiezaPor(String texto, char letra) {
        return texto.charAt(0) == letra;
    }

    /**
     * Muestra la tabla de multiplicar de un número del 1 al 10.
     *
     * @param numero número del que se quiere mostrar la tabla.
     */
    public static void mostrarTabla(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    /**
     * Método principal que ejecuta y prueba todos los métodos.
     *
     * @param args argumentos recibidos desde la línea de comandos.
     */
    public static void main(String[] args) {

        System.out.println("¿7 es par? " + esPar(7));

        System.out.println("Mayor de 4, 9 y 2: "
                + mayorDeTres(4, 9, 2));

        System.out.println("Área de 5 x 3: "
                + areaRectangulo(5, 3));

        System.out.println("¿Hola empieza por H? "
                + empiezaPor("Hola", 'H'));

        mostrarTabla(3);
    }
}