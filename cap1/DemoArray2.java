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
public class DemoArray2 {
    public static void main (String [] args)
    {
        String strDias[] = {"Lunes","Martes","Miercoles",
        "Jueves","Viernes","Sabado","Domingo"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana(numero):");
        int intV = scanner.nextInt();
        if(intV <=strDias.length && intV > 0)
        {
            System.out.println(strDias[intV-1]);
        }
        else
        {
            System.out.println("Dia incorrecto");
        }
        
    }
}
