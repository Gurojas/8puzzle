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
        
        
        /* Inicializo un objeto de la clase Tablero, el cual tendra el estado inicial y final */
        Tablero t = new Tablero(); 
        /* Inicializo el grafo */
        System.out.println("----- Tablero inicial -------");
        t.imprimirTablero(t.tableroInicial());
        System.out.println("----- Tablero final -------");
        t.imprimirTablero(t.tableroFinal());
        

        Grafo g = new Grafo();
        Nodo raiz = new Nodo(t.tableroInicial());
        
        
        g.addEdge(0, raiz); // agrego el nodo raiz
        
        int max = g.V();   
        int padre = 0;
        int pos = 1;
        
        raiz.setPadre(-1);
        
        boolean solucion = false;
       
        
        while (!solucion) {
            Nodo n = g.getNodo(padre);
            
            /* Metodo para no hacer ciclos ancestrales */
 
            ArrayList<int [][]> movs = t.getMoves(n.getT());
            for (int i = 0; i < movs.size(); i++) {

                Nodo hijo = new Nodo(movs.get(i));
                hijo.setPadre(padre);

                boolean repeticion = false;
                int padreAux = hijo.getPadre();
                while (padreAux != -1){ // -1 es el padre del nodo raiz
                    repeticion = Busqueda.hayRepeticion(hijo.getT(), g.getNodo(padreAux).getT());
                    if (repeticion){
                        break;
                    }
                    padreAux = g.getNodo(padreAux).getPadre();
                }

                if(!repeticion){
                    n.addHijos(pos);

                    //System.out.println("Hijos de "+padre);
                    //System.out.println(pos); 
                    //t.imprimirTablero(hijo.getT());
                    //hijo.setPadre(padre); 
                    g.addEdge(pos, hijo);
                    pos = pos + 1;

                    /* Aca compruebo si hay solucion */
                    if (t.esFinal(hijo.getT())){
                        solucion = true;
                        break;
                    }
                }
            }
            padre++;
        }
        


        BFS bfs = new BFS(g,0);
        DFS dfs = new DFS(g,0);
        


    }
    
    
    
}
