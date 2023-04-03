import java.util.Scanner;


//Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.


public class Guia3_Ejercicio6 {

 
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        int num1,num2;
        
        System.out.println("ingrese dos numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        if (num1>25 && num2>25){
            System.out.println("ambos numeros son mayores a 25");
        }
        else if (num1>25) {
            System.out.println("El primero numero ingresado: "+num1+ " es mayor a 25");
        }
        else if (num2>25) {
            System.out.println("El segundo numero ingresado: "+num2+ " es mayor a 25");
        }
    else {
            System.out.println("Los numeros ingresados no son mayores a 25");
    }
}
}