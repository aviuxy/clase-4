/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.egg;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número cualquiera");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número cualquiera");
        num2 = leer.nextInt();
        
        if ((num1 >= 25) && (num2 >= 25)){
            System.out.println("Ambos números son mayores o iguales a 25");
        } else if ((num1 < 25) && (num2 < 25)){
            System.out.println("Los dos números son menores a 25");
        } else if (num1 >= 25){
            System.out.println("El primer número es mayor o igual a 25, el segundo es menor");    
        } else if (num2 >= 25){
            System.out.println("El segundo número es mayor o igual a 25, el primero es menor");
        }
        
/*EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
*/
        
        
        
        // TODO code application logic here
    }
    
}
