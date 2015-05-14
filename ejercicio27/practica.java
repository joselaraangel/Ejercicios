/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;

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
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el numero a multiplicar");
        n=leer.nextInt();
        System.out.println("la tabla de multiplicar de "+n+" es");
        for (int i = 1; i <=10; i++) {
           System.out.println(""+(i)+"x"+n+"="+(i*n));
        }
        
    }
    
}
