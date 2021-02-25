/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.colecciones;

/**
 *
 * @author misae
 */
public class MiCola<T> {
    private static final int capacidadInicial = 5; private MiColeccion<T> coll = new MiColeccion<T>(capacidadInicial);
    public void encolar(T elm)
    {
     //Agrega el elemento al final de la coleccion
    coll.agregar(elm);
    }
    public T desencolar()
    {
    //Retorna y elimina de la coleccion el primer elemento
    return (T) coll.eliminar(0);
    }
    
}