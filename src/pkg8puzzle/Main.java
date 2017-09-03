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
          
       ArrayList<int[][]> movs = t.getMoves(t.tableroInicial());
       
       
       Estado e0 = new Estado(0,t.tableroInicial());
       
       ArrayList<Estado> estados = new ArrayList<>();
       estados.add(e0);
       
       
        for (int i = 0; i < movs.size(); i++) {
            //t.imprimirTablero(movs.get(i));
            Estado e = new Estado(i+1,movs.get(i));
            estados.add(e);
        }
        
        
        System.out.println(estados.size());
        
        
        
        
    }
    
    
    
}
