
import java.util.Scanner;

/*
 Escriba un programa que pida una frase o palabra 
y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.
 */

/**
 *
 * @author Rodrigo
 */
public class Guia3_Practico_Frase_con_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres:");
        String frase = leer.nextLine();
        if (frase.substring(0, 1).equals("A")||frase.substring(0, 1).equals("a")) System.out.println("Ingreso correcto");
        else System.out.println("Incorrecto");
    }
    
}
