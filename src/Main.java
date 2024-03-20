package src;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nils Muralles
 * @since 19/03/24
 * @description Clase principal en la que se ejecuta el programa
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Translator translator = new Translator();
        Reader reader = new Reader("texto.txt");
        boolean menu = true;

        while (menu) {
            System.out.println("\n---BIENVENIDO---");
            System.out.println("1. Traducir texto");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int op = input.nextInt();
                input.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("\nEntrada original: " + reader.readFile());
                        System.out.println("Traducción: " + translator.trasnlate(reader.readFile()));
                        break;
                
                    case 2:
                        menu = false;
                        break;

                    default:
                        System.out.println("\nSeleccione una opción del menú");
                        break;
                }

            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("\nDebe seleccionar un número");
            }
        }
        
        input.close();

    }
}
