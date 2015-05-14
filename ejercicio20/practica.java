/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

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
        int sum=1;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un valor para calcular el factorial ");
        n=leer.nextInt();
        for (int i = 1; i <=n; i++) {
           sum=sum*i;
        }
        System.out.println("el factorial es "+sum);
    }
    
}
