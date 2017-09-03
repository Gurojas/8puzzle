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
    
    private int num;
    private int t[][];
    private Bag<Integer> adj;
    
    
    public Nodo(int num, int t[][]){
        this.num = num;
        this.t = t;
        this.adj = new Bag<>();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[][] getT() {
        return t;
    }

    public void setT(int[][] t) {
        this.t = t;
    }

    public Bag<Integer> getAdj() {
        return adj;
    }
    
    
    
    /**
     * Returns the vertices adjacent to vertex {@code v}.
     *
     * @param  v the vertex
     * @return the vertices adjacent to vertex {@code v}, as an iterable
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<Integer> adj() {
        return adj;
    }
    
    
    
}
