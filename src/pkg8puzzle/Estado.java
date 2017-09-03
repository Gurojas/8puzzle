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
public class Estado {
    
    private int num;
    private int t[][];
    
    
    public Estado(int num, int t[][]){
        this.num = num;
        this.t = t;
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
    
    
    
}
