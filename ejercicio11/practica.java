/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

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
        int i, n = 0, sum =0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un valor");
        n=leer.nextInt();
        System.out.println("los multiplos de 3 son ");
        for (i = 1; i <=n; i++) {
            if(i%3==0){
            System.out.println(""+i);
            sum++;
            }
        }
        System.out.println("el total de multiplos es "+sum);
    }
    
}
