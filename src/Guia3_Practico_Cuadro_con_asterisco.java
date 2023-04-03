
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Guia3_Practico_Cuadro_con_asterisco {
public static void main(String[] args) {
                   Scanner leer = new Scanner(System.in);
            int num;
            
            
            do{                  
                  System.out.println("Ingrese un número entero positivo"); 
                  num = leer.nextInt();  
            } while (num<2);
            
            for (int i = 0; i <= num-1; i++) {
                  for (int j = 0; j <= num-1; j++) {
                        if (i==0 || i==num-1) {
                              System.out.print("* ");
                        }  else if (j==0 || j==num-1) {
                              System.out.print("* ");
                        } else {
                              System.out.print("  ");
                        }
                  }
                  System.out.println("");
            }
      }
      
}
    
   
