/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.colecciones;
import java.util.Scanner;

/**
 *
 * @author misae
 */
public class TestMiColeccion {
    
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        String nom=scanner.next();
        //Instancio una MiColeccion "especializada" en String
        MiColeccion<String> mc = new MiColeccion<String>(5);
        while( !nom.equals("FIN") )
        {
            mc.insertar(nom,0);
            nom=scanner.next();
        }

        String aux;
        for(int i=0; i<mc.cantidad(); i++ )
        {
            //No es necesario castear porque el metodo obtener
            //Retorna un String
            aux = (String) mc.obtener(i);
            System.out.println(aux +" - "+aux.length()+" caracteres");
        }
        
    }
}