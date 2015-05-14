/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

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
        int i, max=0, min=0;
        int a[]= new int[5];
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 5 valores");
        for (i = 0; i <5; i++) {
            a[i]=leer.nextInt();
            if(a[i]>max){
                max=a[i];
            }
        
        }
        System.out.println("el numero mayor es: "+max); 
//         for (i = 0; i <5; i++) {
//            a[i]=leer.nextInt();
//            if(a[i]<min){
//                min=a[i];
//            }
//        
//        }
//        System.out.println("el numero menor es: "+min);
    }
}

