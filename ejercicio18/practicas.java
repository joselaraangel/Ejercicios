/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author José Angel Lara Aguirre
 */
public class practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

System.out.print("Cadena: ");
String Cadena = Leer.nextLine(); // Leer cadena
Cadena = Cadena.toLowerCase(); // Pasar a minuscula la cadena

int Cont = 0;

for(int i=0; i<Cadena.length(); i++)
{
if(Cadena.charAt(i) == 'a')
Cont++;
}

System.out.print("Numero de letras: " + Cont);
    }
    
}
