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
        
        Nodo raiz = new Nodo(t.tableroInicial());
        raiz.setPadre(0);
        
        g.addEdge(0, raiz); // agrego el nodo raiz
        
        int max = g.V();   
        int padre = 0;
        int pos = 1;
        
        while (pos < max) {
            Nodo n = g.getNodo(padre);
            ArrayList<int [][]> movs = t.getMoves(n.getT());
            for (int i = 0; i < movs.size(); i++) {

                Nodo hijo = new Nodo(movs.get(i));
                hijo.setPadre(padre); 
                g.addEdge(pos, hijo);  
                pos = pos + 1;
            }
            padre++;
        }
        
        
        for (int i = 0; i < max; i++) {
            Nodo n = g.getNodo(i);
            System.out.println(n.getPadre());
        }
        
        
        
        
        
        
       

    }
    
    
    
}
