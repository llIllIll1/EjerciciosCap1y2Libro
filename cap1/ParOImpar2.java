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
public class ParOImpar2 {
    public static void main (String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int v=scanner.nextInt();
         // Obtenemos el resto de dividir v por 2
        int resto= v % 2;
        // Utilizando un if in-line
        String mssg = (resto == 0 ) ? "es Par": "es Impar";
        // Muestro resultado
        System.out.println(v+" "+mssg);
 }
}
