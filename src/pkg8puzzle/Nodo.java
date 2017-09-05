/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8puzzle;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Nodo {
    
    private int padre;
    private int[][] estado;
    private ArrayList<Integer> hijos;

    
    public Nodo(int t[][]){
        this.padre = 0;
        this.estado = t;
        this.hijos = new ArrayList<>();
    }

    public int getPadre() {
        return padre;
    }

    public void setPadre(int num) {
        this.padre = num;
    }

    public int[][] getT() {
        return estado;
    }

    public void setT(int[][] t) {
        this.estado = t;
    }
    
    public void addHijos(int h){
        this.hijos.add(h);
    }
    
    public int getHijo(int i){
        return this.hijos.get(i);
    }
    
    public int numHijos(){
        return this.hijos.size();
    }
   
}
