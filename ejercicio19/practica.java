/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

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
        int h=0,m=0,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar Horas");
        h=sc.nextInt();
        System.out.println("ingresar Minutos");
        m=sc.nextInt();
        System.out.println("ingresar Segundos");
        s=sc.nextInt();
        while(h<24){
            while(m<60){
                while(s<60){
                    System.out.println(""+h+":"+m+":"+s+"");
                    s=s+1;
        }
                m=m+1;
                s=0;
            }   
            h=h+1;
            m=0;
                }
        h=0;
            
        }
        
    
    
}
