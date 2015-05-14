/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author José Angel Lara Aguirre
 */
public class practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero");
        i=leer.nextInt();
        if(i%2==0){
        System.out.println("el numero es par");    
        }
        else{
        System.out.println("el numero es impar");    
        }
    }
    
}
