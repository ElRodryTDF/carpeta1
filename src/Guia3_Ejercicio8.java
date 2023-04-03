
import java.util.Scanner;


public class Guia3_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
    int nota;
    while (true){
        System.out.println("Ingrese el numero de su calificacion");
        nota = leer.nextInt();
        
        if (nota >= 0 && nota <= 10) {
                System.out.println("La nota es válida: " + nota);
                break;
            } 
        else {
                System.out.println("La nota no es válida. Inténtalo de nuevo.");
            }
   
    }
    
    }
}