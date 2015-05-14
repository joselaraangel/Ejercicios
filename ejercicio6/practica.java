/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

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
        int n,i;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un valor ");
        n=leer.nextInt();
        System.out.println("impresion de numeros de 0 a "+n);
        for (i = 0; i < n; i++) {
            System.out.println(""+(i+1));
        }
    }
    
}
