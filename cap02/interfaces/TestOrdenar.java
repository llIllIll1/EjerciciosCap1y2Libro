/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.interfaces;

/**
 *
 * @author misae
 */
public class TestOrdenar {
    public static void main(String[]args)
    {
        //Defino un array de alumnos
        Alumno arr[] = { new Alumno("Juan",20,8.5)
        , new Alumno("Pedro",18,5.3)
        , new Alumno("Alberto",19,4.6) };

        Util.ordenar(arr);
        muestraArray(arr);
        
        String[] arr2 = { "Pablo","Andres","Marcelo" };
        Util.ordenar(arr2);
        muestraArray(arr2);
        
        // defino, ordeno y muestro un array de integers
        Integer[] arr3 = { new Integer(5)
        , new Integer(3)
        , new Integer(1) };
    }
        //Lo muestro ordenado
       
        @SuppressWarnings ("unchecked")
         private static void muestraArray(Comparable arr[])
        {
            for( int i=0; i<arr.length; i++ )
            {
                System.out.println(arr[i]);
            }
        }
    }

