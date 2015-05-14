/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

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
        int c,i,a,z, sum=0, par=0, impar=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa 2 numeros");
        a=sc.nextInt();
        z=sc.nextInt();
        System.out.println("los numeros naturales entre estos numeros son ");
        c=a+1;
        for (i = c; i <z; i++) {
            System.out.println(""+(i));
            sum++;
            if(i%2==0){
                par++;
            }
            if(i%2==1){
                impar=impar+i;
            }
        }
        System.out.println("el total de numeros en este rango es "+sum);
        System.out.println("el total de numeros pares existentes es "+par);
        System.out.println("la suma de todos los impares es "+impar);
        
    }
    
}
