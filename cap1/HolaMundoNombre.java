/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author misae
 */
package Libro.cap1;
import java.util.Scanner;
public class HolaMundoNombre {
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);
        //Mensaje para el usuario
        System.out.println("Ingrese nombre edad altura");
        //Leemos el nombre
        String strNombre = scanner.next();
        //Leemos la edad
        int intEdad = scanner.nextInt();
        //Leemos la altura
        double dblAltura = scanner.nextDouble();
        //Mostramos los datos por consola
        System.out.println("Nombre: " +strNombre 
                +"Edad: " +intEdad 
                + "Altura:" +dblAltura);
    }
}
