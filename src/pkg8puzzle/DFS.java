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
public class DFS {
    
    private boolean marked[];
    private int edgeTo[];
    private int distTo[];
    private int sol;
    private Tablero tablero;
    
    public DFS(Grafo g, int s){
        
        this.marked = new boolean[g.V()];
        this.edgeTo = new int[g.V()];
        this.distTo = new int[g.V()];
        
        this.tablero = new Tablero();
        
        dfs(g,s);
        
        System.out.println("------- DFS -------");
        
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
    
    private void dfs(Grafo g, int s){
        
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        
        marked[s] = true;
        edgeTo[s] = -1;
        distTo[s] = 0;
        
        while (!stack.isEmpty()){
            int v = stack.pop();
            Nodo nodo = g.getNodo(v);
            for (int h = 0; h < nodo.numHijos(); h++) {
                int hijo = nodo.getHijo(h);
                if (!marked[hijo]){
                    marked[hijo] = true;
                    edgeTo[hijo] = v;
                    distTo[hijo] = distTo[v] + 1;
                    stack.push(hijo);
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
