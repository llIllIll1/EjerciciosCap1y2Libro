/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.fechas;

/**
 *
 * @author misae
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    
    public int getDia()
    {
        //Retornar el valor de la variable
        return dia;
    }
    
    public void setDia(int dia)
    {
        //Asigna elv alor del parametro a la va riable dia
        this.dia = dia;
    }
    public int getMes()
    {
        return mes;
    }
    public void setMes(int mes)
    {
        this.mes = mes;
    }
     public int getAnio()
     {
         return anio;
     }
     public void setAnio(int anio)
     {
         this.anio = anio;
     }
    
    public String toString()
    {
        return dia+ "/" +mes+"/" +anio;
    }
    
    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return(dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }
    
    public Fecha(int d, int m, int a)
    {
        dia = d;
        mes = m;
        anio = a;
    }
    public Fecha()
    {
        
    }
    
    public Fecha(String s)
    {
        //Busca la primera ocurrencia de '/'
        int pos1= s.indexOf('/');
        // busco la ultima ocurrencia de '/'
        int pos2=s.lastIndexOf('/');

        //Proceso el dia
        String sDia=s.substring(0,pos1);
        dia = Integer.parseInt(sDia);
        //Proceso el mes
        String sMes=s.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);

        //Proceso el anio
        String sAnio = s.substring(pos2+1);
        anio = Integer.parseInt(sAnio);
        
    }
    
     private int fechaToDias()
    {
        return  anio*360+mes*30+dia;
    }
    
    //Asigna la fecha expresada en dias a los atributos
    private void diasToFecha(int i)
    {
    //Dividimos por 360 y obtenemos el anio
    anio = (int)i/360;

    //Del resto de la division anterior
    //Podremos obtener el mes y el dia
    int resto = i % 360;

    //El mes es el resto dividido 30
    mes = (int) resto/30;

    //El resto de la division anterior son los dias
    dia = resto % 30;

    //Ajuste por si dia quedo en cero
    if( dia == 0)
    {
    dia=30;
    mes--;
    }

    //Ajuste por si el mes quedo en cero
        if( mes == 0)
        {
        mes=12;
        anio--;
        }
    }
    public void addDias(int d)
    {
    //Convierto la fecha a dias y le sumo d
    int sum=fechaToDias()+d;

    //La fecha resultante (sum) la separo en dia, mes y anio
    diasToFecha(sum);
    }
}
