
import java.util.Scanner;

/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá 
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona
la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ 
se sale del programa, caso contrario se vuelve a mostrar el menú.
 */

/**
 *
 * @author Rodrigo
 */
public class Guia3_Practico_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        double a = leer.nextDouble();
        double b = leer.nextDouble();
        String sal="";
        
        do{
        System.out.println("Ingrese una opcion");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("5 - Salir");
        
       
        int op = leer.nextInt();
        
        switch (op){
            case 1:
                System.out.println("La suma es: "+(a+b));
                break;
            case 2:
                System.out.println("La resta es: "+(a-b));
                break;
                
            case 3:
                System.out.println("La multiplicaion es: "+(a*b));
                break;
            case 4:
                System.out.println("La division es: "+(a/b));
                break;
            case 5:{
                System.out.println("Esta seguro de salir? S/N");
                sal=leer.next();
                break;
            }
        
                
                
        }
        }while(!sal.equals("S"));
        
        System.out.println("Gracias por usar nuestros servicios!");
        
    }
    }
    

