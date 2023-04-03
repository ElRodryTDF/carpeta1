
import java.util.Scanner;

/*
Crear un programa que dado un número determine si es par o impar.

 * @author Rodrigo
 */
public class Guia3_Practico_Par_o_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     int num;
        System.out.println("Ingrese un numero");
     num=leer.nextInt();
     
     if (num % 2 ==0 )System.out.println(" el numero ingresado es par " );
     else System.out.println(" el numero ingresado es impar ");
    }
    
}
