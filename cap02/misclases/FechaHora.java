/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.misclases;

/**
 *
 * @author misae
 */
public class FechaHora extends FechaDetallada {
    
    private int hora; private int minuto; private int segundo;
    public FechaHora(String sFecha,int hora,int min, int seg)
    {
    super(sFecha); this.hora = hora; this.minuto = min; this.segundo = seg;
    }
    public String toString()
    {
    //Invocamos al metodo toString de nuestro padre
    return super.toString()+" ("+hora+":"+minuto+":"+segundo+")";
    }
    
}
