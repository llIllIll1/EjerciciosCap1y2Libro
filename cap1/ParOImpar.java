/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap1;
import java.util.Scanner;
/**
 *
 * @author misae
 */
public class ParOImpar {
    public static void main (String [] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor:");
    int v = scanner.nextInt();
    //Obtenermos el resto de dividir y por 2
    int resto = v%2;
    //Para preguntar por igual utilizamos ==
    if(resto == 0)
    {
        System.out.println(v+" Es par");
    }
    else
    {
        System.out.println(v + " es Impar");
    }
                
    }
}
