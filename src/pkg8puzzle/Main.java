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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Tablero t = new Tablero();
          
       int m[][] = {{8,0,6},{5,4,7},{2,3,1}};
       
       int m1[][] = {{8,4,6},{5,0,7},{2,3,1}};
       
       Nodo e = new Nodo(0,m);
       e.getAdj().add(1);
       e.getAdj().add(2);
       
        for (int i : e.adj()) {
            System.out.println(i);
        }
       
       
       
       
        
       
       
      
                
       
       
      
       
       
        
        
        
        
        
    }
    
    
    
}
