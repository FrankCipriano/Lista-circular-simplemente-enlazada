/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listacircularsimplementeenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author frankdev
 */
public class Lista {
    Nodo ultimo;//PUNTERO PARA SABER EL UTLIMO NODO DE LA LISTA
    public Lista(){
        ultimo=null;
    }
    //METODO PARA VERIFICAR SI LA LISTA ESTA VACIA
    public boolean estaVacia(){
        return ultimo==null;
    }
    //METODO PARA INSERTAR NODOS
    public Object insertarNuevo(int edad){
        Nodo nuevo = new Nodo(edad);
        if(!estaVacia()){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        return this;
    }
    //METODO PARA MOSTRAR LISTA
    public void mostrarLista(){
        Nodo auxiliar=ultimo.siguiente;
        String lista="";
        do{
            lista=lista+"["+auxiliar.edad+"]->";
            auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null, lista,
                "Mostrando la lista circular",JOptionPane.INFORMATION_MESSAGE);
    }
    //METODO PARA ELIMINAR UN NODO EN LA LISTA
    public boolean eliminar(int edad){
       Nodo actual=ultimo;
       boolean encontrado=false;
       while(actual.siguiente!=ultimo && !encontrado){
           encontrado=(actual.siguiente.edad==edad);
           if(!encontrado){
               actual=actual.siguiente;
           }
       }
       encontrado=(actual.siguiente.edad==edad);
       if(encontrado){
           Nodo auxiliar=actual.siguiente;
           if(ultimo==ultimo.siguiente){//VERIFICA SI ESTE ES EL UNICO NODO
               ultimo=null;
           }else{
               if(auxiliar==ultimo){
                   ultimo=actual;
               }
               actual.siguiente=auxiliar.siguiente;
           }
           auxiliar=null;
       }
       return encontrado;
    }
}
