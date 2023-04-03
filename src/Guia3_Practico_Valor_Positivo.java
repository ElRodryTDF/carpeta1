
import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class Guia3_Practico_Valor_Positivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int num=leer.nextInt();
        int a;
        int suma=0;
        do {
            System.out.println("Ingrese un numero entero");
            a=leer.nextInt();
            suma=suma+a;
            
            
        }while (suma<num);
    }
    
}
