/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02;
import Libro.cap02.fechas.Fecha;
import Libro.cap02.misclases.FechaDetallada;

/**
 *
 * @author misae
 */
public class TestPolimorfismo {
    public static void main(String[]args)
    {
        //A fec (de tipo Fecha) le asigno un objeto FechaDetallada
        Fecha fec = new FechaDetallada("25/02/2009");
        //A obj (de tipo Object) le asigno un objeto FechaDetallada
        Object obj = new FechaDetallada("3/12/2008");
        // Imprimo los dos objetos
        System.out.println("fec = "+fec); //Invoca a toString de fec
        System.out.println("obj = "+obj); //Invoca a toString de obj
    }
}
