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
public class BFS {
    
    private boolean marked[];
    private int distTo[];
    private int edgeTo[];
    private Tablero tablero;
    
    private int sol;
    private int total;
    
    
    public BFS(Grafo g, int s){
        
        
        this.marked = new boolean[g.V()];
        this.distTo = new int[g.V()];
        this.edgeTo = new int[g.V()];
        this.marked = new boolean[g.V()];
        
        
        this.tablero = new Tablero();
        
        this.bfs(g, s);
        
        System.out.println("------- BFS --------");
        
        System.out.println("Numero de nodos recorridos: "+this.sol);
        System.out.println("Numero de nodos desde la raiz hasta la solucion: "+this.distTo[this.sol]);
        
        
        System.out.println("----- Camino de la solucion ------");
        
        while (sol != -1){
            Nodo n = g.getNodo(sol);
            System.out.println("Nodo "+sol);
            tablero.imprimirTablero(n.getT());
            sol = edgeTo[sol];
        }
        
        
        
    }

    
    private void bfs(Grafo g, int s){
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(s);
        
        marked[s] = true;
        distTo[s] = 0;
        edgeTo[s] = -1;
        
        while(!queue.isEmpty()){
            int v = queue.dequeue();
            Nodo nodo = g.getNodo(v);
            for (int h = 0; h < nodo.numHijos(); h++) {
                int hijo = nodo.getHijo(h);
                if (!marked[hijo]){
                    queue.enqueue(hijo);
                    marked[hijo] = true;
                    edgeTo[hijo] = v;
                    distTo[hijo] = distTo[v] + 1;
                    Nodo n = g.getNodo(hijo);
                    if (tablero.esFinal(n.getT())){
                        this.sol = hijo;
                        return;
                    }
                }
            }
        }   
    }    
}

