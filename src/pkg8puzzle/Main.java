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
       
       Grafo g = new Grafo(10);
       
       Nodo root = new Nodo(0,t.tableroInicial());
       g.addEdge(root.getNum(), root);
       
        for (int i = 0; i < g.V(); i++) {
            Nodo n = g.getNodo(i);
            if (n != null){
                ArrayList<int[][]> movs = t.getMoves(n.getT());
                for (int j = 0; j < movs.size(); j++) {
                    t.imprimirTablero(movs.get(j));
                    n.getAdj().add(j+1);
                    Nodo ni = new Nodo(j+1,movs.get(j)); 
                    g.addEdge(ni.getNum(), ni);
                }
            }
            
        }
          

    }
    
    
    
}
