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
public class DemoConstantes {
    
    // definimos las constantes
    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;
    
    public static void main(String []args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana(numero): ");
        int v = scanner.nextInt();
        String dia;
        switch(v)
        {
            case LUNES:
                dia = "Lunes";
                break;
            case MARTES:
                dia = "Martes";
                break;
            case MIERCOLES:
                dia = "Miercoles";
                break;
                case JUEVES:
                dia = "Jueves";
                break;
                case VIERNES:
                dia = "Viernes";
                break;
                case SABADO:
                dia = "Sabado";
                break;
                case DOMINGO:
                dia = "Domingo";
                break;
                default: 
                    dia ="Dia incorrect... Ingrese un valor de 1 a 7";
        }
        System.out.println(dia);
    }
}
