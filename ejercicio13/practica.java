/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;


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
        int i, sum=0;
        System.out.println("impresion de numeros del 1 al 100 ");
        for (i = 1; i <=100; i++) {
//si cumple al menos una de las 2 condiciones         
            if((i%3==0)||(i%2==0)){
            System.out.println("multiplo de 3 ó 2 : "+i);
            sum++;
            }
//si cumple ambas condiciones           
//            if((i%3==0)&&(i%2==0)){
//            System.out.println("multiplo de 3 ó 2 : "+i);
//            sum++;
//            }
        }
        
        System.out.println("el total de numeros multiplos de 2 y 3 es: "+sum);
    }
    
}
