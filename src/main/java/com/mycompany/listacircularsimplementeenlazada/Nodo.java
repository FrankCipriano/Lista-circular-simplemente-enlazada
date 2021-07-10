/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listacircularsimplementeenlazada;

/**
 *
 * @author frankdev
 */
public class Nodo {
    int edad;
    Nodo siguiente;
    //CONSTRUCTOR PARA CREAR UN NUEVO NODO
    public Nodo(int edad){
        this.edad=edad;
        this.siguiente=this;
    }
}
