/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.misclases;
import Libro.cap02.fechas.Fecha;
/**
 *
 * @author misae
 */
public class FechaDetallada extends Fecha {
    private static String meses[]={"Enero"
                                    ,"Febrero"
                                    ,"Marzo"
                                    ,"Abril"
                                    ,"Mayo"
                                    ,"Junio"
                                    ,"Julio"
                                    ,"Agosto"
                                    ,"Septiembre"
                                    ,"Octubre"
                                    ,"Noviembre"
                                    ,"Diciembre"};
    
    public String toString()
        {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
        }
    
    public static void main(String[] args)
    {
        FechaDetallada f = new FechaDetallada();
        f.setDia(25);
        f.setMes(10);
        f.setAnio(2009);

        System.out.println(f);
    }
    
    public FechaDetallada(String f)
    {
        super (f);
    }
   
    public FechaDetallada (int dia, int mes, int anio)
    {
        super(dia,mes,anio);
    }
    public FechaDetallada()
    {
        //Invocamos al constructor de tres int pasando ceros
        this(0,0,0);
    }
    
}
