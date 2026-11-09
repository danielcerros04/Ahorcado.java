package Ahorcado.java;

import java.util.Random;
import java.util.Scanner;

/**
 * Juego del ahorcado desarrollado en Java.
 * El objetivo es descubrir una palabra secreta introduciendo letras.
 *
 * @author Daniel
 * @version 1.0
 */
public class Ahorcado {

    // Lista de palabras que pueden aparecer durante el juego
    private static final String[] LISTA_PALABRAS = {
        "programacion", "java", "ordenador", "teclado",
        "variable", "git", "algoritmo", "servidor",
        "compilador", "bucle"
    };

    // Cantidad máxima de errores permitidos
    private static final int LIMITE_ERRORES = 6;

    public Ahorcado() {
    }

    /**
     * Método principal del programa.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        boolean continuar = true;

        System.out.println("********************************");
        System.out.println("       BIENVENIDO AL AHORCADO");
        System.out.println("********************************");

        do {
            String palabraElegida =
                LISTA_PALABRAS[aleatorio.nextInt(LISTA_PALABRAS.length)];

            iniciarPartida(palabraElegida, teclado);

            System.out.print("\n¿Deseas comenzar una nueva partida? (s/n): ");
            String opcion = teclado.nextLine().trim().toLowerCase();

            continuar = opcion.equals("s");

        } while (continuar);

        System.out.println("Gracias por jugar. ¡Hasta pronto!");
        teclado.close();
    }

    /**
     * Controla el desarrollo de una partida.
     *
     * @param palabra palabra que debe descubrirse
     * @param teclado lector de entrada del usuario
     */
    private static void iniciarPartida(String palabra, Scanner teclado) {

        StringBuilder progreso = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            progreso.append("_");
        }

        StringBuilder letrasProbadas = new StringBuilder();
        int errores = 0;

        while (errores < LIMITE_ERRORES &&
                progreso.indexOf("_") >= 0) {

            System.out.println("\n" + mostrarAhorcado(errores));
            System.out.println("Palabra secreta: " + progreso);
            System.out.println("Letras utilizadas: " + letrasProbadas);

            System.out.print("Escribe una letra: ");
            String texto = teclado.nextLine().trim().toLowerCase();

            if (texto.length() != 1 ||
                    !Character.isLetter(texto.charAt(0))) {

                System.out.println("Debes introducir solamente una letra.");
                continue;
            }

            char letra = texto.charAt(0);

            if (letrasProbadas.indexOf(String.valueOf(letra)) >= 0) {
                System.out.println("Esa letra ya ha sido introducida.");
                continue;
            }

            letrasProbadas.append(letra).append(" ");

            boolean encontrada = false;

            for (int i = 0; i < palabra.length(); i++) {

                if (palabra.charAt(i) == letra) {
                    progreso.setCharAt(i, letra);
                    encontrada = true;
                }
            }

            if (encontrada) {
                System.out.println("¡Correcto! Has encontrado una letra.");
            } else {
                errores++;
                System.out.println("Letra incorrecta. Errores: "
                        + errores + "/" + LIMITE_ERRORES);
            }
        }

        System.out.println("\n" + mostrarAhorcado(errores));

        if (progreso.indexOf("_") == -1) {
            System.out.println("¡Felicidades! Has descubierto la palabra: " + palabra);
        } else {
            System.out.println("Fin de la partida. La palabra era: " + palabra);
        }
    }

    /**
     * Genera el dibujo del ahorcado dependiendo de los errores.
     *
     * @param errores número de errores cometidos
     * @return dibujo correspondiente
     */
    private static String mostrarAhorcado(int errores) {

        String[] fases = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
        };

        return fases[errores];
    }
}
