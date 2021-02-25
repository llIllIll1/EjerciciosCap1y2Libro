/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.instancias;

/**
 *
 * @author misae
 */
public class X {
    private int a;
    private int b;
    public X(int a, int b)
    {
        this.a =a;
        this.b =b;
    }
    
    public String ToString()
    {
        return "("+a+", "+b+")";
    }
}
