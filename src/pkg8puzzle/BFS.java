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
    
    
    public BFS(Grafo g, int s){
        this.marked = new boolean[g.V()];
        this.distTo = new int[g.V()];
        this.edgeTo = new int[g.V()];
        this.marked = new boolean[g.V()];
        bfs(g,s);
        
        
        
        for (int i = 0; i < this.edgeTo.length; i++) {
            System.out.println(this.edgeTo[i]);
        }
                

        
    }
    
    private void bfs(Grafo g, int s){
        Queue<Integer> q = new Queue<>();
        q.enqueue(s);
        
        marked[s] = true;
        distTo[s] = 0;
        
        
        while(!q.isEmpty()){
            int v = q.dequeue();
            Nodo nodo = g.getNodo(v);
            for (int h = 0; h < nodo.numHijos(); h++) {
                int hijo = nodo.getHijo(h);
                if (!marked[hijo]){
                    q.enqueue(hijo);
                    marked[hijo] = true;
                    edgeTo[hijo] = v;
                    distTo[hijo] = distTo[v] + 1;
                }
            }
        }    
    }
    
    
}

