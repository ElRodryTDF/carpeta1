
import java.util.Scanner;


 
public class guia3_ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int motor;
        System.out.println("Ingrese el tipo de Motor");
        motor = leer.nextInt();
        switch(motor){
            case 1:
                System.out.println("La bomba es una bomba de agua ");break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina ");break;
            case 3:
                System.out.println("La bomba es una bomba de  hormigon ");break;    
             case 4:
                System.out.println("La bomba es una bomba de agua pasta ");break;
        
             default:
                 System.out.println(" No existe una bomba");break;
        }
    }
}
