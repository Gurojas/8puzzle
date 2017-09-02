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
public class Tablero {
    
    private final int n = 3;
    private int t0[][] = {{8,4,6},{5,0,7},{2,3,1}};

        
    public Tablero(){
        
    }
    
    /*
    public int numMovs(int t[][]){
        int i0 = this.i0(t);
        int j0 = this.j0(t);
        
        int movs = 0;
        
        if (i0 == 1 && j0 == 1){
            movs = 4;
        }
        else if (i0 == 0 && j0 == 0 || i0 == 0 && j0 == n-1 || i0 == n-1 && j0 == 0 || i0 == n-1 && j0 == n-1){
            movs = 2;
        }
        else{
            movs = 3;
        }
        
        
        return movs;
        
    }
    */
    
    
    private int[][] clonar(int t[][]){
        int clone[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                clone[i][j] = t[i][j];
            }
        }
        return clone;
    }
    
    
    
    public ArrayList<int[][]> getMoves(int t[][]){
        
        ArrayList<int[][]> movs = new ArrayList<>();
        
        int i0 = this.i0(t); // posicion i del espacio en blanco de la matriz clonada
        int j0 = this.j0(t); // posicion j del espacio en blanco de la matriz clonada
        
        // Ahora yo se la posicion (i,j) del espacio en blanco
        int aux;
        int clone[][] = this.clonar(t);
        if (i0 - 1 >= 0){
            aux = t[i0-1][j0];
            clone[i0-1][j0] = 0;
            clone[i0][j0] = aux;
            movs.add(clone);
            clone = this.clonar(t);
        }
        if (j0 - 1 >= 0){
            aux = t[i0][j0-1];
            clone[i0][j0-1] = 0;
            clone[i0][j0] = aux;
            movs.add(clone);
            clone = this.clonar(t);
        }
        if (i0 + 1 < n){
            aux = t[i0+1][j0];
            clone[i0+1][j0] = 0;
            clone[i0][j0] = aux;
            movs.add(clone);
            clone = this.clonar(t);
        }
        if (j0 + 1 < n){
            aux = t[i0][j0+1];
            clone[i0][j0+1] = 0;
            clone[i0][j0] = aux;
            movs.add(clone);
            clone = this.clonar(t);
        }
        
        return movs;
    }
   
    
    private int i0(int tab[][]){
        int i0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tab[i][j] == 0){
                    i0 = i;
                    return i0;
                }
            }
        }
        return 0;
    }
    
    private int j0(int tab[][]){
        int j0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tab[i][j] == 0){
                    j0 = j;
                    return j0;
                }
            }
        }
        return 0;
    }
       
    
    public void imprimirTablero(int t[][]){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("----------------");
    }
    
    public int[][] tableroInicial(){
        return this.t0;
    }
}
