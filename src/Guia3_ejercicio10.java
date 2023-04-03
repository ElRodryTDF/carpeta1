
import java.util.Scanner;

/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor
 */

/**
 *
 * @author Rodrigo
 */
public class Guia3_ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 4 numeros entre el 1 y el 20");
        int num ;
        int y=0;
        do{
            System.out.println("\nNum:");
        num = leer.nextInt();
        for(int i = 0; i < num; i++){
            System.out.print("*");}
        y++;
        }
        while  (y<4) ;
        System.out.println("");
    }
    
}
     
     
     
     
   