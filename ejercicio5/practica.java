/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

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
        int suma=0;
        System.out.println("impresion y conteo de numeros impares");
        for (i = 0; i < 100; i++) {
            if(i%2==0){
                suma++;
                System.out.println(""+(i+1));
            }    
        }
        System.out.println("la numeros impares son "+suma);
    }
}
