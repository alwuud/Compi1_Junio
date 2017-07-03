/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.util.ArrayList;

/**
 *
 * @author alwud
 */
public class Nodo {

    public enum Tipo {
        Generico, Suma , Resta, Division, Multiplicacion, Potencia, NAND, NOR, NOT, AND, OR ,XOR,
        Entero, Decimal, Cadena, Booleana, Caracter, Dato
    }

    Tipo tipo;
    
    String valor;
    
    ArrayList<Nodo> hijos;
    
    public Nodo(String valor){
        this.valor= valor;
        hijos= new ArrayList();
    }
    


    public void setTipo(Tipo tipo){
        this.tipo= tipo;
    }

    public Tipo getTipo(){
        return this.tipo;
    }
    
    public Nodo getHijo(int index){
        try{
            return hijos.get(index);
        }catch(Exception e){
            return null;
        }
    }
    
    public boolean agregarHijo(Nodo hijo){
        try{
             hijos.add(hijo);
        }   catch(Exception e){
            return false;
            
        }
        return true;
    }
    
}
