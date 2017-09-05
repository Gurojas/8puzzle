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
public class Busqueda {
    
    
    
    public static boolean hayRepeticion(int m[][], int n[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (m[i][j] != n[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
}
