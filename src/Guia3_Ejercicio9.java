
import java.util.Scanner;

/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse
 * @author Rodrigo
 */
public class Guia3_Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner (System.in);
   int i=0;
   int num;
   int suma=0;
   do{
   i++;    
   System.out.println("Ingrese 20 numeros ");
   num=leer.nextInt();
   if (num>0)suma=suma+num;
   }while (num != 0 && i<20);
   if (num==0) System.out.println("Se capturo el numero cero");      
        System.out.println("La suma de los numeros leidos es " + suma);       
    }
    
}
