/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author José Angel Lara Aguirre
 */
public class practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        char c ;
        System.out.println("ingresa s/n");
        c = in.readLine().charAt(0);

        if(c=='s'||c=='n'){
            System.out.println("carcater ingresado correctamente");
        }
        else{
            System.out.println("caracter no permitido");
        }
    }    
}
