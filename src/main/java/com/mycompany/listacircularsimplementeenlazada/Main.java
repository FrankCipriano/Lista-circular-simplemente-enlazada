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
public class Main {
    public static void main(String args[]){
        Lista lista = new Lista();
        int opc=0,edad;
        do{
            try{
                opc=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Ingresar dato a la lista\n"
                        + "2. Eliminar un dato en la lista\n"
                        + "3. Mostrar la lista\n"
                        + "4. Salir\n"
                        + "Ingrese una opcion..!!",
                        "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch(opc){
                    case 1:
                        edad=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese tu edad","Ingresando dato a la lista",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.insertarNuevo(edad);
                        break;
                    case 2:
                        if(!lista.estaVacia()){
                            edad=Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el dato que desea eliminar","Eliminar un dato en la lista",
                                    JOptionPane.INFORMATION_MESSAGE));
                            boolean eliminado=lista.eliminar(edad);
                            if(eliminado){
                                JOptionPane.showMessageDialog(null, edad+": eliminado");
                            }else{
                                JOptionPane.showMessageDialog(null, edad+": No se encontro en la lista");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "Lista Vacia, no hay nada que eliminar");
                        }
                        break;
                    case 3:
                        if(!lista.estaVacia()){
                            lista.mostrarLista();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nada que mostrar");
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar los servicios de FrankDev");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no se encuentra dentro del menu");
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error"+ex);
            }
        }while(opc!=4);
    }
}
