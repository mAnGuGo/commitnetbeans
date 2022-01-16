
package repetitivas;

import java.util.Scanner;


public class main {
  
    public static void main(String[] args){
       
        
    Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca num1:");
        
        double num1 = sc.nextInt();
      
        System.out.println("introduzca num2:");
        
        double num2 = sc.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
              
    }
}
