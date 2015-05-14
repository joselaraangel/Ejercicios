/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

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
        int i, par=0, impar =0;
        System.out.println("imprime numeros del 1 al 100");
        for (i = 1; i <=100; i++) {
            System.out.println(""+(i));
            if(i%2==0){
                par=par+i;
            }
            else{
                impar=impar+i;   
            }
            
        }
        System.out.println("la suma de los numeros pares es "+par);
        System.out.println("la suma de los numeros impares es "+impar);
        
    }
    
}
