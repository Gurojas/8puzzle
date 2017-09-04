/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8puzzle;

/**
 *
 * @author Usuario
 */
public class Nodo {
    
    private int padre;
    private int[][] estado;
    
    
    
    public Nodo(int num, int t[][]){
        this.padre = num;
        this.estado = t;
    }

    public int getNum() {
        return padre;
    }

    public void setNum(int num) {
        this.padre = num;
    }

    public int[][] getT() {
        return estado;
    }

    public void setT(int[][] t) {
        this.estado = t;
    }
    
   
}
