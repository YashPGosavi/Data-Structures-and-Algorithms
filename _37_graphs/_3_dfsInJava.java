/*
* Depth First Search
 
1. DFS is an algorithm that visits each node in a graph or tree as deep as possible before backtracking. This algorithm follows the LIFO (Last-In-First-Out) stack data structure. It starts from a root node and explores as far as possible along each branch before backtracking. 
2. It uses a stack data structure to keep track of the nodes to be visited.
3. DFS can traverse an entire graph or tree in linear time, but it is not guaranteed to find the shortest path between two nodes. It is often used in applications such as maze solving, topological sorting, and graph coloring.

        * Here is how DFS works:
                1. Push the starting node onto the stack and mark it as visited.
                2. Pop a node from the top of the stack, visit it, and push all its unvisited neighbors onto the stack.
                3. Repeat step 2 for the node at the top of the stack until the stack is empty.


Applications of DFS:
    1. Topological Sorting
    2. Cycle detection
    3. Solve maze problem
   
 */

import java.util.ArrayList;

public class _3_dfsInJava {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    //dfs TC = O(V+E)
    public static void dfs(ArrayList<Edge>[]graph, int curr, boolean visited[]){

        System.out.print(curr+" ");
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph, e.dest,visited);
            }
        }
    }
    public static void main(String[] args) {
        
/*
            
        0 ------ 1
                 /\
                /  \ 
               /    \
             2 ------ 3
             |
             |  
             |
             4
*/
        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        
        for(int i=0;i<vertex;i++){
            graph[i]= new ArrayList<>();
        }

         // 0
         graph[0].add(new Edge(0, 1, 2));

         // 1
         graph[1].add(new Edge(1, 0, 2));
         graph[1].add(new Edge(1, 2, 4));
         graph[1].add(new Edge(1, 3, 3));
 
         // 2
         graph[2].add(new Edge(2, 1, 4));
         graph[2].add(new Edge(2, 4, 2));
 
         // 3
         graph[3].add(new Edge(3, 1, 3));
 
         // 4
         graph[4].add(new Edge(4, 2, 2));


         dfs(graph,0,new boolean[vertex]);
        
    }    
}
