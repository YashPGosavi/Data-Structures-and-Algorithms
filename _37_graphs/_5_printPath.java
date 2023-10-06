/*
All paths from Source to Target
        For given sc & tar, print all paths that exist from sre to tar

Src = 0, tar = 5

       0 ------- 1 ------- 3 --- 5 ------- 6
        \                  |   / 
         \                 |  /       
           2 ------------- 4 /
 */

import java.util.*;

public class _5_printPath {

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

    // Print All Path --> TC = O(V^V) 
    public static void printPath(ArrayList<Edge>[]graph, boolean [] visited, int src, int dest, String ans){

        if(src == dest){
            System.out.println(ans);
            return;
            
        }
 
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!visited[e.dest]){        
                visited[src] = true;
                printPath(graph, visited, e.dest, dest, ans+e.dest);
                visited[src] = false;
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        for(int i=0;i<vertex;i++){
            graph[i] = new ArrayList<>();
        }
/*
       0 ------- 1 ------- 3 --- 5 ------- 6
        \                  |   / 
         \                 |  /       
           2 ------------- 4 /
 */
        
        //0
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

         // 1
         graph[1].add(new Edge(1, 0, 0));
         graph[1].add(new Edge(1, 3, 0));
 
         // 2
         graph[2].add(new Edge(2, 0, 0));
         graph[2].add(new Edge(2, 4, 0));
 
         // 3
         graph[3].add(new Edge(3, 1, 0));
         graph[3].add(new Edge(3, 4, 0));
         graph[3].add(new Edge(3, 5, 0));
 
         // 4
         graph[4].add(new Edge(4, 2, 0));
         graph[4].add(new Edge(4, 3, 0));
         graph[4].add(new Edge(4, 5, 0));

         // 5
         graph[5].add(new Edge(5, 3, 0));
         graph[5].add(new Edge(5, 4, 0));
         graph[5].add(new Edge(5, 6, 0));

         // 6
         graph[6].add(new Edge(6, 5, 0));

         int src = 0, dest = 5;
         printPath(graph, new boolean[vertex], src, dest, "0" );
    }
    
}
